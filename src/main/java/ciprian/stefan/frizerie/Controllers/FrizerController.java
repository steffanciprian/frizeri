package ciprian.stefan.frizerie.Controllers;

import ciprian.stefan.frizerie.DTO.FrizerDTO;
import ciprian.stefan.frizerie.Services.FrizerService;
import ciprian.stefan.frizerie.entitiesDB.Frizer;
import ciprian.stefan.frizerie.entitiesDB.Programare;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping
public class FrizerController {
    private FrizerService frizerService;

    @Autowired
    public FrizerController(FrizerService frizerService) {
        this.frizerService = frizerService;
    }

//    @GetMapping(path = "/frizeri")
//    public List<Frizer> getFrizeri(@RequestParam("name") String name) {
//        return frizerService.getFrizeri(name);
//    }

    @GetMapping(path = "/frizeri")
    public List<Frizer> getFrizeri()
    {
        return frizerService.getFrizeri();
    }

    @PostMapping(path = "/adaugaFrizer")
    public void adaugaFrizer(){
        frizerService.saveFrizer();
    }
}
