package rw.co.snw.web.rest;

import rw.co.snw.EprocurementApp;

import rw.co.snw.domain.Client;
import rw.co.snw.repository.ClientRepository;
import rw.co.snw.service.ClientService;
import rw.co.snw.service.dto.ClientDTO;
import rw.co.snw.service.mapper.ClientMapper;
import rw.co.snw.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.util.List;


import static rw.co.snw.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the ClientResource REST controller.
 *
 * @see ClientResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EprocurementApp.class)
public class ClientResourceIntTest {

    private static final String DEFAULT_CLIENT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_TIN_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_TIN_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_ADDRESS = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_ADDRESS = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_PO_BOX = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_PO_BOX = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_CELL_PHONE_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_CELL_PHONE_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_TEL_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_TEL_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_EMAIL_ADDRESS = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_EMAIL_ADDRESS = "BBBBBBBBBB";

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientService clientService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restClientMockMvc;

    private Client client;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final ClientResource clientResource = new ClientResource(clientService,clientRepository);
        this.restClientMockMvc = MockMvcBuilders.standaloneSetup(clientResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Client createEntity(EntityManager em) {
        Client client = new Client()
            .clientName(DEFAULT_CLIENT_NAME)
            .clientTINNumber(DEFAULT_CLIENT_TIN_NUMBER)
            .clientAddress(DEFAULT_CLIENT_ADDRESS)
            .clientPoBox(DEFAULT_CLIENT_PO_BOX)
            .clientCellPhoneNumber(DEFAULT_CLIENT_CELL_PHONE_NUMBER)
            .clientTelNumber(DEFAULT_CLIENT_TEL_NUMBER)
            .clientEmailAddress(DEFAULT_CLIENT_EMAIL_ADDRESS);
        return client;
    }

    @Before
    public void initTest() {
        client = createEntity(em);
    }

    @Test
    @Transactional
    public void createClient() throws Exception {
        int databaseSizeBeforeCreate = clientRepository.findAll().size();

        // Create the Client
        ClientDTO clientDTO = clientMapper.toDto(client);
        restClientMockMvc.perform(post("/api/clients")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(clientDTO)))
            .andExpect(status().isCreated());

        // Validate the Client in the database
        List<Client> clientList = clientRepository.findAll();
        assertThat(clientList).hasSize(databaseSizeBeforeCreate + 1);
        Client testClient = clientList.get(clientList.size() - 1);
        assertThat(testClient.getClientName()).isEqualTo(DEFAULT_CLIENT_NAME);
        assertThat(testClient.getClientTINNumber()).isEqualTo(DEFAULT_CLIENT_TIN_NUMBER);
        assertThat(testClient.getClientAddress()).isEqualTo(DEFAULT_CLIENT_ADDRESS);
        assertThat(testClient.getClientPoBox()).isEqualTo(DEFAULT_CLIENT_PO_BOX);
        assertThat(testClient.getClientCellPhoneNumber()).isEqualTo(DEFAULT_CLIENT_CELL_PHONE_NUMBER);
        assertThat(testClient.getClientTelNumber()).isEqualTo(DEFAULT_CLIENT_TEL_NUMBER);
        assertThat(testClient.getClientEmailAddress()).isEqualTo(DEFAULT_CLIENT_EMAIL_ADDRESS);
    }

    @Test
    @Transactional
    public void createClientWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = clientRepository.findAll().size();

        // Create the Client with an existing ID
        client.setId(1L);
        ClientDTO clientDTO = clientMapper.toDto(client);

        // An entity with an existing ID cannot be created, so this API call must fail
        restClientMockMvc.perform(post("/api/clients")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(clientDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Client in the database
        List<Client> clientList = clientRepository.findAll();
        assertThat(clientList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllClients() throws Exception {
        // Initialize the database
        clientRepository.saveAndFlush(client);

        // Get all the clientList
        restClientMockMvc.perform(get("/api/clients?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(client.getId().intValue())))
            .andExpect(jsonPath("$.[*].clientName").value(hasItem(DEFAULT_CLIENT_NAME.toString())))
            .andExpect(jsonPath("$.[*].clientTINNumber").value(hasItem(DEFAULT_CLIENT_TIN_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].clientAddress").value(hasItem(DEFAULT_CLIENT_ADDRESS.toString())))
            .andExpect(jsonPath("$.[*].clientPoBox").value(hasItem(DEFAULT_CLIENT_PO_BOX.toString())))
            .andExpect(jsonPath("$.[*].clientCellPhoneNumber").value(hasItem(DEFAULT_CLIENT_CELL_PHONE_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].clientTelNumber").value(hasItem(DEFAULT_CLIENT_TEL_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].clientEmailAddress").value(hasItem(DEFAULT_CLIENT_EMAIL_ADDRESS.toString())));
    }
    
    @Test
    @Transactional
    public void getClient() throws Exception {
        // Initialize the database
        clientRepository.saveAndFlush(client);

        // Get the client
        restClientMockMvc.perform(get("/api/clients/{id}", client.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(client.getId().intValue()))
            .andExpect(jsonPath("$.clientName").value(DEFAULT_CLIENT_NAME.toString()))
            .andExpect(jsonPath("$.clientTINNumber").value(DEFAULT_CLIENT_TIN_NUMBER.toString()))
            .andExpect(jsonPath("$.clientAddress").value(DEFAULT_CLIENT_ADDRESS.toString()))
            .andExpect(jsonPath("$.clientPoBox").value(DEFAULT_CLIENT_PO_BOX.toString()))
            .andExpect(jsonPath("$.clientCellPhoneNumber").value(DEFAULT_CLIENT_CELL_PHONE_NUMBER.toString()))
            .andExpect(jsonPath("$.clientTelNumber").value(DEFAULT_CLIENT_TEL_NUMBER.toString()))
            .andExpect(jsonPath("$.clientEmailAddress").value(DEFAULT_CLIENT_EMAIL_ADDRESS.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingClient() throws Exception {
        // Get the client
        restClientMockMvc.perform(get("/api/clients/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateClient() throws Exception {
        // Initialize the database
        clientRepository.saveAndFlush(client);

        int databaseSizeBeforeUpdate = clientRepository.findAll().size();

        // Update the client
        Client updatedClient = clientRepository.findById(client.getId()).get();
        // Disconnect from session so that the updates on updatedClient are not directly saved in db
        em.detach(updatedClient);
        updatedClient
            .clientName(UPDATED_CLIENT_NAME)
            .clientTINNumber(UPDATED_CLIENT_TIN_NUMBER)
            .clientAddress(UPDATED_CLIENT_ADDRESS)
            .clientPoBox(UPDATED_CLIENT_PO_BOX)
            .clientCellPhoneNumber(UPDATED_CLIENT_CELL_PHONE_NUMBER)
            .clientTelNumber(UPDATED_CLIENT_TEL_NUMBER)
            .clientEmailAddress(UPDATED_CLIENT_EMAIL_ADDRESS);
        ClientDTO clientDTO = clientMapper.toDto(updatedClient);

        restClientMockMvc.perform(put("/api/clients")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(clientDTO)))
            .andExpect(status().isOk());

        // Validate the Client in the database
        List<Client> clientList = clientRepository.findAll();
        assertThat(clientList).hasSize(databaseSizeBeforeUpdate);
        Client testClient = clientList.get(clientList.size() - 1);
        assertThat(testClient.getClientName()).isEqualTo(UPDATED_CLIENT_NAME);
        assertThat(testClient.getClientTINNumber()).isEqualTo(UPDATED_CLIENT_TIN_NUMBER);
        assertThat(testClient.getClientAddress()).isEqualTo(UPDATED_CLIENT_ADDRESS);
        assertThat(testClient.getClientPoBox()).isEqualTo(UPDATED_CLIENT_PO_BOX);
        assertThat(testClient.getClientCellPhoneNumber()).isEqualTo(UPDATED_CLIENT_CELL_PHONE_NUMBER);
        assertThat(testClient.getClientTelNumber()).isEqualTo(UPDATED_CLIENT_TEL_NUMBER);
        assertThat(testClient.getClientEmailAddress()).isEqualTo(UPDATED_CLIENT_EMAIL_ADDRESS);
    }

    @Test
    @Transactional
    public void updateNonExistingClient() throws Exception {
        int databaseSizeBeforeUpdate = clientRepository.findAll().size();

        // Create the Client
        ClientDTO clientDTO = clientMapper.toDto(client);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restClientMockMvc.perform(put("/api/clients")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(clientDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Client in the database
        List<Client> clientList = clientRepository.findAll();
        assertThat(clientList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteClient() throws Exception {
        // Initialize the database
        clientRepository.saveAndFlush(client);

        int databaseSizeBeforeDelete = clientRepository.findAll().size();

        // Delete the client
        restClientMockMvc.perform(delete("/api/clients/{id}", client.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Client> clientList = clientRepository.findAll();
        assertThat(clientList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Client.class);
        Client client1 = new Client();
        client1.setId(1L);
        Client client2 = new Client();
        client2.setId(client1.getId());
        assertThat(client1).isEqualTo(client2);
        client2.setId(2L);
        assertThat(client1).isNotEqualTo(client2);
        client1.setId(null);
        assertThat(client1).isNotEqualTo(client2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ClientDTO.class);
        ClientDTO clientDTO1 = new ClientDTO();
        clientDTO1.setId(1L);
        ClientDTO clientDTO2 = new ClientDTO();
        assertThat(clientDTO1).isNotEqualTo(clientDTO2);
        clientDTO2.setId(clientDTO1.getId());
        assertThat(clientDTO1).isEqualTo(clientDTO2);
        clientDTO2.setId(2L);
        assertThat(clientDTO1).isNotEqualTo(clientDTO2);
        clientDTO1.setId(null);
        assertThat(clientDTO1).isNotEqualTo(clientDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(clientMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(clientMapper.fromId(null)).isNull();
    }
}
