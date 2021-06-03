package ciprian.stefan.frizerie.Services;

import ciprian.stefan.frizerie.JPA.FrizerRepository;
import ciprian.stefan.frizerie.entitiesDB.Frizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FrizerService {
    @Autowired
    FrizerRepository frizerRepository;

    public List<Frizer> getFrizeri(String name)
    {
        return  frizerRepository.findAllByName(name);
    }
}
