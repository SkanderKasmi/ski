package tn.esprit.ski.Services;

import tn.esprit.ski.entities.Piste;

import java.util.List;
import java.util.Optional;

public interface PisteService {

    void add(Piste p);
    Piste update(Piste p);
    List<Piste> getAll();
    Optional<Piste> getById(long id);
    void remove(long id);
}
