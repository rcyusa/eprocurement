package rw.co.snw.web.rest;

import rw.co.snw.EprocurementApp;

import rw.co.snw.domain.Policy;
import rw.co.snw.repository.ContractRepository;
import rw.co.snw.repository.PolicyRepository;
import rw.co.snw.service.*;
import rw.co.snw.service.dto.PolicyDTO;
import rw.co.snw.service.mapper.PolicyMapper;
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
 * Test class for the PolicyResource REST controller.
 *
 * @see PolicyResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EprocurementApp.class)
public class PolicyResourceIntTest {

    private static final String DEFAULT_POLICY_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_POLICY_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_POLICY_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_POLICY_TYPE = "BBBBBBBBBB";

    private static final Double DEFAULT_POLICY_AMOUNT = 1D;
    private static final Double UPDATED_POLICY_AMOUNT = 2D;

    private static final String DEFAULT_POLICY_AMOUNT_CHAR = "AAAAAAAAAA";
    private static final String UPDATED_POLICY_AMOUNT_CHAR = "BBBBBBBBBB";

    private static final String DEFAULT_POLICY_AMOUNT_CURRANCY = "AAAAAAAAAA";
    private static final String UPDATED_POLICY_AMOUNT_CURRANCY = "BBBBBBBBBB";

    private static final Double DEFAULT_PRIME_AMOUNT = 1D;
    private static final Double UPDATED_PRIME_AMOUNT = 2D;

    private static final LocalDate DEFAULT_POLICY_OPERATION_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_POLICY_OPERATION_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_POLICY_START_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_POLICY_START_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_POLICY_EXPIRATION_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_POLICY_EXPIRATION_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_POLICY_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_POLICY_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_POLICY_COMMENT = "AAAAAAAAAA";
    private static final String UPDATED_POLICY_COMMENT = "BBBBBBBBBB";

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private PolicyMapper policyMapper;

    @Autowired
    private PolicyService policyService;

    @Autowired
    private LotService lotService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private UserExtraService userExtraService;

    @Autowired
    private UserService userService;

    @Autowired
    private BranchService branchService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private ContractRepository contractRepository;

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

    private MockMvc restPolicyMockMvc;

    private Policy policy;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final PolicyResource policyResource = new PolicyResource(branchService, userService, userExtraService, policyService,
            lotService, companyService, clientService,contractService,contractRepository);
        this.restPolicyMockMvc = MockMvcBuilders.standaloneSetup(policyResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     * <p>
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Policy createEntity(EntityManager em) {
        Policy policy = new Policy()
            .policyNumber(DEFAULT_POLICY_NUMBER)
            .policyType(DEFAULT_POLICY_TYPE)
            .policyAmount(DEFAULT_POLICY_AMOUNT)
            .policyAmountChar(DEFAULT_POLICY_AMOUNT_CHAR)
            .policyAmountCurrancy(DEFAULT_POLICY_AMOUNT_CURRANCY)
            .primeAmount(DEFAULT_PRIME_AMOUNT)
            .policyOperationDate(DEFAULT_POLICY_OPERATION_DATE)
            .policyStartDate(DEFAULT_POLICY_START_DATE)
            .policyExpirationDate(DEFAULT_POLICY_EXPIRATION_DATE)
            .policyStatus(DEFAULT_POLICY_STATUS)
            .policyComment(DEFAULT_POLICY_COMMENT);
        return policy;
    }

    @Before
    public void initTest() {
        policy = createEntity(em);
    }

    @Test
    @Transactional
    public void createPolicy() throws Exception {
        int databaseSizeBeforeCreate = policyRepository.findAll().size();

        // Create the Policy
        PolicyDTO policyDTO = policyMapper.toDto(policy);
        restPolicyMockMvc.perform(post("/api/policies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(policyDTO)))
            .andExpect(status().isCreated());

        // Validate the Policy in the database
        List<Policy> policyList = policyRepository.findAll();
        assertThat(policyList).hasSize(databaseSizeBeforeCreate + 1);
        Policy testPolicy = policyList.get(policyList.size() - 1);
        assertThat(testPolicy.getPolicyNumber()).isEqualTo(DEFAULT_POLICY_NUMBER);
        assertThat(testPolicy.getPolicyType()).isEqualTo(DEFAULT_POLICY_TYPE);
        assertThat(testPolicy.getPolicyAmount()).isEqualTo(DEFAULT_POLICY_AMOUNT);
        assertThat(testPolicy.getPolicyAmountChar()).isEqualTo(DEFAULT_POLICY_AMOUNT_CHAR);
        assertThat(testPolicy.getPolicyAmountCurrancy()).isEqualTo(DEFAULT_POLICY_AMOUNT_CURRANCY);
        assertThat(testPolicy.getPrimeAmount()).isEqualTo(DEFAULT_PRIME_AMOUNT);
        assertThat(testPolicy.getPolicyOperationDate()).isEqualTo(DEFAULT_POLICY_OPERATION_DATE);
        assertThat(testPolicy.getPolicyStartDate()).isEqualTo(DEFAULT_POLICY_START_DATE);
        assertThat(testPolicy.getPolicyExpirationDate()).isEqualTo(DEFAULT_POLICY_EXPIRATION_DATE);
        assertThat(testPolicy.getPolicyStatus()).isEqualTo(DEFAULT_POLICY_STATUS);
        assertThat(testPolicy.getPolicyComment()).isEqualTo(DEFAULT_POLICY_COMMENT);
    }

    @Test
    @Transactional
    public void createPolicyWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = policyRepository.findAll().size();

        // Create the Policy with an existing ID
        policy.setId(1L);
        PolicyDTO policyDTO = policyMapper.toDto(policy);

        // An entity with an existing ID cannot be created, so this API call must fail
        restPolicyMockMvc.perform(post("/api/policies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(policyDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Policy in the database
        List<Policy> policyList = policyRepository.findAll();
        assertThat(policyList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllPolicies() throws Exception {
        // Initialize the database
        policyRepository.saveAndFlush(policy);

        // Get all the policyList
        restPolicyMockMvc.perform(get("/api/policies?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(policy.getId().intValue())))
            .andExpect(jsonPath("$.[*].policyNumber").value(hasItem(DEFAULT_POLICY_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].policyType").value(hasItem(DEFAULT_POLICY_TYPE.toString())))
            .andExpect(jsonPath("$.[*].policyAmount").value(hasItem(DEFAULT_POLICY_AMOUNT.doubleValue())))
            .andExpect(jsonPath("$.[*].policyAmountChar").value(hasItem(DEFAULT_POLICY_AMOUNT_CHAR.toString())))
            .andExpect(jsonPath("$.[*].policyAmountCurrancy").value(hasItem(DEFAULT_POLICY_AMOUNT_CURRANCY.toString())))
            .andExpect(jsonPath("$.[*].primeAmount").value(hasItem(DEFAULT_PRIME_AMOUNT.doubleValue())))
            .andExpect(jsonPath("$.[*].policyOperationDate").value(hasItem(DEFAULT_POLICY_OPERATION_DATE.toString())))
            .andExpect(jsonPath("$.[*].policyStartDate").value(hasItem(DEFAULT_POLICY_START_DATE.toString())))
            .andExpect(jsonPath("$.[*].policyExpirationDate").value(hasItem(DEFAULT_POLICY_EXPIRATION_DATE.toString())))
            .andExpect(jsonPath("$.[*].policyStatus").value(hasItem(DEFAULT_POLICY_STATUS.toString())))
            .andExpect(jsonPath("$.[*].policyComment").value(hasItem(DEFAULT_POLICY_COMMENT.toString())));
    }

    @Test
    @Transactional
    public void getPolicy() throws Exception {
        // Initialize the database
        policyRepository.saveAndFlush(policy);

        // Get the policy
        restPolicyMockMvc.perform(get("/api/policies/{id}", policy.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(policy.getId().intValue()))
            .andExpect(jsonPath("$.policyNumber").value(DEFAULT_POLICY_NUMBER.toString()))
            .andExpect(jsonPath("$.policyType").value(DEFAULT_POLICY_TYPE.toString()))
            .andExpect(jsonPath("$.policyAmount").value(DEFAULT_POLICY_AMOUNT.doubleValue()))
            .andExpect(jsonPath("$.policyAmountChar").value(DEFAULT_POLICY_AMOUNT_CHAR.toString()))
            .andExpect(jsonPath("$.policyAmountCurrancy").value(DEFAULT_POLICY_AMOUNT_CURRANCY.toString()))
            .andExpect(jsonPath("$.primeAmount").value(DEFAULT_PRIME_AMOUNT.doubleValue()))
            .andExpect(jsonPath("$.policyOperationDate").value(DEFAULT_POLICY_OPERATION_DATE.toString()))
            .andExpect(jsonPath("$.policyStartDate").value(DEFAULT_POLICY_START_DATE.toString()))
            .andExpect(jsonPath("$.policyExpirationDate").value(DEFAULT_POLICY_EXPIRATION_DATE.toString()))
            .andExpect(jsonPath("$.policyStatus").value(DEFAULT_POLICY_STATUS.toString()))
            .andExpect(jsonPath("$.policyComment").value(DEFAULT_POLICY_COMMENT.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingPolicy() throws Exception {
        // Get the policy
        restPolicyMockMvc.perform(get("/api/policies/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updatePolicy() throws Exception {
        // Initialize the database
        policyRepository.saveAndFlush(policy);

        int databaseSizeBeforeUpdate = policyRepository.findAll().size();

        // Update the policy
        Policy updatedPolicy = policyRepository.findById(policy.getId()).get();
        // Disconnect from session so that the updates on updatedPolicy are not directly saved in db
        em.detach(updatedPolicy);
        updatedPolicy
            .policyNumber(UPDATED_POLICY_NUMBER)
            .policyType(UPDATED_POLICY_TYPE)
            .policyAmount(UPDATED_POLICY_AMOUNT)
            .policyAmountChar(UPDATED_POLICY_AMOUNT_CHAR)
            .policyAmountCurrancy(UPDATED_POLICY_AMOUNT_CURRANCY)
            .primeAmount(UPDATED_PRIME_AMOUNT)
            .policyOperationDate(UPDATED_POLICY_OPERATION_DATE)
            .policyStartDate(UPDATED_POLICY_START_DATE)
            .policyExpirationDate(UPDATED_POLICY_EXPIRATION_DATE)
            .policyStatus(UPDATED_POLICY_STATUS)
            .policyComment(UPDATED_POLICY_COMMENT);
        PolicyDTO policyDTO = policyMapper.toDto(updatedPolicy);

        restPolicyMockMvc.perform(put("/api/policies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(policyDTO)))
            .andExpect(status().isOk());

        // Validate the Policy in the database
        List<Policy> policyList = policyRepository.findAll();
        assertThat(policyList).hasSize(databaseSizeBeforeUpdate);
        Policy testPolicy = policyList.get(policyList.size() - 1);
        assertThat(testPolicy.getPolicyNumber()).isEqualTo(UPDATED_POLICY_NUMBER);
        assertThat(testPolicy.getPolicyType()).isEqualTo(UPDATED_POLICY_TYPE);
        assertThat(testPolicy.getPolicyAmount()).isEqualTo(UPDATED_POLICY_AMOUNT);
        assertThat(testPolicy.getPolicyAmountChar()).isEqualTo(UPDATED_POLICY_AMOUNT_CHAR);
        assertThat(testPolicy.getPolicyAmountCurrancy()).isEqualTo(UPDATED_POLICY_AMOUNT_CURRANCY);
        assertThat(testPolicy.getPrimeAmount()).isEqualTo(UPDATED_PRIME_AMOUNT);
        assertThat(testPolicy.getPolicyOperationDate()).isEqualTo(UPDATED_POLICY_OPERATION_DATE);
        assertThat(testPolicy.getPolicyStartDate()).isEqualTo(UPDATED_POLICY_START_DATE);
        assertThat(testPolicy.getPolicyExpirationDate()).isEqualTo(UPDATED_POLICY_EXPIRATION_DATE);
        assertThat(testPolicy.getPolicyStatus()).isEqualTo(UPDATED_POLICY_STATUS);
        assertThat(testPolicy.getPolicyComment()).isEqualTo(UPDATED_POLICY_COMMENT);
    }

    @Test
    @Transactional
    public void updateNonExistingPolicy() throws Exception {
        int databaseSizeBeforeUpdate = policyRepository.findAll().size();

        // Create the Policy
        PolicyDTO policyDTO = policyMapper.toDto(policy);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restPolicyMockMvc.perform(put("/api/policies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(policyDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Policy in the database
        List<Policy> policyList = policyRepository.findAll();
        assertThat(policyList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deletePolicy() throws Exception {
        // Initialize the database
        policyRepository.saveAndFlush(policy);

        int databaseSizeBeforeDelete = policyRepository.findAll().size();

        // Delete the policy
        restPolicyMockMvc.perform(delete("/api/policies/{id}", policy.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Policy> policyList = policyRepository.findAll();
        assertThat(policyList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Policy.class);
        Policy policy1 = new Policy();
        policy1.setId(1L);
        Policy policy2 = new Policy();
        policy2.setId(policy1.getId());
        assertThat(policy1).isEqualTo(policy2);
        policy2.setId(2L);
        assertThat(policy1).isNotEqualTo(policy2);
        policy1.setId(null);
        assertThat(policy1).isNotEqualTo(policy2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(PolicyDTO.class);
        PolicyDTO policyDTO1 = new PolicyDTO();
        policyDTO1.setId(1L);
        PolicyDTO policyDTO2 = new PolicyDTO();
        assertThat(policyDTO1).isNotEqualTo(policyDTO2);
        policyDTO2.setId(policyDTO1.getId());
        assertThat(policyDTO1).isEqualTo(policyDTO2);
        policyDTO2.setId(2L);
        assertThat(policyDTO1).isNotEqualTo(policyDTO2);
        policyDTO1.setId(null);
        assertThat(policyDTO1).isNotEqualTo(policyDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(policyMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(policyMapper.fromId(null)).isNull();
    }
}
