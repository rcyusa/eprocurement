package rw.co.snw.service.impl;

import rw.co.snw.service.PolicyService;
import rw.co.snw.domain.Policy;
import rw.co.snw.repository.PolicyRepository;
import rw.co.snw.service.dto.PolicyDTO;
import rw.co.snw.service.mapper.PolicyMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing Policy.
 */
@Service
@Transactional
public class PolicyServiceImpl implements PolicyService {

    private final Logger log = LoggerFactory.getLogger(PolicyServiceImpl.class);

    private final PolicyRepository policyRepository;

    private final PolicyMapper policyMapper;

    public PolicyServiceImpl(PolicyRepository policyRepository, PolicyMapper policyMapper) {
        this.policyRepository = policyRepository;
        this.policyMapper = policyMapper;
    }

    /**
     * Save a policy.
     *
     * @param policyDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public PolicyDTO save(PolicyDTO policyDTO) {
        log.debug("Request to save Policy : {}", policyDTO);
        Policy policy = policyMapper.toEntity(policyDTO);
        policy = policyRepository.save(policy);
        return policyMapper.toDto(policy);
    }

    /**
     * Get all the policies.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<PolicyDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Policies");
        return policyRepository.findAll(pageable)
            .map(policyMapper::toDto);
    }


    /**
     * Get one policy by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<PolicyDTO> findOne(Long id) {
        log.debug("Request to get Policy : {}", id);
        return policyRepository.findById(id)
            .map(policyMapper::toDto);
    }

    /**
     * Delete the policy by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Policy : {}", id);
        policyRepository.deleteById(id);
    }
}
