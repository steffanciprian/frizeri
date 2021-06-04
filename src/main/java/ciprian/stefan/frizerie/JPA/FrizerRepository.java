package ciprian.stefan.frizerie.JPA;

import ciprian.stefan.frizerie.entitiesDB.Frizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrizerRepository extends JpaRepository<Frizer,Long> {

    @Override
    @Query(value = "SELECT * FROM frizerie.Frizer ", nativeQuery = true)
    List<Frizer> findAll();
}
