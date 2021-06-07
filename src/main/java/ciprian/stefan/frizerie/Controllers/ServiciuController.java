package ciprian.stefan.frizerie.Controllers;

import ciprian.stefan.frizerie.Services.ServiciuService;
import ciprian.stefan.frizerie.entitiesDB.Serviciu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/servicii")
public class ServiciuController {
    private ServiciuService serviciuService;

    @Autowired
    public ServiciuController(ServiciuService serviciuService) {
        this.serviciuService = serviciuService;
    }

    @GetMapping
    public List<Serviciu> getServicii() {
        return serviciuService.getServicii();
    }

    @GetMapping(path = "/{name}")
    public Serviciu getServiciuByName(@PathParam("name") String name) {
        return serviciuService.getServiciuByName(name);
    }

}
