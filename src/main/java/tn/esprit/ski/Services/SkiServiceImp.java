package tn.esprit.ski.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.servlet.theme.CookieThemeResolver;
import tn.esprit.ski.Repositories.PisteRepository;
import tn.esprit.ski.Repositories.SkiRepository;
import tn.esprit.ski.entities.Piste;
import tn.esprit.ski.entities.Skieur;

import javax.print.attribute.standard.MediaSize;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

@Service
public class SkiServiceImp implements SkiService{
    @Autowired
    private SkiRepository skiRepository ;
    @Autowired
    private PisteRepository pisteRepository;

    @Override
    public void add(Skieur s) {
        skiRepository.save(s);
    }

    @Override
    public Skieur update(Skieur s) {return skiRepository.save(s);}

    @Override
    public List<Skieur> getAll() {
        return (List<Skieur>) skiRepository.findAll();
    }
    @Override
    public Skieur getById(Long id) {
        return skiRepository.findById(id).orElse(null);
    }
    @Override
    public void remove(long id) {
        skiRepository.deleteById(id);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur= skiRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"not found skieur");
       Piste p = pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(p,"pistes not found  ");


//           List <Piste> pistes = skieur.getPistes();
//           pistes.add(p);
//           skieur.setPistes(pistes);
           skieur.getPistes().add(p);
           return  skiRepository.save(skieur);

    }
}
