package services;

import JPA.Repositories.FrizerRepo;
import entities.Frizer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FrizerService {
    @Autowired
    FrizerRepo frizerRepo;

    public List<Frizer> getFrizeri(String name) {
        return frizerRepo.findAllByName(name);
    }
}
