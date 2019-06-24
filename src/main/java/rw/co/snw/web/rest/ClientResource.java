package rw.co.snw.web.rest;
import rw.co.snw.domain.Client;
import rw.co.snw.repository.ClientRepository;
import rw.co.snw.service.ClientService;
import rw.co.snw.web.rest.errors.BadRequestAlertException;
import rw.co.snw.web.rest.util.HeaderUtil;
import rw.co.snw.web.rest.util.PaginationUtil;
import rw.co.snw.service.dto.ClientDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortType;
import rw.minecofin.roneps.hub.service.cont.ContractInformationServicePortTypeProxy;
import rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfo;
import rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoRequest;
import rw.minecofin.roneps.hub.vo.bank.xsd.ContractInfoResponse;

import java.net.URI;
import java.net.URISyntaxException;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Client.
 */
@RestController
@RequestMapping("/api")
public class ClientResource {

    private final Logger log = LoggerFactory.getLogger(ClientResource.class);

    private static final String ENTITY_NAME = "client";

    private final ClientService clientService;

    private final ClientRepository clientRepository;


    public ClientResource(ClientService clientService,ClientRepository clientRepository)
    {
        this.clientService = clientService;
        this.clientRepository = clientRepository;
    }



    /**
     * POST  /clients : Create a new client.
     *
     * @param clientDTO the clientDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new clientDTO, or with status 400 (Bad Request) if the client has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/clients")
    public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO) throws URISyntaxException {
        log.debug("REST request to save Client : {}", clientDTO);
        if (clientDTO.getId() != null) {
            throw new BadRequestAlertException("A new client cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ClientDTO result = clientService.save(clientDTO);
        return ResponseEntity.created(new URI("/api/clients/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /clients : Updates an existing client.
     *
     * @param clientDTO the clientDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated clientDTO,
     * or with status 400 (Bad Request) if the clientDTO is not valid,
     * or with status 500 (Internal Server Error) if the clientDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/clients")
    public ResponseEntity<ClientDTO> updateClient(@RequestBody ClientDTO clientDTO) throws URISyntaxException {
        log.debug("REST request to update Client : {}", clientDTO);
        if (clientDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ClientDTO result = clientService.save(clientDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, clientDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /clients : get all the clients.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of clients in body
     */
    @GetMapping("/clients")
    public ResponseEntity<List<ClientDTO>> getAllClients(Pageable pageable) {
        log.debug("REST request to get a page of Clients");
        Page<ClientDTO> page = clientService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/clients");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /clients/:id : get the "id" client.
     *
     * @param id the id of the clientDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the clientDTO, or with status 404 (Not Found)
     */
    @GetMapping("/clients/{id}")
    public ResponseEntity<ClientDTO> getClient(@PathVariable Long id) {
        log.debug("REST request to get Client : {}", id);
        Optional<ClientDTO> clientDTO = clientService.findOne(id);
        return ResponseUtil.wrapOrNotFound(clientDTO);
    }
    /**
     * GET  /clients/:clientTINNumber : get the "clientTINNumber" client.
     *
     * @param clientTINNumber the id of the clientDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the clientDTO, or with status 404 (Not Found)
     */

    @RequestMapping(value = "/clientByTINNumber", method = RequestMethod.GET)
    public Client getClientByTINNumber(String clientTINNumber) throws RemoteException {
        Client client = new Client();

            client=clientRepository.findOneByClientTINNumber(clientTINNumber);
        if(client != null) {
            System.out.println("TEST:"+client.getClientTINNumber());
            return client;
        } else {
            System.out.println("TEST:");
            return null;
        }





    }
    /**
     * DELETE  /clients/:id : delete the "id" client.
     *
     * @param id the id of the clientDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        log.debug("REST request to delete Client : {}", id);
        clientService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
