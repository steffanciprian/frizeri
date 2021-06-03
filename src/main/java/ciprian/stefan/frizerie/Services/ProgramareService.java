package ciprian.stefan.frizerie.Services;

import ciprian.stefan.frizerie.JPA.ProgramareRepository;
import ciprian.stefan.frizerie.entitiesDB.Programare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProgramareService {
    ProgramareRepository programareRepository;

    @Autowired
    public ProgramareService(ProgramareRepository programareRepository) {
        this.programareRepository = programareRepository;
    }

    public List<Programare> getProgramaryByDate(LocalDate dataProgramare) {
        return programareRepository.findAllByDataProgramare(dataProgramare);
    }
}
