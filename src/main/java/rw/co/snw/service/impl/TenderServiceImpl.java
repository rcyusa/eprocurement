package rw.co.snw.service.impl;

import rw.co.snw.service.TenderService;
import rw.co.snw.domain.Tender;
import rw.co.snw.repository.TenderRepository;
import rw.co.snw.service.dto.TenderDTO;
import rw.co.snw.service.mapper.TenderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing Tender.
 */
@Service
@Transactional
public class TenderServiceImpl implements TenderService {

    private final Logger log = LoggerFactory.getLogger(TenderServiceImpl.class);

    private final TenderRepository tenderRepository;

    private final TenderMapper tenderMapper;

    public TenderServiceImpl(TenderRepository tenderRepository, TenderMapper tenderMapper) {
        this.tenderRepository = tenderRepository;
        this.tenderMapper = tenderMapper;
    }

    /**
     * Save a tender.
     *
     * @param tenderDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public TenderDTO save(TenderDTO tenderDTO) {
        log.debug("Request to save Tender : {}", tenderDTO);
        Tender tender = tenderMapper.toEntity(tenderDTO);
        tender = tenderRepository.save(tender);
        return tenderMapper.toDto(tender);
    }

    /**
     * Get all the tenders.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<TenderDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Tenders");
        return tenderRepository.findAll(pageable)
            .map(tenderMapper::toDto);
    }


    /**
     * Get one tender by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<TenderDTO> findOne(Long id) {
        log.debug("Request to get Tender : {}", id);
        return tenderRepository.findById(id)
            .map(tenderMapper::toDto);
    }

    /**
     * Delete the tender by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Tender : {}", id);
        tenderRepository.deleteById(id);
    }
}
