package rw.co.snw.service.impl;

import rw.co.snw.service.LotService;
import rw.co.snw.domain.Lot;
import rw.co.snw.repository.LotRepository;
import rw.co.snw.service.dto.LotDTO;
import rw.co.snw.service.mapper.LotMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing Lot.
 */
@Service
@Transactional
public class LotServiceImpl implements LotService {

    private final Logger log = LoggerFactory.getLogger(LotServiceImpl.class);

    private final LotRepository lotRepository;

    private final LotMapper lotMapper;

    public LotServiceImpl(LotRepository lotRepository, LotMapper lotMapper) {
        this.lotRepository = lotRepository;
        this.lotMapper = lotMapper;
    }

    /**
     * Save a lot.
     *
     * @param lotDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public LotDTO save(LotDTO lotDTO) {
        log.debug("Request to save Lot : {}", lotDTO);
        Lot lot = lotMapper.toEntity(lotDTO);
        lot = lotRepository.save(lot);
        return lotMapper.toDto(lot);
    }

    /**
     * Get all the lots.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<LotDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Lots");
        return lotRepository.findAll(pageable)
            .map(lotMapper::toDto);
    }


    /**
     * Get one lot by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<LotDTO> findOne(Long id) {
        log.debug("Request to get Lot : {}", id);
        return lotRepository.findById(id)
            .map(lotMapper::toDto);
    }

    /**
     * Delete the lot by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Lot : {}", id);
        lotRepository.deleteById(id);
    }
}
