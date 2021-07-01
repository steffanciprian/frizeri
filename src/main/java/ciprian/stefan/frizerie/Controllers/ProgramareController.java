package ciprian.stefan.frizerie.Controllers;

import ciprian.stefan.frizerie.Services.ProgramareService;
import ciprian.stefan.frizerie.entitiesDB.Programare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping
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

//    @GetMapping(path = "/programare/data-programare/{date}")
//    public List<Programare> getProgramariByDay(@PathParam("day") Integer day,
//                                               @PathParam("month") Integer month,
//                                               @PathParam("year") Integer year) {
//        LocalDate localDate = LocalDate.of(year, month, day);
//
//
//
//    }
}
