package rw.co.snw.web.rest;

import rw.co.snw.EprocurementApp;

import rw.co.snw.domain.Contract;
import rw.co.snw.repository.ContractRepository;
import rw.co.snw.service.ContractService;
import rw.co.snw.service.dto.ContractDTO;
import rw.co.snw.service.mapper.ContractMapper;
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
 * Test class for the ContractResource REST controller.
 *
 * @see ContractResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EprocurementApp.class)
public class ContractResourceIntTest {

    private static final String DEFAULT_CONTRACT_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_SERIAL_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_SERIAL_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_AMOUNT = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_AMOUNT = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_AMOUNT_CHARACTER = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_AMOUNT_CHARACTER = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_CURRENCY = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_CURRENCY = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_TOTAL_TAXE_AMOUNT = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_VAT_AMOUNT = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_VAT_AMOUNT = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_VAT_RATE = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_VAT_RATE = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_WHT_AMOUNT = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_WHT_AMOUNT = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_WHT_RATE = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_WHT_RATE = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_DURATION_YEAR = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_DURATION_YEAR = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_DURATION_MONTH = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_DURATION_MONTH = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_DATE = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_EFFECTIVE_DATE = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_EFFECTIVE_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_WARANTY_YEAR = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_WARANTY_YEAR = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_WARANTY_MONTH = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_WARANTY_MONTH = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_PENALTY_DELAY_RATE = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_PENALTY_DELAY_RATE = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_PENALTY_LIMIT_RATE = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_PENALTY_LIMIT_RATE = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_MANAGER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_MANAGER_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_MANAGER_POSITION = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_MANAGER_POSITION = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_SUPERVISING_FIRM = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_SUPERVISING_FIRM = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_PETIN_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_PETIN_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_PE_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_PE_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_PE_REPRESENTATIVE_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_PE_REPRESENTATIVE_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_PETEL_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_PETEL_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_PE_ADDRESS = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_PE_ADDRESS = "BBBBBBBBBB";

    private static final String DEFAULT_CONTRACT_TENDER_REF_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_CONTRACT_TENDER_REF_NUMBER = "BBBBBBBBBB";

    @Autowired
    private ContractRepository contractRepository;

    @Autowired
    private ContractMapper contractMapper;

    @Autowired
    private ContractService contractService;

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

    private MockMvc restContractMockMvc;

    private Contract contract;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final ContractResource contractResource = new ContractResource(contractService);
        this.restContractMockMvc = MockMvcBuilders.standaloneSetup(contractResource)
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
    public static Contract createEntity(EntityManager em) {
        Contract contract = new Contract()
            .contractNumber(DEFAULT_CONTRACT_NUMBER)
            .contractSerialNumber(DEFAULT_CONTRACT_SERIAL_NUMBER)
            .contractName(DEFAULT_CONTRACT_NAME)
            .contractAmount(DEFAULT_CONTRACT_AMOUNT)
            .contractAmountCharacter(DEFAULT_CONTRACT_AMOUNT_CHARACTER)
            .contractCurrency(DEFAULT_CONTRACT_CURRENCY)
            .contractTotalTaxeAmount(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT)
            .contractTotalTaxeAmountCharacter(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER)
            .contractVatAmount(DEFAULT_CONTRACT_VAT_AMOUNT)
            .contractVatRate(DEFAULT_CONTRACT_VAT_RATE)
            .contractWhtAmount(DEFAULT_CONTRACT_WHT_AMOUNT)
            .contractWhtRate(DEFAULT_CONTRACT_WHT_RATE)
            .contractDurationYear(DEFAULT_CONTRACT_DURATION_YEAR)
            .contractDurationMonth(DEFAULT_CONTRACT_DURATION_MONTH)
            .contractDate(DEFAULT_CONTRACT_DATE)
            .contractEffectiveDate(DEFAULT_CONTRACT_EFFECTIVE_DATE)
            .contractWarantyYear(DEFAULT_CONTRACT_WARANTY_YEAR)
            .contractWarantyMonth(DEFAULT_CONTRACT_WARANTY_MONTH)
            .contractPenaltyDelayRate(DEFAULT_CONTRACT_PENALTY_DELAY_RATE)
            .contractPenaltyLimitRate(DEFAULT_CONTRACT_PENALTY_LIMIT_RATE)
            .contractManagerName(DEFAULT_CONTRACT_MANAGER_NAME)
            .contractManagerPosition(DEFAULT_CONTRACT_MANAGER_POSITION)
            .contractSupervisingFirm(DEFAULT_CONTRACT_SUPERVISING_FIRM)
            .contractPETINNumber(DEFAULT_CONTRACT_PETIN_NUMBER)
            .contractPEName(DEFAULT_CONTRACT_PE_NAME)
            .contractPERepresentativeName(DEFAULT_CONTRACT_PE_REPRESENTATIVE_NAME)
            .contractPETELNumber(DEFAULT_CONTRACT_PETEL_NUMBER)
            .contractPEAddress(DEFAULT_CONTRACT_PE_ADDRESS)
            .contractTenderRefNumber(DEFAULT_CONTRACT_TENDER_REF_NUMBER);
        return contract;
    }

    @Before
    public void initTest() {
        contract = createEntity(em);
    }

    @Test
    @Transactional
    public void createContract() throws Exception {
        int databaseSizeBeforeCreate = contractRepository.findAll().size();

        // Create the Contract
        ContractDTO contractDTO = contractMapper.toDto(contract);
        restContractMockMvc.perform(post("/api/contracts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(contractDTO)))
            .andExpect(status().isCreated());

        // Validate the Contract in the database
        List<Contract> contractList = contractRepository.findAll();
        assertThat(contractList).hasSize(databaseSizeBeforeCreate + 1);
        Contract testContract = contractList.get(contractList.size() - 1);
        assertThat(testContract.getContractNumber()).isEqualTo(DEFAULT_CONTRACT_NUMBER);
        assertThat(testContract.getContractSerialNumber()).isEqualTo(DEFAULT_CONTRACT_SERIAL_NUMBER);
        assertThat(testContract.getContractName()).isEqualTo(DEFAULT_CONTRACT_NAME);
        assertThat(testContract.getContractAmount()).isEqualTo(DEFAULT_CONTRACT_AMOUNT);
        assertThat(testContract.getContractAmountCharacter()).isEqualTo(DEFAULT_CONTRACT_AMOUNT_CHARACTER);
        assertThat(testContract.getContractCurrency()).isEqualTo(DEFAULT_CONTRACT_CURRENCY);
        assertThat(testContract.getContractTotalTaxeAmount()).isEqualTo(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT);
        assertThat(testContract.getContractTotalTaxeAmountCharacter()).isEqualTo(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER);
        assertThat(testContract.getContractVatAmount()).isEqualTo(DEFAULT_CONTRACT_VAT_AMOUNT);
        assertThat(testContract.getContractVatRate()).isEqualTo(DEFAULT_CONTRACT_VAT_RATE);
        assertThat(testContract.getContractWhtAmount()).isEqualTo(DEFAULT_CONTRACT_WHT_AMOUNT);
        assertThat(testContract.getContractWhtRate()).isEqualTo(DEFAULT_CONTRACT_WHT_RATE);
        assertThat(testContract.getContractDurationYear()).isEqualTo(DEFAULT_CONTRACT_DURATION_YEAR);
        assertThat(testContract.getContractDurationMonth()).isEqualTo(DEFAULT_CONTRACT_DURATION_MONTH);
        assertThat(testContract.getContractDate()).isEqualTo(DEFAULT_CONTRACT_DATE);
        assertThat(testContract.getContractEffectiveDate()).isEqualTo(DEFAULT_CONTRACT_EFFECTIVE_DATE);
        assertThat(testContract.getContractWarantyYear()).isEqualTo(DEFAULT_CONTRACT_WARANTY_YEAR);
        assertThat(testContract.getContractWarantyMonth()).isEqualTo(DEFAULT_CONTRACT_WARANTY_MONTH);
        assertThat(testContract.getContractPenaltyDelayRate()).isEqualTo(DEFAULT_CONTRACT_PENALTY_DELAY_RATE);
        assertThat(testContract.getContractPenaltyLimitRate()).isEqualTo(DEFAULT_CONTRACT_PENALTY_LIMIT_RATE);
        assertThat(testContract.getContractManagerName()).isEqualTo(DEFAULT_CONTRACT_MANAGER_NAME);
        assertThat(testContract.getContractManagerPosition()).isEqualTo(DEFAULT_CONTRACT_MANAGER_POSITION);
        assertThat(testContract.getContractSupervisingFirm()).isEqualTo(DEFAULT_CONTRACT_SUPERVISING_FIRM);
        assertThat(testContract.getContractPETINNumber()).isEqualTo(DEFAULT_CONTRACT_PETIN_NUMBER);
        assertThat(testContract.getContractPEName()).isEqualTo(DEFAULT_CONTRACT_PE_NAME);
        assertThat(testContract.getContractPERepresentativeName()).isEqualTo(DEFAULT_CONTRACT_PE_REPRESENTATIVE_NAME);
        assertThat(testContract.getContractPETELNumber()).isEqualTo(DEFAULT_CONTRACT_PETEL_NUMBER);
        assertThat(testContract.getContractPEAddress()).isEqualTo(DEFAULT_CONTRACT_PE_ADDRESS);
        assertThat(testContract.getContractTenderRefNumber()).isEqualTo(DEFAULT_CONTRACT_TENDER_REF_NUMBER);
    }

    @Test
    @Transactional
    public void createContractWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = contractRepository.findAll().size();

        // Create the Contract with an existing ID
        contract.setId(1L);
        ContractDTO contractDTO = contractMapper.toDto(contract);

        // An entity with an existing ID cannot be created, so this API call must fail
        restContractMockMvc.perform(post("/api/contracts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(contractDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Contract in the database
        List<Contract> contractList = contractRepository.findAll();
        assertThat(contractList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllContracts() throws Exception {
        // Initialize the database
        contractRepository.saveAndFlush(contract);

        // Get all the contractList
        restContractMockMvc.perform(get("/api/contracts?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(contract.getId().intValue())))
            .andExpect(jsonPath("$.[*].contractNumber").value(hasItem(DEFAULT_CONTRACT_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].contractSerialNumber").value(hasItem(DEFAULT_CONTRACT_SERIAL_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].contractName").value(hasItem(DEFAULT_CONTRACT_NAME.toString())))
            .andExpect(jsonPath("$.[*].contractAmount").value(hasItem(DEFAULT_CONTRACT_AMOUNT.toString())))
            .andExpect(jsonPath("$.[*].contractAmountCharacter").value(hasItem(DEFAULT_CONTRACT_AMOUNT_CHARACTER.toString())))
            .andExpect(jsonPath("$.[*].contractCurrency").value(hasItem(DEFAULT_CONTRACT_CURRENCY.toString())))
            .andExpect(jsonPath("$.[*].contractTotalTaxeAmount").value(hasItem(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT.toString())))
            .andExpect(jsonPath("$.[*].contractTotalTaxeAmountCharacter").value(hasItem(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER.toString())))
            .andExpect(jsonPath("$.[*].contractVatAmount").value(hasItem(DEFAULT_CONTRACT_VAT_AMOUNT.toString())))
            .andExpect(jsonPath("$.[*].contractVatRate").value(hasItem(DEFAULT_CONTRACT_VAT_RATE.toString())))
            .andExpect(jsonPath("$.[*].contractWhtAmount").value(hasItem(DEFAULT_CONTRACT_WHT_AMOUNT.toString())))
            .andExpect(jsonPath("$.[*].contractWhtRate").value(hasItem(DEFAULT_CONTRACT_WHT_RATE.toString())))
            .andExpect(jsonPath("$.[*].contractDurationYear").value(hasItem(DEFAULT_CONTRACT_DURATION_YEAR.toString())))
            .andExpect(jsonPath("$.[*].contractDurationMonth").value(hasItem(DEFAULT_CONTRACT_DURATION_MONTH.toString())))
            .andExpect(jsonPath("$.[*].contractDate").value(hasItem(DEFAULT_CONTRACT_DATE.toString())))
            .andExpect(jsonPath("$.[*].contractEffectiveDate").value(hasItem(DEFAULT_CONTRACT_EFFECTIVE_DATE.toString())))
            .andExpect(jsonPath("$.[*].contractWarantyYear").value(hasItem(DEFAULT_CONTRACT_WARANTY_YEAR.toString())))
            .andExpect(jsonPath("$.[*].contractWarantyMonth").value(hasItem(DEFAULT_CONTRACT_WARANTY_MONTH.toString())))
            .andExpect(jsonPath("$.[*].contractPenaltyDelayRate").value(hasItem(DEFAULT_CONTRACT_PENALTY_DELAY_RATE.toString())))
            .andExpect(jsonPath("$.[*].contractPenaltyLimitRate").value(hasItem(DEFAULT_CONTRACT_PENALTY_LIMIT_RATE.toString())))
            .andExpect(jsonPath("$.[*].contractManagerName").value(hasItem(DEFAULT_CONTRACT_MANAGER_NAME.toString())))
            .andExpect(jsonPath("$.[*].contractManagerPosition").value(hasItem(DEFAULT_CONTRACT_MANAGER_POSITION.toString())))
            .andExpect(jsonPath("$.[*].contractSupervisingFirm").value(hasItem(DEFAULT_CONTRACT_SUPERVISING_FIRM.toString())))
            .andExpect(jsonPath("$.[*].contractPETINNumber").value(hasItem(DEFAULT_CONTRACT_PETIN_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].contractPEName").value(hasItem(DEFAULT_CONTRACT_PE_NAME.toString())))
            .andExpect(jsonPath("$.[*].contractPERepresentativeName").value(hasItem(DEFAULT_CONTRACT_PE_REPRESENTATIVE_NAME.toString())))
            .andExpect(jsonPath("$.[*].contractPETELNumber").value(hasItem(DEFAULT_CONTRACT_PETEL_NUMBER.toString())))
            .andExpect(jsonPath("$.[*].contractPEAddress").value(hasItem(DEFAULT_CONTRACT_PE_ADDRESS.toString())))
            .andExpect(jsonPath("$.[*].contractTenderRefNumber").value(hasItem(DEFAULT_CONTRACT_TENDER_REF_NUMBER.toString())));
    }
    
    @Test
    @Transactional
    public void getContract() throws Exception {
        // Initialize the database
        contractRepository.saveAndFlush(contract);

        // Get the contract
        restContractMockMvc.perform(get("/api/contracts/{id}", contract.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(contract.getId().intValue()))
            .andExpect(jsonPath("$.contractNumber").value(DEFAULT_CONTRACT_NUMBER.toString()))
            .andExpect(jsonPath("$.contractSerialNumber").value(DEFAULT_CONTRACT_SERIAL_NUMBER.toString()))
            .andExpect(jsonPath("$.contractName").value(DEFAULT_CONTRACT_NAME.toString()))
            .andExpect(jsonPath("$.contractAmount").value(DEFAULT_CONTRACT_AMOUNT.toString()))
            .andExpect(jsonPath("$.contractAmountCharacter").value(DEFAULT_CONTRACT_AMOUNT_CHARACTER.toString()))
            .andExpect(jsonPath("$.contractCurrency").value(DEFAULT_CONTRACT_CURRENCY.toString()))
            .andExpect(jsonPath("$.contractTotalTaxeAmount").value(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT.toString()))
            .andExpect(jsonPath("$.contractTotalTaxeAmountCharacter").value(DEFAULT_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER.toString()))
            .andExpect(jsonPath("$.contractVatAmount").value(DEFAULT_CONTRACT_VAT_AMOUNT.toString()))
            .andExpect(jsonPath("$.contractVatRate").value(DEFAULT_CONTRACT_VAT_RATE.toString()))
            .andExpect(jsonPath("$.contractWhtAmount").value(DEFAULT_CONTRACT_WHT_AMOUNT.toString()))
            .andExpect(jsonPath("$.contractWhtRate").value(DEFAULT_CONTRACT_WHT_RATE.toString()))
            .andExpect(jsonPath("$.contractDurationYear").value(DEFAULT_CONTRACT_DURATION_YEAR.toString()))
            .andExpect(jsonPath("$.contractDurationMonth").value(DEFAULT_CONTRACT_DURATION_MONTH.toString()))
            .andExpect(jsonPath("$.contractDate").value(DEFAULT_CONTRACT_DATE.toString()))
            .andExpect(jsonPath("$.contractEffectiveDate").value(DEFAULT_CONTRACT_EFFECTIVE_DATE.toString()))
            .andExpect(jsonPath("$.contractWarantyYear").value(DEFAULT_CONTRACT_WARANTY_YEAR.toString()))
            .andExpect(jsonPath("$.contractWarantyMonth").value(DEFAULT_CONTRACT_WARANTY_MONTH.toString()))
            .andExpect(jsonPath("$.contractPenaltyDelayRate").value(DEFAULT_CONTRACT_PENALTY_DELAY_RATE.toString()))
            .andExpect(jsonPath("$.contractPenaltyLimitRate").value(DEFAULT_CONTRACT_PENALTY_LIMIT_RATE.toString()))
            .andExpect(jsonPath("$.contractManagerName").value(DEFAULT_CONTRACT_MANAGER_NAME.toString()))
            .andExpect(jsonPath("$.contractManagerPosition").value(DEFAULT_CONTRACT_MANAGER_POSITION.toString()))
            .andExpect(jsonPath("$.contractSupervisingFirm").value(DEFAULT_CONTRACT_SUPERVISING_FIRM.toString()))
            .andExpect(jsonPath("$.contractPETINNumber").value(DEFAULT_CONTRACT_PETIN_NUMBER.toString()))
            .andExpect(jsonPath("$.contractPEName").value(DEFAULT_CONTRACT_PE_NAME.toString()))
            .andExpect(jsonPath("$.contractPERepresentativeName").value(DEFAULT_CONTRACT_PE_REPRESENTATIVE_NAME.toString()))
            .andExpect(jsonPath("$.contractPETELNumber").value(DEFAULT_CONTRACT_PETEL_NUMBER.toString()))
            .andExpect(jsonPath("$.contractPEAddress").value(DEFAULT_CONTRACT_PE_ADDRESS.toString()))
            .andExpect(jsonPath("$.contractTenderRefNumber").value(DEFAULT_CONTRACT_TENDER_REF_NUMBER.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingContract() throws Exception {
        // Get the contract
        restContractMockMvc.perform(get("/api/contracts/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateContract() throws Exception {
        // Initialize the database
        contractRepository.saveAndFlush(contract);

        int databaseSizeBeforeUpdate = contractRepository.findAll().size();

        // Update the contract
        Contract updatedContract = contractRepository.findById(contract.getId()).get();
        // Disconnect from session so that the updates on updatedContract are not directly saved in db
        em.detach(updatedContract);
        updatedContract
            .contractNumber(UPDATED_CONTRACT_NUMBER)
            .contractSerialNumber(UPDATED_CONTRACT_SERIAL_NUMBER)
            .contractName(UPDATED_CONTRACT_NAME)
            .contractAmount(UPDATED_CONTRACT_AMOUNT)
            .contractAmountCharacter(UPDATED_CONTRACT_AMOUNT_CHARACTER)
            .contractCurrency(UPDATED_CONTRACT_CURRENCY)
            .contractTotalTaxeAmount(UPDATED_CONTRACT_TOTAL_TAXE_AMOUNT)
            .contractTotalTaxeAmountCharacter(UPDATED_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER)
            .contractVatAmount(UPDATED_CONTRACT_VAT_AMOUNT)
            .contractVatRate(UPDATED_CONTRACT_VAT_RATE)
            .contractWhtAmount(UPDATED_CONTRACT_WHT_AMOUNT)
            .contractWhtRate(UPDATED_CONTRACT_WHT_RATE)
            .contractDurationYear(UPDATED_CONTRACT_DURATION_YEAR)
            .contractDurationMonth(UPDATED_CONTRACT_DURATION_MONTH)
            .contractDate(UPDATED_CONTRACT_DATE)
            .contractEffectiveDate(UPDATED_CONTRACT_EFFECTIVE_DATE)
            .contractWarantyYear(UPDATED_CONTRACT_WARANTY_YEAR)
            .contractWarantyMonth(UPDATED_CONTRACT_WARANTY_MONTH)
            .contractPenaltyDelayRate(UPDATED_CONTRACT_PENALTY_DELAY_RATE)
            .contractPenaltyLimitRate(UPDATED_CONTRACT_PENALTY_LIMIT_RATE)
            .contractManagerName(UPDATED_CONTRACT_MANAGER_NAME)
            .contractManagerPosition(UPDATED_CONTRACT_MANAGER_POSITION)
            .contractSupervisingFirm(UPDATED_CONTRACT_SUPERVISING_FIRM)
            .contractPETINNumber(UPDATED_CONTRACT_PETIN_NUMBER)
            .contractPEName(UPDATED_CONTRACT_PE_NAME)
            .contractPERepresentativeName(UPDATED_CONTRACT_PE_REPRESENTATIVE_NAME)
            .contractPETELNumber(UPDATED_CONTRACT_PETEL_NUMBER)
            .contractPEAddress(UPDATED_CONTRACT_PE_ADDRESS)
            .contractTenderRefNumber(UPDATED_CONTRACT_TENDER_REF_NUMBER);
        ContractDTO contractDTO = contractMapper.toDto(updatedContract);

        restContractMockMvc.perform(put("/api/contracts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(contractDTO)))
            .andExpect(status().isOk());

        // Validate the Contract in the database
        List<Contract> contractList = contractRepository.findAll();
        assertThat(contractList).hasSize(databaseSizeBeforeUpdate);
        Contract testContract = contractList.get(contractList.size() - 1);
        assertThat(testContract.getContractNumber()).isEqualTo(UPDATED_CONTRACT_NUMBER);
        assertThat(testContract.getContractSerialNumber()).isEqualTo(UPDATED_CONTRACT_SERIAL_NUMBER);
        assertThat(testContract.getContractName()).isEqualTo(UPDATED_CONTRACT_NAME);
        assertThat(testContract.getContractAmount()).isEqualTo(UPDATED_CONTRACT_AMOUNT);
        assertThat(testContract.getContractAmountCharacter()).isEqualTo(UPDATED_CONTRACT_AMOUNT_CHARACTER);
        assertThat(testContract.getContractCurrency()).isEqualTo(UPDATED_CONTRACT_CURRENCY);
        assertThat(testContract.getContractTotalTaxeAmount()).isEqualTo(UPDATED_CONTRACT_TOTAL_TAXE_AMOUNT);
        assertThat(testContract.getContractTotalTaxeAmountCharacter()).isEqualTo(UPDATED_CONTRACT_TOTAL_TAXE_AMOUNT_CHARACTER);
        assertThat(testContract.getContractVatAmount()).isEqualTo(UPDATED_CONTRACT_VAT_AMOUNT);
        assertThat(testContract.getContractVatRate()).isEqualTo(UPDATED_CONTRACT_VAT_RATE);
        assertThat(testContract.getContractWhtAmount()).isEqualTo(UPDATED_CONTRACT_WHT_AMOUNT);
        assertThat(testContract.getContractWhtRate()).isEqualTo(UPDATED_CONTRACT_WHT_RATE);
        assertThat(testContract.getContractDurationYear()).isEqualTo(UPDATED_CONTRACT_DURATION_YEAR);
        assertThat(testContract.getContractDurationMonth()).isEqualTo(UPDATED_CONTRACT_DURATION_MONTH);
        assertThat(testContract.getContractDate()).isEqualTo(UPDATED_CONTRACT_DATE);
        assertThat(testContract.getContractEffectiveDate()).isEqualTo(UPDATED_CONTRACT_EFFECTIVE_DATE);
        assertThat(testContract.getContractWarantyYear()).isEqualTo(UPDATED_CONTRACT_WARANTY_YEAR);
        assertThat(testContract.getContractWarantyMonth()).isEqualTo(UPDATED_CONTRACT_WARANTY_MONTH);
        assertThat(testContract.getContractPenaltyDelayRate()).isEqualTo(UPDATED_CONTRACT_PENALTY_DELAY_RATE);
        assertThat(testContract.getContractPenaltyLimitRate()).isEqualTo(UPDATED_CONTRACT_PENALTY_LIMIT_RATE);
        assertThat(testContract.getContractManagerName()).isEqualTo(UPDATED_CONTRACT_MANAGER_NAME);
        assertThat(testContract.getContractManagerPosition()).isEqualTo(UPDATED_CONTRACT_MANAGER_POSITION);
        assertThat(testContract.getContractSupervisingFirm()).isEqualTo(UPDATED_CONTRACT_SUPERVISING_FIRM);
        assertThat(testContract.getContractPETINNumber()).isEqualTo(UPDATED_CONTRACT_PETIN_NUMBER);
        assertThat(testContract.getContractPEName()).isEqualTo(UPDATED_CONTRACT_PE_NAME);
        assertThat(testContract.getContractPERepresentativeName()).isEqualTo(UPDATED_CONTRACT_PE_REPRESENTATIVE_NAME);
        assertThat(testContract.getContractPETELNumber()).isEqualTo(UPDATED_CONTRACT_PETEL_NUMBER);
        assertThat(testContract.getContractPEAddress()).isEqualTo(UPDATED_CONTRACT_PE_ADDRESS);
        assertThat(testContract.getContractTenderRefNumber()).isEqualTo(UPDATED_CONTRACT_TENDER_REF_NUMBER);
    }

    @Test
    @Transactional
    public void updateNonExistingContract() throws Exception {
        int databaseSizeBeforeUpdate = contractRepository.findAll().size();

        // Create the Contract
        ContractDTO contractDTO = contractMapper.toDto(contract);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restContractMockMvc.perform(put("/api/contracts")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(contractDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Contract in the database
        List<Contract> contractList = contractRepository.findAll();
        assertThat(contractList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteContract() throws Exception {
        // Initialize the database
        contractRepository.saveAndFlush(contract);

        int databaseSizeBeforeDelete = contractRepository.findAll().size();

        // Delete the contract
        restContractMockMvc.perform(delete("/api/contracts/{id}", contract.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Contract> contractList = contractRepository.findAll();
        assertThat(contractList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Contract.class);
        Contract contract1 = new Contract();
        contract1.setId(1L);
        Contract contract2 = new Contract();
        contract2.setId(contract1.getId());
        assertThat(contract1).isEqualTo(contract2);
        contract2.setId(2L);
        assertThat(contract1).isNotEqualTo(contract2);
        contract1.setId(null);
        assertThat(contract1).isNotEqualTo(contract2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ContractDTO.class);
        ContractDTO contractDTO1 = new ContractDTO();
        contractDTO1.setId(1L);
        ContractDTO contractDTO2 = new ContractDTO();
        assertThat(contractDTO1).isNotEqualTo(contractDTO2);
        contractDTO2.setId(contractDTO1.getId());
        assertThat(contractDTO1).isEqualTo(contractDTO2);
        contractDTO2.setId(2L);
        assertThat(contractDTO1).isNotEqualTo(contractDTO2);
        contractDTO1.setId(null);
        assertThat(contractDTO1).isNotEqualTo(contractDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(contractMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(contractMapper.fromId(null)).isNull();
    }
}
