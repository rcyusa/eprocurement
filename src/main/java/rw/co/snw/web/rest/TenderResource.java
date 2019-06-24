package rw.co.snw.web.rest;
import rw.co.snw.domain.Lot;
import rw.co.snw.domain.Tender;
import rw.co.snw.service.TenderService;
import rw.co.snw.service.dto.LotDTO;
import rw.co.snw.web.rest.errors.BadRequestAlertException;
import rw.co.snw.web.rest.util.HeaderUtil;
import rw.co.snw.web.rest.util.PaginationUtil;
import rw.co.snw.service.dto.TenderDTO;
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
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoRequest;
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderInfoResponse;
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderLOTInfo;
import rw.minecofin.roneps.hub.vo.bank.xsd.TenderNotificationInfo;

import java.net.URI;
import java.net.URISyntaxException;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * REST controller for managing Tender.
 */
@RestController
@RequestMapping("/api")
public class TenderResource {
    public static String epr = "http://www.umucyo.gov.rw:8084/roneps-hub/services/TenderInformationService";

    private final Logger log = LoggerFactory.getLogger(TenderResource.class);

    private static final String ENTITY_NAME = "tender";

    private final TenderService tenderService;

    public TenderResource(TenderService tenderService) {
        this.tenderService = tenderService;
    }

    /**
     * POST  /tenders : Create a new tender.
     *
     * @param tenderDTO the tenderDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new tenderDTO, or with status 400 (Bad Request) if the tender has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/tenders")
    public ResponseEntity<TenderDTO> createTender(@RequestBody TenderDTO tenderDTO) throws URISyntaxException {
        log.debug("REST request to save Tender : {}", tenderDTO);
        if (tenderDTO.getId() != null) {
            throw new BadRequestAlertException("A new tender cannot already have an ID", ENTITY_NAME, "idexists");
        }
        TenderDTO result = tenderService.save(tenderDTO);
        return ResponseEntity.created(new URI("/api/tenders/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /tenders : Updates an existing tender.
     *
     * @param tenderDTO the tenderDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated tenderDTO,
     * or with status 400 (Bad Request) if the tenderDTO is not valid,
     * or with status 500 (Internal Server Error) if the tenderDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/tenders")
    public ResponseEntity<TenderDTO> updateTender(@RequestBody TenderDTO tenderDTO) throws URISyntaxException {
        log.debug("REST request to update Tender : {}", tenderDTO);
        if (tenderDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        TenderDTO result = tenderService.save(tenderDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, tenderDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /tenders : get all the tenders.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of tenders in body
     */
    @GetMapping("/tenders")
    public ResponseEntity<List<TenderDTO>> getAllTenders(Pageable pageable) {
        log.debug("REST request to get a page of Tenders");
        Page<TenderDTO> page = tenderService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/tenders");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /tenders/:id : get the "id" tender.
     *
     * @param id the id of the tenderDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the tenderDTO, or with status 404 (Not Found)
     */
    @GetMapping("/tenders/{id}")
    public ResponseEntity<TenderDTO> getTender(@PathVariable Long id) {
        log.debug("REST request to get Tender : {}", id);
        Optional<TenderDTO> tenderDTO = tenderService.findOne(id);
        return ResponseUtil.wrapOrNotFound(tenderDTO);
    }

    /**
     * DELETE  /tenders/:id : delete the "id" tender.
     *
     * @param id the id of the tenderDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/tenders/{id}")
    public ResponseEntity<Void> deleteTender(@PathVariable Long id) {
        log.debug("REST request to delete Tender : {}", id);
        tenderService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }


    @RequestMapping(value = "/consulTender", method = RequestMethod.GET)
    public TenderNotificationInfo[] consulTender(String TenderRefNumber) throws RemoteException {

        TenderNotificationInfo[] noticeInfo = new TenderNotificationInfo[0];
        try {
            TenderInformationServicePortTypeProxy prox = new TenderInformationServicePortTypeProxy(epr);
            TenderInformationServicePortType portType = prox.getTenderInformationServicePortType();
            TenderInfoRequest tenderVo = new TenderInfoRequest();

            tenderVo.setId("SONARWA");
            tenderVo.setPassword("SONARWA!03");
            tenderVo.setTenderRefNumber(TenderRefNumber);
            tenderVo.setTenderRefName("");
            TenderInfoResponse returnVo;

            returnVo = portType.getTenderInformation(tenderVo);
            noticeInfo = returnVo.getTenderNotificationInfo();
            System.out.println(returnVo.getResultCode());
            System.out.println(returnVo.getResultMessage());

        } catch (Exception e) {
            String Message = "Non Internet Conection";
        }

        return noticeInfo;
    }
    //log.debug("REST request to get Tender : {}", id);
//Optional<TenderDTO> tenderDTO = tenderService.findOne(id);
    //return ResponseUtil.wrapOrNotFound(tenderDTO);
    @GetMapping("/tenderTest")
    public void tenderTest() throws RemoteException {
        TenderInformationServicePortTypeProxy prox = new TenderInformationServicePortTypeProxy(epr);
        TenderInformationServicePortType portType = prox.getTenderInformationServicePortType();
        TenderInfoRequest tenderVo = new TenderInfoRequest();
        tenderVo.setId("SONARWA");
        tenderVo.setPassword("SONARWA!03");
        tenderVo.setTenderRefNumber("000001/G/NCB/2018/2019/RMF");
        tenderVo.setTenderRefName("");

        TenderInfoResponse returnVo = portType.getTenderInformation(tenderVo);
        System.out.println(returnVo.getResultCode());
        System.out.println(returnVo.getResultMessage());
        TenderNotificationInfo[] noticeInfo = returnVo.getTenderNotificationInfo();
        int len = noticeInfo.length;
        if(returnVo.getResultCode().equals("0") ){
            for (int i = 0; i < len; i++) {
                System.out.println("================= Tender Information =================");
                System.out.println("Number: "+noticeInfo[i].getTenderRefNumber());
                System.out.println("TenderRefName: "+noticeInfo[i].getTenderRefName());
                System.out.println("OnOff: "+noticeInfo[i].getOnOff());
                System.out.println("PEName: "+noticeInfo[i].getPEName());
                System.out.println("PECode: "+noticeInfo[i].getPECode());
                System.out.println("TenderType: "+noticeInfo[i].getTenderType());
                System.out.println("TenderMethod: "+noticeInfo[i].getTenderMethod());
                System.out.println("PublicDate: "+noticeInfo[i].getPublicDate());
                System.out.println("OpenDate: "+noticeInfo[i].getOpenDate());
                System.out.println("DeadLineDate: "+noticeInfo[i].getDeadLineDate());

                TenderLOTInfo[] lotInfo = noticeInfo[i].getTenderLOTInfo();
                System.out.println(lotInfo);
                int size = lotInfo.length;
                System.out.println("LOT size: "+size);
                if(size != 0){
                    for (int j = 0; j < size; j++) {
                        System.out.println("--------- LOT Information  -------");
                        System.out.println("LOT TenderLotNumber: "+lotInfo[j].getTenderLotNumber());
                        System.out.println("LOT TenderLotName: "+lotInfo[j].getTenderLotName());
                        System.out.println("LOT TenderLotDesc: "+lotInfo[j].getTenderLotDesc());
                        System.out.println("LOT Amount: "+lotInfo[j].getAmount());
                    }
                }
                System.out.println("==============================================");
            }
        }
    }
}
