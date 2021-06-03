package JPA.Repositories;

import entities.Frizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrizerRepo extends JpaRepository<Frizer,Long> {

    List<Frizer> findAllByName(String name);

}
