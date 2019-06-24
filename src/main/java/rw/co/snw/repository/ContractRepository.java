package rw.co.snw.repository;

import rw.co.snw.domain.Contract;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import rw.co.snw.service.dto.ContractDTO;

import java.util.Optional;
import java.util.stream.DoubleStream;


/**
 * Spring Data  repository for the Contract entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    Optional<Contract> findOneByContractNumber(String contractNumber);
}
