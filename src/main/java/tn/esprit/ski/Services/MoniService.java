package tn.esprit.ski.Services;

import tn.esprit.ski.entities.Moniteur;

import java.util.List;
import java.util.Optional;

public interface MoniService {
    void add(Moniteur m);
    Moniteur update(Moniteur m);
    List<Moniteur> getAll();
    Optional<Moniteur> getById(long id);
    void remove(long id);
}
