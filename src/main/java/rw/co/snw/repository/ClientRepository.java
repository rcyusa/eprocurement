package rw.co.snw.repository;

import rw.co.snw.domain.Client;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Client entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findOneByClientTINNumber(String clientTINNumber);

}
