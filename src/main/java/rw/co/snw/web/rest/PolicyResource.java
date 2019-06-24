package rw.co.snw.web.rest;

import rw.co.snw.domain.Contract;
import rw.co.snw.domain.User;
import rw.co.snw.repository.ContractRepository;
import rw.co.snw.service.*;
import rw.co.snw.service.dto.*;
import rw.co.snw.web.rest.errors.BadRequestAlertException;
import rw.co.snw.web.rest.util.HeaderUtil;
import rw.co.snw.web.rest.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortType;
import rw.minecofin.roneps.hub.service.security.GuaranteeDocumentServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.security.xsd.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.rmi.RemoteException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Policy.
 */
@RestController
@RequestMapping("/api")
public class PolicyResource {

    public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/GuaranteeDocumentService";
    private final Logger log = LoggerFactory.getLogger(PolicyResource.class);

    private static final String ENTITY_NAME = "policy";

    private final PolicyService policyService;
    private final LotService lotService;
    private final CompanyService companyService;
    private final ClientService clientService;
    private final UserExtraService userExtraService;
    private final UserService userService;
    private final BranchService branchService;
    private final ContractService contractService;
    private final ContractRepository contractRepository;


    public PolicyResource(BranchService branchService, UserService userService, UserExtraService userExtraService,
                          PolicyService policyService, LotService lotService, CompanyService companyService,
                          ClientService clientService, ContractService contractService, ContractRepository contractRepository) {
        this.policyService = policyService;
        this.lotService = lotService;
        this.companyService = companyService;
        this.clientService = clientService;
        this.userExtraService = userExtraService;
        this.userService = userService;
        this.branchService = branchService;
        this.contractService = contractService;
        this.contractRepository = contractRepository;
    }

    /**
     * POST  /policies : Create a new policy.
     *
     * @param policyDTO the policyDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new policyDTO, or with status 400 (Bad Request) if the policy has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/policies")
    public ResponseEntity<PolicyDTO> createPolicy(@RequestBody PolicyDTO policyDTO) throws URISyntaxException {
        log.debug("REST request to save Policy : {}", policyDTO);
        if (policyDTO.getId() != null) {
            throw new BadRequestAlertException("A new policy cannot already have an ID", ENTITY_NAME, "idexists");
        }
        PolicyDTO result = policyService.save(policyDTO);
        return ResponseEntity.created(new URI("/api/policies/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /policies : Updates an existing policy.
     *
     * @param policyDTO the policyDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated policyDTO,
     * or with status 400 (Bad Request) if the policyDTO is not valid,
     * or with status 500 (Internal Server Error) if the policyDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/policies")
    public ResponseEntity<PolicyDTO> updatePolicy(@RequestBody PolicyDTO policyDTO) throws URISyntaxException {
        log.debug("REST request to update Policy : {}", policyDTO);
        if (policyDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        PolicyDTO result = policyService.save(policyDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, policyDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /policies : get all the policies.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of policies in body
     */
    @GetMapping("/policies")
    public ResponseEntity<List<PolicyDTO>> getAllPolicies(Pageable pageable) {
        log.debug("REST request to get a page of Policies");
        Page<PolicyDTO> page = policyService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/policies");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /policies/:id : get the "id" policy.
     *
     * @param id the id of the policyDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the policyDTO, or with status 404 (Not Found)
     */
    @GetMapping("/policies/{id}")
    public ResponseEntity<PolicyDTO> getPolicy(@PathVariable Long id) {
        log.debug("REST request to get Policy : {}", id);
        Optional<PolicyDTO> policyDTO = policyService.findOne(id);
        return ResponseUtil.wrapOrNotFound(policyDTO);
    }

    /**
     * DELETE  /policies/:id : delete the "id" policy.
     *
     * @param id the id of the policyDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/policies/{id}")
    public ResponseEntity<Void> deletePolicy(@PathVariable Long id) {
        log.debug("REST request to delete Policy : {}", id);
        policyService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    @GetMapping("/sendBid/{id}")
    public ResponseEntity<BidSecurityInfoResponse> sendPolicy(@PathVariable Long id) throws RemoteException {
        log.debug("REST request to get Policy : {}", id);
        Optional<PolicyDTO> policyDTO = policyService.findOne(id);
        BidSecurityInfoResponse response = new BidSecurityInfoResponse();

        response = sendBidSecurity(id);

        System.out.println("test:" + policyDTO.get().getPolicyNumber());

        return ResponseEntity.ok()
            .headers(HeaderUtil.sendEntityAlert(ENTITY_NAME, response.getResultMessage()))
            .body(response);


    }


    public BidSecurityInfoResponse sendBidSecurity(Long policyId)
        throws RemoteException {
        GuaranteeDocumentServicePortTypeProxy prox = new GuaranteeDocumentServicePortTypeProxy(epr);
        GuaranteeDocumentServicePortType portType = prox.getGuaranteeDocumentServicePortType();
        Long id = 1L;
        Optional<CompanyDTO> companyDTO = companyService.findOne(id);

        System.out.println("policyId:" + policyId);

        Optional<PolicyDTO> policyDTO = policyService.findOne(policyId);
        Optional<LotDTO> lotDTO = lotService.findOne(policyDTO.get().getLotOnPolicyId());

        System.out.println(policyDTO.get().getPolicyNumber());
        BidSecurityInfoRequest request = new BidSecurityInfoRequest();
        request.setId(companyDTO.get().getCompanyUserName());
        request.setPassword(companyDTO.get().getCompanyPassWord());

        TenderNotificationInfo tenderNotificationInfoVO = new TenderNotificationInfo();

        tenderNotificationInfoVO.setTenderRefNumber(lotDTO.get().getLotRefNumber());
        tenderNotificationInfoVO.setTenderLotNumber(lotDTO.get().getLotNumber());
        tenderNotificationInfoVO.setTenderLotName(lotDTO.get().getLotName());

        request.setTenderNotificationInfo(tenderNotificationInfoVO);

        SupplierInfo supplierInfoVO = new SupplierInfo();
        Optional<ClientDTO> clientDTO = clientService.findOne(policyDTO.get().getClientId());
        supplierInfoVO.setSupplierName(clientDTO.get().getClientName());
        supplierInfoVO.setSupplierTINNumber(clientDTO.get().getClientTINNumber());
        supplierInfoVO.setAddressSupplier(clientDTO.get().getClientAddress());
        System.out.println(clientDTO.get().getClientTINNumber());
        request.setSupplierInfo(supplierInfoVO);

        IssueBankInfo issueBankInfoVO = new IssueBankInfo();
        issueBankInfoVO.setBankName(companyDTO.get().getCompanyUserName());
        issueBankInfoVO.setBankTINNumber(companyDTO.get().getCompanyTINnumber());
        Optional<UserExtraDTO> userExtraDTO = userExtraService.findOne(policyDTO.get().getClientId());
        Optional<User> user = userService.getUserWithAuthorities(policyDTO.get().getClientId());
        issueBankInfoVO.setSecurityRepresentiveName(user.get().getFirstName() + " " + user.get().getLastName());
        System.out.println(issueBankInfoVO.getSecurityRepresentiveName());

        Optional<BranchDTO> branchDTO = branchService.findOne(userExtraDTO.get().getBranchId());

        issueBankInfoVO.setBankBranchName(branchDTO.get().getBranchName());
        issueBankInfoVO.setBranchManagerName(branchDTO.get().getBranchManager());
        issueBankInfoVO.setComment(policyDTO.get().getPolicyComment());
        issueBankInfoVO.setTelNumber(branchDTO.get().getBranchPhone());
        issueBankInfoVO.setFaxNumber(branchDTO.get().getBranchFax());
        issueBankInfoVO.setEmail(branchDTO.get().getBranchEmail());
        issueBankInfoVO.setBranchAddress(branchDTO.get().getBranchAddress());
        System.out.println(branchDTO.get().getBranchName());
        request.setIssueBankInfo(issueBankInfoVO);

        BidSecurityInfo bidSecurityInfoVO = new BidSecurityInfo();
        bidSecurityInfoVO.setSecurityNumber(policyDTO.get().getPolicyNumber());
        bidSecurityInfoVO.setSecurityName(policyDTO.get().getPolicyType());
        bidSecurityInfoVO.setAmountCharacter(policyDTO.get().getPolicyAmountChar());
        bidSecurityInfoVO.setAmount(Double.toString(policyDTO.get().getPolicyAmount()));
        bidSecurityInfoVO.setUnit(policyDTO.get().getPolicyAmountCurrancy());

        DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(policyDTO.get().getPolicyStartDate());
        String dateFormatee = fd.format(policyDTO.get().getPolicyStartDate());
        bidSecurityInfoVO.setStartDate(dateFormatee);
        System.out.println(bidSecurityInfoVO.getStartDate());

        bidSecurityInfoVO.setExpireDate(fd.format(policyDTO.get().getPolicyExpirationDate()));
        System.out.println(fd.format(policyDTO.get().getPolicyExpirationDate()));
        request.setBidSecurityInfo(bidSecurityInfoVO);

        BidSecurityInfoResponse response = portType.sendBidSecurityInformation(request);

        return response;
    }

    @GetMapping("/sendAdvanced/{id}")
    public ResponseEntity<AdvancePaymentInfoResponse> sendAdvanced(@PathVariable Long id) throws RemoteException {
        log.debug("REST request to get Policy : {}", id);
        Optional<PolicyDTO> policyDTO = policyService.findOne(id);
        AdvancePaymentInfoResponse advancePaymentInfoResponse = new AdvancePaymentInfoResponse();

        //
        advancePaymentInfoResponse = sendAdvancePayment(id);

        System.out.println("test:" + policyDTO.get().getPolicyNumber());

        return ResponseEntity.ok()
            .headers(HeaderUtil.sendEntityAlert(ENTITY_NAME, advancePaymentInfoResponse.getResultMessage()))
            .body(advancePaymentInfoResponse);


    }

    public AdvancePaymentInfoResponse sendAdvancePayment(Long policyId) throws RemoteException {
        GuaranteeDocumentServicePortTypeProxy prox = new GuaranteeDocumentServicePortTypeProxy(epr);
        GuaranteeDocumentServicePortType portType = prox.getGuaranteeDocumentServicePortType();
        DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        AdvancePaymentInfoRequest request = new AdvancePaymentInfoRequest();

        //credential
        Long id = 1L;
        Optional<CompanyDTO> companyDTO = companyService.findOne(id);

        //Policy
        Optional<PolicyDTO> policyDTO = policyService.findOne(policyId);


        //Client
        Optional<ClientDTO> clientDTO = clientService.findOne(policyDTO.get().getClientId());

        //User
        Optional<UserExtraDTO> userExtraDTO = userExtraService.findOne(policyDTO.get().getClientId());
        Optional<User> user = userService.getUserWithAuthorities(policyDTO.get().getClientId());

        //Branch
        Optional<BranchDTO> branchDTO = branchService.findOne(userExtraDTO.get().getBranchId());

        //Lot
        Optional<LotDTO> lotDTO = lotService.findOne(policyDTO.get().getLotOnPolicyId());

        //Contract
        Optional<Contract> contractDTO = contractRepository.findOneByContractNumber(lotDTO.get().getLotRefNumber());

        System.out.println("TEST CONTRACT:" + contractDTO.get().getContractName());

        request.setId(companyDTO.get().getCompanyUserName());
        request.setPassword(companyDTO.get().getCompanyPassWord());

        //request.setId("SONARWA");
        //request.setPassword("SONARWA!03");


        //
        request.setContractNumber(contractDTO.get().getContractNumber());
        request.setContractName(contractDTO.get().getContractName());
        request.setContractSerialNumber(contractDTO.get().getContractSerialNumber());
        request.setContractDate(contractDTO.get().getContractDate());

        //
        SupplierInfo supplierInfoVO = new SupplierInfo();
        supplierInfoVO.setSupplierName(clientDTO.get().getClientName());
        supplierInfoVO.setSupplierTINNumber(clientDTO.get().getClientTINNumber());
        supplierInfoVO.setSupplierRepresentiveName(clientDTO.get().getClientEmailAddress());
        supplierInfoVO.setAddressSupplier(clientDTO.get().getClientAddress());
        request.setSupplierInfo(supplierInfoVO);

        ProcuringEntityInfo PEInfoVO = new ProcuringEntityInfo();
        PEInfoVO.setPEName(contractDTO.get().getContractPEName());
        PEInfoVO.setPETINNumber(contractDTO.get().getContractPETINNumber());
        PEInfoVO.setChargerNameInPE(contractDTO.get().getContractPERepresentativeName());
        PEInfoVO.setAddressPE(contractDTO.get().getContractPEAddress());
        request.setProcuringEnityInfo(PEInfoVO);

        IssueBankInfo issueBankInfoVO = new IssueBankInfo();
        issueBankInfoVO.setBankName(companyDTO.get().getCompanyUserName());
        issueBankInfoVO.setBankTINNumber(companyDTO.get().getCompanyTINnumber());
        issueBankInfoVO.setSecurityRepresentiveName(user.get().getFirstName() + " " + user.get().getLastName());
        System.out.println(user.get().getFirstName() + " " + user.get().getLastName());

        issueBankInfoVO.setBankBranchName(branchDTO.get().getBranchName());
        issueBankInfoVO.setBranchManagerName(branchDTO.get().getBranchManager());
        issueBankInfoVO.setComment(policyDTO.get().getPolicyComment());
        issueBankInfoVO.setTelNumber(branchDTO.get().getBranchPhone());
        issueBankInfoVO.setFaxNumber(branchDTO.get().getBranchFax());
        issueBankInfoVO.setEmail(branchDTO.get().getBranchEmail());
        issueBankInfoVO.setBranchAddress(branchDTO.get().getBranchAddress());
        request.setIssueBankInfo(issueBankInfoVO);

        AdvancePaymentInfo advancePaymentInfoVO = new AdvancePaymentInfo();
        advancePaymentInfoVO.setGuaranteeNumber(policyDTO.get().getPolicyNumber());
        advancePaymentInfoVO.setAccountNumber(policyDTO.get().getPolicyNumber());
        advancePaymentInfoVO.setAmountCharacter(policyDTO.get().getPolicyAmountChar());
        advancePaymentInfoVO.setAmount(Double.toString(policyDTO.get().getPolicyAmount()));
        advancePaymentInfoVO.setUnit(policyDTO.get().getPolicyAmountCurrancy());
        advancePaymentInfoVO.setIssueDate(fd.format(policyDTO.get().getPolicyOperationDate()));
        advancePaymentInfoVO.setName(user.get().getFirstName() + " " + user.get().getLastName());
        advancePaymentInfoVO.setAddress(branchDTO.get().getBranchAddress());
        //advancePaymentInfoVO.setPosition(branchDTO.get().getBranchManager());
        advancePaymentInfoVO.setStartDate(fd.format(policyDTO.get().getPolicyStartDate()));
        advancePaymentInfoVO.setExpireDate(fd.format(policyDTO.get().getPolicyExpirationDate()));
        advancePaymentInfoVO.setStatus(policyDTO.get().getPolicyStatus()); //VALID,EXPIRED,TO BE SEIZED,SEIZED
        request.setAdvancePaymentInfo(advancePaymentInfoVO);

        AdvancePaymentInfoResponse response = portType.sendAdvancePaymentInformation(request);
        System.out.println(response.getResultCode());
        System.out.println(response.getResultMessage());


        return response;

    }

    @GetMapping("/sendPerformance/{id}")
    public ResponseEntity<PerformanceSecurityInfoResponse> sendPerformance(@PathVariable Long id) throws RemoteException {
        log.debug("REST request to get Policy : {}", id);
        GuaranteeDocumentServicePortTypeProxy prox = new GuaranteeDocumentServicePortTypeProxy(epr);
        GuaranteeDocumentServicePortType portType = prox.getGuaranteeDocumentServicePortType();
        DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Policy
        Optional<PolicyDTO> policyDTO = policyService.findOne(id);
        System.out.println("test:" + policyDTO.get().getPolicyNumber());

        //credential
        Optional<CompanyDTO> companyDTO = companyService.findOne(1L);



        //Client
        Optional<ClientDTO> clientDTO = clientService.findOne(policyDTO.get().getClientId());

        //User
        Optional<UserExtraDTO> userExtraDTO = userExtraService.findOne(policyDTO.get().getClientId());
        Optional<User> user = userService.getUserWithAuthorities(policyDTO.get().getClientId());

        //Branch
        Optional<BranchDTO> branchDTO = branchService.findOne(userExtraDTO.get().getBranchId());

        //Lot
        Optional<LotDTO> lotDTO = lotService.findOne(policyDTO.get().getLotOnPolicyId());

        //Contract
        Optional<Contract> contractDTO = contractRepository.findOneByContractNumber(lotDTO.get().getLotRefNumber());

        System.out.println("TEST CONTRACT:" + contractDTO.get().getContractName());

        PerformanceSecurityInfoRequest request = new PerformanceSecurityInfoRequest();
        request.setId(companyDTO.get().getCompanyUserName());
        request.setPassword(companyDTO.get().getCompanyPassWord());

        ContractInfo contractInfoVO = new ContractInfo();
        contractInfoVO.setContractName(contractDTO.get().getContractName());
        contractInfoVO.setContractNumber(contractDTO.get().getContractNumber());
        contractInfoVO.setContractSerialNumber(contractDTO.get().getContractSerialNumber());
        contractInfoVO.setContractDate(contractDTO.get().getContractDate());
        contractInfoVO.setPEName(contractDTO.get().getContractPEName());
        contractInfoVO.setPETINNumber(contractDTO.get().getContractPETINNumber());
        contractInfoVO.setSupplierName(clientDTO.get().getClientName());
        contractInfoVO.setSupplierTINNumber(clientDTO.get().getClientTINNumber());
        contractInfoVO.setAddress(clientDTO.get().getClientAddress());
        contractInfoVO.setEMailAddress(clientDTO.get().getClientEmailAddress());
        contractInfoVO.setTenderRefName(contractDTO.get().getContractName());
        contractInfoVO.setTenderRefNumber(contractDTO.get().getContractNumber());
        contractInfoVO.setCellPhoneNumber(clientDTO.get().getClientCellPhoneNumber());
        LOTInfo[] lotInfo = new LOTInfo[1];
        for (int i = 0; i < lotInfo.length; i++) {
            LOTInfo lotInfoVo = new LOTInfo();
            lotInfoVo.setLotName(lotDTO.get().getLotName());
            lotInfoVo.setLotNumber(lotDTO.get().getLotNumber());
            lotInfo[i] = lotInfoVo;
        }
        contractInfoVO.setLotInfo(lotInfo);
        request.setContractInfo(contractInfoVO);

        IssueBankInfo issueBankInfoVO = new IssueBankInfo();
        issueBankInfoVO.setBankName(companyDTO.get().getCompanyUserName());
        issueBankInfoVO.setBankTINNumber(companyDTO.get().getCompanyTINnumber());
        issueBankInfoVO.setSecurityRepresentiveName(user.get().getFirstName() + " " + user.get().getLastName());
        issueBankInfoVO.setBankBranchName(branchDTO.get().getBranchName());
        issueBankInfoVO.setBranchManagerName(branchDTO.get().getBranchManager());
        issueBankInfoVO.setComment(policyDTO.get().getPolicyComment());
        issueBankInfoVO.setTelNumber(branchDTO.get().getBranchPhone());
        issueBankInfoVO.setFaxNumber(branchDTO.get().getBranchFax());
        issueBankInfoVO.setEmail(branchDTO.get().getBranchEmail());
        issueBankInfoVO.setBranchAddress(branchDTO.get().getBranchAddress());
        request.setIssueBankInfo(issueBankInfoVO);


        PerformanceSecurityInfo performanceSecurityInfoVO = new PerformanceSecurityInfo();
        performanceSecurityInfoVO.setSecurityNumber(policyDTO.get().getPolicyNumber());
        performanceSecurityInfoVO.setSecurityName(contractDTO.get().getContractName());
        performanceSecurityInfoVO.setAmountCharacter(policyDTO.get().getPolicyAmountChar());
        performanceSecurityInfoVO.setAmount(Double.toString(policyDTO.get().getPolicyAmount()));
        performanceSecurityInfoVO.setUnit(policyDTO.get().getPolicyAmountCurrancy());
        performanceSecurityInfoVO.setStartDate(fd.format(policyDTO.get().getPolicyStartDate()));
        performanceSecurityInfoVO.setExpireDate(fd.format(policyDTO.get().getPolicyExpirationDate()));
        performanceSecurityInfoVO.setStatus(policyDTO.get().getPolicyStatus());
        request.setPerformanceSecurityInfo(performanceSecurityInfoVO);

        PerformanceSecurityInfoResponse response = portType.sendPerformSecurityInformation(request);

        System.out.println(response.getResultCode());
        System.out.println(response.getResultMessage());

        return ResponseEntity.ok()
            .headers(HeaderUtil.sendEntityAlert(ENTITY_NAME, response.getResultMessage()))
            .body(response);


    }
}
