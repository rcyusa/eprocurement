package rw.co.snw.web.rest;
import rw.co.snw.service.LotService;
import rw.co.snw.web.rest.errors.BadRequestAlertException;
import rw.co.snw.web.rest.util.HeaderUtil;
import rw.co.snw.web.rest.util.PaginationUtil;
import rw.co.snw.service.dto.LotDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Lot.
 */
@RestController
@RequestMapping("/api")
public class LotResource {

    private final Logger log = LoggerFactory.getLogger(LotResource.class);

    private static final String ENTITY_NAME = "lot";

    private final LotService lotService;

    public LotResource(LotService lotService) {
        this.lotService = lotService;
    }

    /**
     * POST  /lots : Create a new lot.
     *
     * @param lotDTO the lotDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new lotDTO, or with status 400 (Bad Request) if the lot has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/lots")
    public ResponseEntity<LotDTO> createLot(@RequestBody LotDTO lotDTO) throws URISyntaxException {
        log.debug("REST request to save Lot : {}", lotDTO);
        if (lotDTO.getId() != null) {
            throw new BadRequestAlertException("A new lot cannot already have an ID", ENTITY_NAME, "idexists");
        }
        LotDTO result = lotService.save(lotDTO);
        return ResponseEntity.created(new URI("/api/lots/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /lots : Updates an existing lot.
     *
     * @param lotDTO the lotDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated lotDTO,
     * or with status 400 (Bad Request) if the lotDTO is not valid,
     * or with status 500 (Internal Server Error) if the lotDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/lots")
    public ResponseEntity<LotDTO> updateLot(@RequestBody LotDTO lotDTO) throws URISyntaxException {
        log.debug("REST request to update Lot : {}", lotDTO);
        if (lotDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        LotDTO result = lotService.save(lotDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, lotDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /lots : get all the lots.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of lots in body
     */
    @GetMapping("/lots")
    public ResponseEntity<List<LotDTO>> getAllLots(Pageable pageable) {
        log.debug("REST request to get a page of Lots");
        Page<LotDTO> page = lotService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/lots");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /lots/:id : get the "id" lot.
     *
     * @param id the id of the lotDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the lotDTO, or with status 404 (Not Found)
     */
    @GetMapping("/lots/{id}")
    public ResponseEntity<LotDTO> getLot(@PathVariable Long id) {
        log.debug("REST request to get Lot : {}", id);
        Optional<LotDTO> lotDTO = lotService.findOne(id);
        return ResponseUtil.wrapOrNotFound(lotDTO);
    }

    /**
     * DELETE  /lots/:id : delete the "id" lot.
     *
     * @param id the id of the lotDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/lots/{id}")
    public ResponseEntity<Void> deleteLot(@PathVariable Long id) {
        log.debug("REST request to delete Lot : {}", id);
        lotService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
