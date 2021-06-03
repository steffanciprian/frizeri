package Controller;

import entities.Frizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.FrizerService;

import java.util.List;

@Controller
public class FrizerController {
    @Autowired
    FrizerService frizerService;

    @GetMapping("/frizeri")
    public List<Frizer> getFrizeri(@RequestParam(name = "name") String name) {
        return frizerService.getFrizeri(name);
    }
}
