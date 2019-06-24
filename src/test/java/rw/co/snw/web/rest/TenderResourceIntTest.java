package rw.co.snw.web.rest;

import rw.co.snw.EprocurementApp;

import rw.co.snw.domain.Tender;
import rw.co.snw.repository.TenderRepository;
import rw.co.snw.service.TenderService;
import rw.co.snw.service.dto.TenderDTO;
import rw.co.snw.service.mapper.TenderMapper;
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
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;


import static rw.co.snw.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the TenderResource REST controller.
 *
 * @see TenderResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EprocurementApp.class)
public class TenderResourceIntTest {

    private static final String DEFAULT_TENDER_REF_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_TENDER_REF_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_TENDER_REF_NAME = "AAAAAAAAAA";
    private static final String UPDATED_TENDER_REF_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_TENDER_PE_NAME = "AAAAAAAAAA";
    private static final String UPDATED_TENDER_PE_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_TENDER_PE_CODE = "AAAAAAAAAA";
    private static final String UPDATED_TENDER_PE_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_TENDER_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_TENDER_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_TENDER_METHOD = "AAAAAAAAAA";
    private static final String UPDATED_TENDER_METHOD = "BBBBBBBBBB";

    private static final String DEFAULT_TENDER_ON_OFF = "AAAAAAAAAA";
    private static final String UPDATED_TENDER_ON_OFF = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_TENDER_PUBLIC_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TENDER_PUBLIC_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TENDER_RECEIVE_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TENDER_RECEIVE_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TENDER_DEAD_LINE_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TENDER_DEAD_LINE_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TENDER_OPEN_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TENDER_OPEN_DATE = LocalDate.now(ZoneId.systemDefault());

    @Autowired
    private TenderRepository tenderRepository;

    @Autowired
    private TenderMapper tenderMapper;

    @Autowired
    private TenderService tenderService;

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

    private MockMvc restTenderMockMvc;

    private Tender tender;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final TenderResource tenderResource = new TenderResource(tenderService);
        this.restTenderMockMvc = MockMvcBuilders.standaloneSetup(tenderResource)
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
    public static Tender createEntity(EntityManager em) {
        Tender tender = new Tender()
            .tenderRefNumber(DEFAULT_TENDER_REF_NUMBER)
            .tenderRefName(DEFAULT_TENDER_REF_NAME)
            .tenderPEName(DEFAULT_TENDER_PE_NAME)
            .tenderPECode(DEFAULT_TENDER_PE_CODE)
            .tenderType(DEFAULT_TENDER_TYPE)
            .tenderMethod(DEFAULT_TENDER_METHOD)
            .tenderOnOff(DEFAULT_TENDER_ON_OFF)
            .tenderPublicDate(DEFAULT_TENDER_PUBLIC_DATE)
            .tenderReceiveDate(DEFAULT_TENDER_RECEIVE_DATE)
            .tenderDeadLineDate(DEFAULT_TENDER_DEAD_LINE_DATE)
            .tenderOpenDate(DEFAULT_TENDER_OPEN_DATE);
        return tender;
    }

    @Before
    public void initTest() {
        tender = createEntity(em);
    }

    @Test
    @Transactional
    public void createTender() throws Exception {
        int databaseSizeBeforeCreate = tenderRepository.findAll().size();

        // Create the Tender
        TenderDTO tenderDTO = tenderMapper.toDto(tender);
        restTenderMockMvc.perform(post("/api/tenders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(tenderDTO)))
            .andExpect(status().isCreated());

        // Validate the Tender in the database
        List<Tender> tenderList = tenderRepository.findAll();
        assertThat(tenderList).hasSize(databaseSizeBeforeCreate + 1);
        Tender testTender = tenderList.get(tenderList.size() - 1);
        assertThat(testTender.getTenderRefNumber()).isEqualTo(DEFAULT_TENDER_REF_NUMBER);
        assertThat(testTender.getTenderRefName()).isEqualTo(DEFAULT_TENDER_REF_NAME);
        assertThat(testTender.getTenderPEName()).isEqualTo(DEFAULT_TENDER_PE_NAME);
        assertThat(testTender.getTenderPECode()).isEqualTo(DEFAULT_TENDER_PE_CODE);
        assertThat(testTender.getTenderType()).isEqualTo(DEFAULT_TENDER_TYPE);
        assertThat(testTender.getTenderMethod()).isEqualTo(DEFAULT_TENDER_METHOD);
        assertThat(testTender.getTenderOnOff()).isEqualTo(DEFAULT_TENDER_ON_OFF);
        assertThat(testTender.getTenderPublicDate()).isEqualTo(DEFAULT_TENDER_PUBLIC_DATE);
        assertThat(testTender.getTenderReceiveDate()).isEqualTo(DEFAULT_TENDER_RECEIVE_DATE);
        assertThat(testTender.getTenderDeadLineDate()).isEqualTo(DEFAULT_TENDER_DEAD_LINE_DATE);
        assertThat(testTender.getTenderOpenDate()).isEqualTo(DEFAULT_TENDER_OPEN_DATE);
    }

    @Test
    @Transactional
    public void createTenderWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = tenderRepository.findAll().size();

        // Create the Tender with an existing ID
        tender.setId(1L);
        TenderDTO tenderDTO = tenderMapper.toDto(tender);

        // An entity with an existing ID cannot be created, so this API call must fail
        restTenderMockMvc.perform(post("/api/tenders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(tenderDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Tender in the database
        List<Tender> tenderList = tenderRepository.findAll();
        assertThat(tenderList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllTenders() throws Exception {
        // Initialize the database
        tenderRepository.saveAndFlush(tender);

        // Get all the tenderList
        restTenderMockMvc.perform(get("/api/tenders?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(tender.getId().intValue())))
            .andExpect(jsonPath("$.[*].tenderRefNumber").value(hasItem(DEFAULT_TENDER_REF_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].tenderRefName").value(hasItem(DEFAULT_TENDER_REF_NAME.toString())))
            .andExpect(jsonPath("$.[*].tenderPEName").value(hasItem(DEFAULT_TENDER_PE_NAME.toString())))
            .andExpect(jsonPath("$.[*].tenderPECode").value(hasItem(DEFAULT_TENDER_PE_CODE.toString())))
            .andExpect(jsonPath("$.[*].tenderType").value(hasItem(DEFAULT_TENDER_TYPE.toString())))
            .andExpect(jsonPath("$.[*].tenderMethod").value(hasItem(DEFAULT_TENDER_METHOD.toString())))
            .andExpect(jsonPath("$.[*].tenderOnOff").value(hasItem(DEFAULT_TENDER_ON_OFF.toString())))
            .andExpect(jsonPath("$.[*].tenderPublicDate").value(hasItem(DEFAULT_TENDER_PUBLIC_DATE.toString())))
            .andExpect(jsonPath("$.[*].tenderReceiveDate").value(hasItem(DEFAULT_TENDER_RECEIVE_DATE.toString())))
            .andExpect(jsonPath("$.[*].tenderDeadLineDate").value(hasItem(DEFAULT_TENDER_DEAD_LINE_DATE.toString())))
            .andExpect(jsonPath("$.[*].tenderOpenDate").value(hasItem(DEFAULT_TENDER_OPEN_DATE.toString())));
    }
    
    @Test
    @Transactional
    public void getTender() throws Exception {
        // Initialize the database
        tenderRepository.saveAndFlush(tender);

        // Get the tender
        restTenderMockMvc.perform(get("/api/tenders/{id}", tender.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(tender.getId().intValue()))
            .andExpect(jsonPath("$.tenderRefNumber").value(DEFAULT_TENDER_REF_NUMBER.toString()))
            .andExpect(jsonPath("$.tenderRefName").value(DEFAULT_TENDER_REF_NAME.toString()))
            .andExpect(jsonPath("$.tenderPEName").value(DEFAULT_TENDER_PE_NAME.toString()))
            .andExpect(jsonPath("$.tenderPECode").value(DEFAULT_TENDER_PE_CODE.toString()))
            .andExpect(jsonPath("$.tenderType").value(DEFAULT_TENDER_TYPE.toString()))
            .andExpect(jsonPath("$.tenderMethod").value(DEFAULT_TENDER_METHOD.toString()))
            .andExpect(jsonPath("$.tenderOnOff").value(DEFAULT_TENDER_ON_OFF.toString()))
            .andExpect(jsonPath("$.tenderPublicDate").value(DEFAULT_TENDER_PUBLIC_DATE.toString()))
            .andExpect(jsonPath("$.tenderReceiveDate").value(DEFAULT_TENDER_RECEIVE_DATE.toString()))
            .andExpect(jsonPath("$.tenderDeadLineDate").value(DEFAULT_TENDER_DEAD_LINE_DATE.toString()))
            .andExpect(jsonPath("$.tenderOpenDate").value(DEFAULT_TENDER_OPEN_DATE.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingTender() throws Exception {
        // Get the tender
        restTenderMockMvc.perform(get("/api/tenders/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateTender() throws Exception {
        // Initialize the database
        tenderRepository.saveAndFlush(tender);

        int databaseSizeBeforeUpdate = tenderRepository.findAll().size();

        // Update the tender
        Tender updatedTender = tenderRepository.findById(tender.getId()).get();
        // Disconnect from session so that the updates on updatedTender are not directly saved in db
        em.detach(updatedTender);
        updatedTender
            .tenderRefNumber(UPDATED_TENDER_REF_NUMBER)
            .tenderRefName(UPDATED_TENDER_REF_NAME)
            .tenderPEName(UPDATED_TENDER_PE_NAME)
            .tenderPECode(UPDATED_TENDER_PE_CODE)
            .tenderType(UPDATED_TENDER_TYPE)
            .tenderMethod(UPDATED_TENDER_METHOD)
            .tenderOnOff(UPDATED_TENDER_ON_OFF)
            .tenderPublicDate(UPDATED_TENDER_PUBLIC_DATE)
            .tenderReceiveDate(UPDATED_TENDER_RECEIVE_DATE)
            .tenderDeadLineDate(UPDATED_TENDER_DEAD_LINE_DATE)
            .tenderOpenDate(UPDATED_TENDER_OPEN_DATE);
        TenderDTO tenderDTO = tenderMapper.toDto(updatedTender);

        restTenderMockMvc.perform(put("/api/tenders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(tenderDTO)))
            .andExpect(status().isOk());

        // Validate the Tender in the database
        List<Tender> tenderList = tenderRepository.findAll();
        assertThat(tenderList).hasSize(databaseSizeBeforeUpdate);
        Tender testTender = tenderList.get(tenderList.size() - 1);
        assertThat(testTender.getTenderRefNumber()).isEqualTo(UPDATED_TENDER_REF_NUMBER);
        assertThat(testTender.getTenderRefName()).isEqualTo(UPDATED_TENDER_REF_NAME);
        assertThat(testTender.getTenderPEName()).isEqualTo(UPDATED_TENDER_PE_NAME);
        assertThat(testTender.getTenderPECode()).isEqualTo(UPDATED_TENDER_PE_CODE);
        assertThat(testTender.getTenderType()).isEqualTo(UPDATED_TENDER_TYPE);
        assertThat(testTender.getTenderMethod()).isEqualTo(UPDATED_TENDER_METHOD);
        assertThat(testTender.getTenderOnOff()).isEqualTo(UPDATED_TENDER_ON_OFF);
        assertThat(testTender.getTenderPublicDate()).isEqualTo(UPDATED_TENDER_PUBLIC_DATE);
        assertThat(testTender.getTenderReceiveDate()).isEqualTo(UPDATED_TENDER_RECEIVE_DATE);
        assertThat(testTender.getTenderDeadLineDate()).isEqualTo(UPDATED_TENDER_DEAD_LINE_DATE);
        assertThat(testTender.getTenderOpenDate()).isEqualTo(UPDATED_TENDER_OPEN_DATE);
    }

    @Test
    @Transactional
    public void updateNonExistingTender() throws Exception {
        int databaseSizeBeforeUpdate = tenderRepository.findAll().size();

        // Create the Tender
        TenderDTO tenderDTO = tenderMapper.toDto(tender);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restTenderMockMvc.perform(put("/api/tenders")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(tenderDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Tender in the database
        List<Tender> tenderList = tenderRepository.findAll();
        assertThat(tenderList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteTender() throws Exception {
        // Initialize the database
        tenderRepository.saveAndFlush(tender);

        int databaseSizeBeforeDelete = tenderRepository.findAll().size();

        // Delete the tender
        restTenderMockMvc.perform(delete("/api/tenders/{id}", tender.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Tender> tenderList = tenderRepository.findAll();
        assertThat(tenderList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Tender.class);
        Tender tender1 = new Tender();
        tender1.setId(1L);
        Tender tender2 = new Tender();
        tender2.setId(tender1.getId());
        assertThat(tender1).isEqualTo(tender2);
        tender2.setId(2L);
        assertThat(tender1).isNotEqualTo(tender2);
        tender1.setId(null);
        assertThat(tender1).isNotEqualTo(tender2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(TenderDTO.class);
        TenderDTO tenderDTO1 = new TenderDTO();
        tenderDTO1.setId(1L);
        TenderDTO tenderDTO2 = new TenderDTO();
        assertThat(tenderDTO1).isNotEqualTo(tenderDTO2);
        tenderDTO2.setId(tenderDTO1.getId());
        assertThat(tenderDTO1).isEqualTo(tenderDTO2);
        tenderDTO2.setId(2L);
        assertThat(tenderDTO1).isNotEqualTo(tenderDTO2);
        tenderDTO1.setId(null);
        assertThat(tenderDTO1).isNotEqualTo(tenderDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(tenderMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(tenderMapper.fromId(null)).isNull();
    }
}
