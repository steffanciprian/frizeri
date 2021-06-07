package ciprian.stefan.frizerie.Services;

import ciprian.stefan.frizerie.DTO.ServiciuNumeSiPretDTO;
import ciprian.stefan.frizerie.JPA.ServiciuRepository;
import ciprian.stefan.frizerie.entitiesDB.Serviciu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciuService {
    ServiciuRepository serviciuRepository;

    @Autowired
    public ServiciuService(ServiciuRepository serviciuRepository) {
        this.serviciuRepository = serviciuRepository;
    }

    public List<Serviciu> getServicii() {
        return serviciuRepository.findAll();
    }

    public Serviciu getServiciuByName(String name) {
        return serviciuRepository.findServiciuByName(name);
    }

}
