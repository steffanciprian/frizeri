package ciprian.stefan.frizerie.JPA;

import ciprian.stefan.frizerie.entitiesDB.Programare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ProgramareRepository  extends JpaRepository<Programare,Long> {

    List<Programare> findAllByDataProgramare(LocalDate dataProgramare);
}
