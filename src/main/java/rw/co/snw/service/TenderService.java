package rw.co.snw.service;

import rw.co.snw.service.dto.TenderDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Tender.
 */
public interface TenderService {

    /**
     * Save a tender.
     *
     * @param tenderDTO the entity to save
     * @return the persisted entity
     */
    TenderDTO save(TenderDTO tenderDTO);

    /**
     * Get all the tenders.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<TenderDTO> findAll(Pageable pageable);


    /**
     * Get the "id" tender.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<TenderDTO> findOne(Long id);

    /**
     * Delete the "id" tender.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
