package JPA.Repositories;

import entities.Serviciu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiciuRepo extends JpaRepository<Serviciu, Long> {
    List<Serviciu> findAllByServiciu(String serviciu);
}

