package rw.co.snw.web.rest;

import rw.co.snw.EprocurementApp;

import rw.co.snw.domain.Company;
import rw.co.snw.repository.CompanyRepository;
import rw.co.snw.service.CompanyService;
import rw.co.snw.service.dto.CompanyDTO;
import rw.co.snw.service.mapper.CompanyMapper;
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
 * Test class for the CompanyResource REST controller.
 *
 * @see CompanyResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EprocurementApp.class)
public class CompanyResourceIntTest {

    private static final String DEFAULT_COMPANY_USER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_COMPANY_USER_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_COMPANY_PASS_WORD = "AAAAAAAAAA";
    private static final String UPDATED_COMPANY_PASS_WORD = "BBBBBBBBBB";

    private static final String DEFAULT_COMPANY_TI_NNUMBER = "AAAAAAAAAA";
    private static final String UPDATED_COMPANY_TI_NNUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_COMPANY_EMAIL = "AAAAAAAAAA";
    private static final String UPDATED_COMPANY_EMAIL = "BBBBBBBBBB";

    private static final String DEFAULT_COMPANY_FAX = "AAAAAAAAAA";
    private static final String UPDATED_COMPANY_FAX = "BBBBBBBBBB";

    private static final String DEFAULT_COMPANY_PHONE = "AAAAAAAAAA";
    private static final String UPDATED_COMPANY_PHONE = "BBBBBBBBBB";

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private CompanyService companyService;

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

    private MockMvc restCompanyMockMvc;

    private Company company;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final CompanyResource companyResource = new CompanyResource(companyService);
        this.restCompanyMockMvc = MockMvcBuilders.standaloneSetup(companyResource)
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
    public static Company createEntity(EntityManager em) {
        Company company = new Company()
            .companyUserName(DEFAULT_COMPANY_USER_NAME)
            .companyPassWord(DEFAULT_COMPANY_PASS_WORD)
            .companyTINnumber(DEFAULT_COMPANY_TI_NNUMBER)
            .companyEmail(DEFAULT_COMPANY_EMAIL)
            .companyFax(DEFAULT_COMPANY_FAX)
            .companyPhone(DEFAULT_COMPANY_PHONE);
        return company;
    }

    @Before
    public void initTest() {
        company = createEntity(em);
    }

    @Test
    @Transactional
    public void createCompany() throws Exception {
        int databaseSizeBeforeCreate = companyRepository.findAll().size();

        // Create the Company
        CompanyDTO companyDTO = companyMapper.toDto(company);
        restCompanyMockMvc.perform(post("/api/companies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(companyDTO)))
            .andExpect(status().isCreated());

        // Validate the Company in the database
        List<Company> companyList = companyRepository.findAll();
        assertThat(companyList).hasSize(databaseSizeBeforeCreate + 1);
        Company testCompany = companyList.get(companyList.size() - 1);
        assertThat(testCompany.getCompanyUserName()).isEqualTo(DEFAULT_COMPANY_USER_NAME);
        assertThat(testCompany.getCompanyPassWord()).isEqualTo(DEFAULT_COMPANY_PASS_WORD);
        assertThat(testCompany.getCompanyTINnumber()).isEqualTo(DEFAULT_COMPANY_TI_NNUMBER);
        assertThat(testCompany.getCompanyEmail()).isEqualTo(DEFAULT_COMPANY_EMAIL);
        assertThat(testCompany.getCompanyFax()).isEqualTo(DEFAULT_COMPANY_FAX);
        assertThat(testCompany.getCompanyPhone()).isEqualTo(DEFAULT_COMPANY_PHONE);
    }

    @Test
    @Transactional
    public void createCompanyWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = companyRepository.findAll().size();

        // Create the Company with an existing ID
        company.setId(1L);
        CompanyDTO companyDTO = companyMapper.toDto(company);

        // An entity with an existing ID cannot be created, so this API call must fail
        restCompanyMockMvc.perform(post("/api/companies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(companyDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Company in the database
        List<Company> companyList = companyRepository.findAll();
        assertThat(companyList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void getAllCompanies() throws Exception {
        // Initialize the database
        companyRepository.saveAndFlush(company);

        // Get all the companyList
        restCompanyMockMvc.perform(get("/api/companies?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(company.getId().intValue())))
            .andExpect(jsonPath("$.[*].companyUserName").value(hasItem(DEFAULT_COMPANY_USER_NAME.toString())))
            .andExpect(jsonPath("$.[*].companyPassWord").value(hasItem(DEFAULT_COMPANY_PASS_WORD.toString())))
            .andExpect(jsonPath("$.[*].companyTINnumber").value(hasItem(DEFAULT_COMPANY_TI_NNUMBER.toString())))
            .andExpect(jsonPath("$.[*].companyEmail").value(hasItem(DEFAULT_COMPANY_EMAIL.toString())))
            .andExpect(jsonPath("$.[*].companyFax").value(hasItem(DEFAULT_COMPANY_FAX.toString())))
            .andExpect(jsonPath("$.[*].companyPhone").value(hasItem(DEFAULT_COMPANY_PHONE.toString())));
    }
    
    @Test
    @Transactional
    public void getCompany() throws Exception {
        // Initialize the database
        companyRepository.saveAndFlush(company);

        // Get the company
        restCompanyMockMvc.perform(get("/api/companies/{id}", company.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(company.getId().intValue()))
            .andExpect(jsonPath("$.companyUserName").value(DEFAULT_COMPANY_USER_NAME.toString()))
            .andExpect(jsonPath("$.companyPassWord").value(DEFAULT_COMPANY_PASS_WORD.toString()))
            .andExpect(jsonPath("$.companyTINnumber").value(DEFAULT_COMPANY_TI_NNUMBER.toString()))
            .andExpect(jsonPath("$.companyEmail").value(DEFAULT_COMPANY_EMAIL.toString()))
            .andExpect(jsonPath("$.companyFax").value(DEFAULT_COMPANY_FAX.toString()))
            .andExpect(jsonPath("$.companyPhone").value(DEFAULT_COMPANY_PHONE.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingCompany() throws Exception {
        // Get the company
        restCompanyMockMvc.perform(get("/api/companies/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateCompany() throws Exception {
        // Initialize the database
        companyRepository.saveAndFlush(company);

        int databaseSizeBeforeUpdate = companyRepository.findAll().size();

        // Update the company
        Company updatedCompany = companyRepository.findById(company.getId()).get();
        // Disconnect from session so that the updates on updatedCompany are not directly saved in db
        em.detach(updatedCompany);
        updatedCompany
            .companyUserName(UPDATED_COMPANY_USER_NAME)
            .companyPassWord(UPDATED_COMPANY_PASS_WORD)
            .companyTINnumber(UPDATED_COMPANY_TI_NNUMBER)
            .companyEmail(UPDATED_COMPANY_EMAIL)
            .companyFax(UPDATED_COMPANY_FAX)
            .companyPhone(UPDATED_COMPANY_PHONE);
        CompanyDTO companyDTO = companyMapper.toDto(updatedCompany);

        restCompanyMockMvc.perform(put("/api/companies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(companyDTO)))
            .andExpect(status().isOk());

        // Validate the Company in the database
        List<Company> companyList = companyRepository.findAll();
        assertThat(companyList).hasSize(databaseSizeBeforeUpdate);
        Company testCompany = companyList.get(companyList.size() - 1);
        assertThat(testCompany.getCompanyUserName()).isEqualTo(UPDATED_COMPANY_USER_NAME);
        assertThat(testCompany.getCompanyPassWord()).isEqualTo(UPDATED_COMPANY_PASS_WORD);
        assertThat(testCompany.getCompanyTINnumber()).isEqualTo(UPDATED_COMPANY_TI_NNUMBER);
        assertThat(testCompany.getCompanyEmail()).isEqualTo(UPDATED_COMPANY_EMAIL);
        assertThat(testCompany.getCompanyFax()).isEqualTo(UPDATED_COMPANY_FAX);
        assertThat(testCompany.getCompanyPhone()).isEqualTo(UPDATED_COMPANY_PHONE);
    }

    @Test
    @Transactional
    public void updateNonExistingCompany() throws Exception {
        int databaseSizeBeforeUpdate = companyRepository.findAll().size();

        // Create the Company
        CompanyDTO companyDTO = companyMapper.toDto(company);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restCompanyMockMvc.perform(put("/api/companies")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(companyDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Company in the database
        List<Company> companyList = companyRepository.findAll();
        assertThat(companyList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteCompany() throws Exception {
        // Initialize the database
        companyRepository.saveAndFlush(company);

        int databaseSizeBeforeDelete = companyRepository.findAll().size();

        // Delete the company
        restCompanyMockMvc.perform(delete("/api/companies/{id}", company.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Company> companyList = companyRepository.findAll();
        assertThat(companyList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Company.class);
        Company company1 = new Company();
        company1.setId(1L);
        Company company2 = new Company();
        company2.setId(company1.getId());
        assertThat(company1).isEqualTo(company2);
        company2.setId(2L);
        assertThat(company1).isNotEqualTo(company2);
        company1.setId(null);
        assertThat(company1).isNotEqualTo(company2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(CompanyDTO.class);
        CompanyDTO companyDTO1 = new CompanyDTO();
        companyDTO1.setId(1L);
        CompanyDTO companyDTO2 = new CompanyDTO();
        assertThat(companyDTO1).isNotEqualTo(companyDTO2);
        companyDTO2.setId(companyDTO1.getId());
        assertThat(companyDTO1).isEqualTo(companyDTO2);
        companyDTO2.setId(2L);
        assertThat(companyDTO1).isNotEqualTo(companyDTO2);
        companyDTO1.setId(null);
        assertThat(companyDTO1).isNotEqualTo(companyDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(companyMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(companyMapper.fromId(null)).isNull();
    }
}
