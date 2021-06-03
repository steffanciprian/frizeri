package ciprian.stefan.frizerie.Services;

import ciprian.stefan.frizerie.JPA.FrizerRepository;
import ciprian.stefan.frizerie.entitiesDB.Frizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrizerService {
    FrizerRepository frizerRepository;

    @Autowired
    public FrizerService(FrizerRepository frizerRepository) {
        this.frizerRepository = frizerRepository;
    }

    public List<Frizer> getFrizeri(String name) {
        return frizerRepository.findAllByName(name);
    }

    public List<Frizer> getFrizeri() {
        return frizerRepository.findAll();
    }

    public void saveFrizer() {
        Frizer frizer = new Frizer();
        frizer.setId(1L);
        frizer.setName("Elena");
        frizer.setScaun(4);
        frizerRepository.save(frizer);
    }
}
