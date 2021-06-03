package ciprian.stefan.frizerie.Controllers;

import ciprian.stefan.frizerie.Services.ProgramareService;
import ciprian.stefan.frizerie.entitiesDB.Programare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ProgramareController {
    ProgramareService programareService;

    @Autowired
    public ProgramareController(ProgramareService programareService) {
        this.programareService = programareService;
    }

    @GetMapping(path = "/programari")
    public List<Programare> getProgramariByDataProgramare(LocalDate dataProgramare) {
        return programareService.getProgramaryByDate(dataProgramare);
    }
}
