package tn.esprit.ski.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Repositories.PisteRepository;
import tn.esprit.ski.entities.Piste;

import java.util.List;
import java.util.Optional;

@Service
public class PisteServiceImpl implements PisteService{
    @Autowired
    private PisteRepository pisteRepository;
    @Override
    public void add(Piste p){
        pisteRepository.save(p);
    }
    @Override
    public Piste update(Piste p){return pisteRepository.save(p);}
    @Override
    public List<Piste> getAll(){
        return (List<Piste>) pisteRepository.findAll();
    }
    @Override
    public Optional<Piste> getById(long id){
        return pisteRepository.findById(id);
    }
    @Override
    public void remove(long id){
        pisteRepository.deleteById(id);
    }
}
