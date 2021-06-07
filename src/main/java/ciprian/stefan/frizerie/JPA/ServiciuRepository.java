package ciprian.stefan.frizerie.JPA;

import ciprian.stefan.frizerie.entitiesDB.Serviciu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ServiciuRepository extends JpaRepository<Serviciu, Long> {


    //TODO
    //de reparat
    @Query(value = "SELECT s FROM frizerie.serviciu s where s.name = :name ", nativeQuery = true)
    Serviciu findServiciuByName(@Param("name") String name);
}
