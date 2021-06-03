package ciprian.stefan.frizerie.JPA;

import ciprian.stefan.frizerie.entitiesDB.Frizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrizerRepository extends JpaRepository<Frizer,Long> {
    List<Frizer> findAllByName(String name);

}
