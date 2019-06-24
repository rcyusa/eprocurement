package rw.co.snw.web.rest;
import rw.co.snw.service.UserExtraService;
import rw.co.snw.web.rest.errors.BadRequestAlertException;
import rw.co.snw.web.rest.util.HeaderUtil;
import rw.co.snw.web.rest.util.PaginationUtil;
import rw.co.snw.service.dto.UserExtraDTO;
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
 * REST controller for managing UserExtra.
 */
@RestController
@RequestMapping("/api")
public class UserExtraResource {

    private final Logger log = LoggerFactory.getLogger(UserExtraResource.class);

    private static final String ENTITY_NAME = "userExtra";

    private final UserExtraService userExtraService;

    public UserExtraResource(UserExtraService userExtraService) {
        this.userExtraService = userExtraService;
    }

    /**
     * POST  /user-extras : Create a new userExtra.
     *
     * @param userExtraDTO the userExtraDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new userExtraDTO, or with status 400 (Bad Request) if the userExtra has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/user-extras")
    public ResponseEntity<UserExtraDTO> createUserExtra(@RequestBody UserExtraDTO userExtraDTO) throws URISyntaxException {
        log.debug("REST request to save UserExtra : {}", userExtraDTO);
        if (userExtraDTO.getId() != null) {
            throw new BadRequestAlertException("A new userExtra cannot already have an ID", ENTITY_NAME, "idexists");
        }
        UserExtraDTO result = userExtraService.save(userExtraDTO);
        return ResponseEntity.created(new URI("/api/user-extras/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /user-extras : Updates an existing userExtra.
     *
     * @param userExtraDTO the userExtraDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated userExtraDTO,
     * or with status 400 (Bad Request) if the userExtraDTO is not valid,
     * or with status 500 (Internal Server Error) if the userExtraDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/user-extras")
    public ResponseEntity<UserExtraDTO> updateUserExtra(@RequestBody UserExtraDTO userExtraDTO) throws URISyntaxException {
        log.debug("REST request to update UserExtra : {}", userExtraDTO);
        if (userExtraDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        UserExtraDTO result = userExtraService.save(userExtraDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, userExtraDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /user-extras : get all the userExtras.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of userExtras in body
     */
    @GetMapping("/user-extras")
    public ResponseEntity<List<UserExtraDTO>> getAllUserExtras(Pageable pageable) {
        log.debug("REST request to get a page of UserExtras");
        Page<UserExtraDTO> page = userExtraService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/user-extras");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /user-extras/:id : get the "id" userExtra.
     *
     * @param id the id of the userExtraDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the userExtraDTO, or with status 404 (Not Found)
     */
    @GetMapping("/user-extras/{id}")
    public ResponseEntity<UserExtraDTO> getUserExtra(@PathVariable Long id) {
        log.debug("REST request to get UserExtra : {}", id);
        Optional<UserExtraDTO> userExtraDTO = userExtraService.findOne(id);
        return ResponseUtil.wrapOrNotFound(userExtraDTO);
    }

    /**
     * DELETE  /user-extras/:id : delete the "id" userExtra.
     *
     * @param id the id of the userExtraDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/user-extras/{id}")
    public ResponseEntity<Void> deleteUserExtra(@PathVariable Long id) {
        log.debug("REST request to delete UserExtra : {}", id);
        userExtraService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
