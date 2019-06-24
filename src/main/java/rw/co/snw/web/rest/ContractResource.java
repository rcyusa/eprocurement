package rw.co.snw.web.rest;
import rw.co.snw.service.ContractService;
import rw.co.snw.web.rest.errors.BadRequestAlertException;
import rw.co.snw.web.rest.util.HeaderUtil;
import rw.co.snw.web.rest.util.PaginationUtil;
import rw.co.snw.service.dto.ContractDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortType;
import rw.minecofin.roneps.hub.service.bid.TenderInformationServicePortTypeProxy;
import rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType;
import rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.bank.xsd.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Contract.
 */
@RestController
@RequestMapping("/api")
public class ContractResource {

    public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/ContractInformationService";

    private final Logger log = LoggerFactory.getLogger(ContractResource.class);

    private static final String ENTITY_NAME = "contract";

    private final ContractService contractService;

    public ContractResource(ContractService contractService) {
        this.contractService = contractService;
    }

    /**
     * POST  /contracts : Create a new contract.
     *
     * @param contractDTO the contractDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new contractDTO, or with status 400 (Bad Request) if the contract has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/contracts")
    public ResponseEntity<ContractDTO> createContract(@RequestBody ContractDTO contractDTO) throws URISyntaxException {
        log.debug("REST request to save Contract : {}", contractDTO);
        if (contractDTO.getId() != null) {
            throw new BadRequestAlertException("A new contract cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ContractDTO result = contractService.save(contractDTO);
        return ResponseEntity.created(new URI("/api/contracts/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /contracts : Updates an existing contract.
     *
     * @param contractDTO the contractDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated contractDTO,
     * or with status 400 (Bad Request) if the contractDTO is not valid,
     * or with status 500 (Internal Server Error) if the contractDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/contracts")
    public ResponseEntity<ContractDTO> updateContract(@RequestBody ContractDTO contractDTO) throws URISyntaxException {
        log.debug("REST request to update Contract : {}", contractDTO);
        if (contractDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ContractDTO result = contractService.save(contractDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, contractDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /contracts : get all the contracts.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of contracts in body
     */
    @GetMapping("/contracts")
    public ResponseEntity<List<ContractDTO>> getAllContracts(Pageable pageable) {
        log.debug("REST request to get a page of Contracts");
        Page<ContractDTO> page = contractService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/contracts");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /contracts/:id : get the "id" contract.
     *
     * @param id the id of the contractDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the contractDTO, or with status 404 (Not Found)
     */
    @GetMapping("/contracts/{id}")
    public ResponseEntity<ContractDTO> getContract(@PathVariable Long id) {
        log.debug("REST request to get Contract : {}", id);
        Optional<ContractDTO> contractDTO = contractService.findOne(id);
        return ResponseUtil.wrapOrNotFound(contractDTO);
    }

    /**
     * DELETE  /contracts/:id : delete the "id" contract.
     *
     * @param id the id of the contractDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/contracts/{id}")
    public ResponseEntity<Void> deleteContract(@PathVariable Long id) {
        log.debug("REST request to delete Contract : {}", id);
        contractService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    //consultContract/M00002/W/ICB/2018/KRH
    @RequestMapping(value = "/consultContract", method = RequestMethod.GET)
    public ContractInfo[] consultContract(String contractRefNumber) throws RemoteException {

        ContractInfo[] contractInfo = new ContractInfo[0];
        try {
            ContractInformationServicePortTypeProxy prox = new ContractInformationServicePortTypeProxy(epr);
            ContractInformationServicePortType portType = prox.getContractInformationServicePortType();
            ContractInfoRequest contractRequest = new ContractInfoRequest();

            contractRequest.setId("SONARWA");
            contractRequest.setPassword("SONARWA!03");
            contractRequest.setContractNumber(contractRefNumber);
            contractRequest.setContractName("");
            contractRequest.setContractSerialNumber("");

            ContractInfoResponse response = portType.getContractInformation(contractRequest);
            System.out.println(response.getResultCode());
            System.out.println(response.getResultMessage());
            contractInfo = response.getContractInfo();


        } catch (Exception e) {
            String Message = "Non Internet Conection";
        }

        return contractInfo;
    }
    @GetMapping("/contractTest")
    public void contractTest() throws RemoteException {
        ContractInformationServicePortTypeProxy prox = new ContractInformationServicePortTypeProxy(epr);
        ContractInformationServicePortType portType = prox.getContractInformationServicePortType();
        ContractInfoRequest contractRequest = new ContractInfoRequest();

        contractRequest.setId("SONARWA");
        contractRequest.setPassword("SONARWA!03");
        contractRequest.setContractNumber("M00002/W/ICB/2018/KRH");
        contractRequest.setContractName("");
        contractRequest.setContractSerialNumber("6");

        ContractInfoResponse response = portType.getContractInformation(contractRequest);
        System.out.println(response.getResultCode());
        System.out.println(response.getResultMessage());
        if(response.getResultCode().equals("0") ){
            ContractInfo[] contractInfo = response.getContractInfo();
            int size = contractInfo.length;
            for (int i = 0; i < size; i++) {
                System.out.println("============= Contract Information =============");
                System.out.println(contractInfo[i].getContractName());
                System.out.println(contractInfo[i].getContractNumber());
                System.out.println(contractInfo[i].getContractSerialNumber());
                System.out.println(contractInfo[i].getContractAmount());
                System.out.println(contractInfo[i].getContractAmountCharacter());
                System.out.println(contractInfo[i].getCurrency());
                System.out.println(contractInfo[i].getTotalTaxeAmount());
                System.out.println(contractInfo[i].getTotalTaxeAmountCharacter());
                System.out.println(contractInfo[i].getVatAmount());
                System.out.println(contractInfo[i].getVatRate());
                System.out.println("------ Warrant Amount -------");
                System.out.println(contractInfo[i].getWhtAmount());
                System.out.println("------ Warrant Rate -------");
                System.out.println(contractInfo[i].getWhtRate());
                System.out.println(contractInfo[i].getContractDurationYear());
                System.out.println(contractInfo[i].getContractDurationMonth());
                System.out.println(contractInfo[i].getContractDurationDay());
                System.out.println(contractInfo[i].getContractDate());
                System.out.println(contractInfo[i].getEffectiveDate());
                System.out.println(contractInfo[i].getWarantyYear());
                System.out.println(contractInfo[i].getWarantyMonth());
                System.out.println(contractInfo[i].getPenaltyDelayRate());
                System.out.println(contractInfo[i].getPenaltyLimitRate());
                System.out.println(contractInfo[i].getContractManagerName());
                System.out.println(contractInfo[i].getContractManagerPosition());
                System.out.println(contractInfo[i].getSupervisingFirm());
                System.out.println("------ PE Info -------");
                System.out.println(contractInfo[i].getPETINNumber());
                System.out.println(contractInfo[i].getPEName());
                System.out.println(contractInfo[i].getPERepresentativeName());
                System.out.println(contractInfo[i].getPETELNumber());
                System.out.println(contractInfo[i].getPEAddress());
                System.out.println(contractInfo[i].getTenderRefNumber());
                System.out.println("------ supplier Info -------");
                System.out.println(contractInfo[i].getSupplierName());
                System.out.println(contractInfo[i].getSupplierTINNumber());
                System.out.println(contractInfo[i].getAddress());
                System.out.println(contractInfo[i].getPoBox());
                System.out.println(contractInfo[i].getCellPhoneNumber());
                System.out.println(contractInfo[i].getTelNumber());
                System.out.println(contractInfo[i].getEMailAddress());

                System.out.println("------- LOT Info -----");
                LOTInfo[] lotInfo = contractInfo[i].getLotInfo();
                for (int j = 0; j < lotInfo.length; j++) {
                    System.out.println("LOT Name ["+j+"]"+lotInfo[j].getLotName());
                    System.out.println("LOT Number["+j+"]"+lotInfo[j].getLotNumber());
                    System.out.println("LOT Amt["+j+"]"+lotInfo[j].getLotAmount());
                }
            }
        }
    }
}
