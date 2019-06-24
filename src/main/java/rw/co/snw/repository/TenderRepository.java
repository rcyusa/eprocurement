package rw.co.snw.repository;

import rw.co.snw.domain.Tender;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Tender entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TenderRepository extends JpaRepository<Tender, Long> {

}
