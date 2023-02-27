package tn.esprit.ski.Services;

import tn.esprit.ski.entities.Cours;

import java.util.List;
import java.util.Optional;

public interface CoursService {
    void add(Cours c);
    Cours update(Cours c);
    List<Cours> getAll();
    Optional<Cours> getById(long id);
    void remove(long id);

}

