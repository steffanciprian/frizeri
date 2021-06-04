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

    public List<Frizer> getFrizeri() {
        return frizerRepository.findAll();
    }

    public void saveFrizer(String name, int scaun) {
        Frizer frizer =
                Frizer.builder()
                        .name(name)
                        .scaun(scaun)
                        .build();
        frizerRepository.save(frizer);
    }
}
