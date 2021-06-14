package ciprian.stefan.frizerie.Controllers;

import ciprian.stefan.frizerie.Services.FrizerService;
import ciprian.stefan.frizerie.entitiesDB.Frizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping
public class FrizerController {
    private FrizerService frizerService;

    @Autowired
    public FrizerController(FrizerService frizerService) {
        this.frizerService = frizerService;
    }

    @GetMapping(path = "/programare/stylist")
    public List<Frizer> getFrizeri() {
        return frizerService.getFrizeri();
    }

    @PostMapping(path = "/adaugaFrizer")
    public void adaugaFrizer(@RequestParam("name") String name, @RequestParam("scaun") int scaun) {
        frizerService.saveFrizer(name, scaun);
    }
}
