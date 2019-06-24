package rw.co.snw.repository;

import rw.co.snw.domain.Lot;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Lot entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LotRepository extends JpaRepository<Lot, Long> {

}
