package tn.esprit.ski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.ski.Repositories.PisteRepository;
import tn.esprit.ski.Services.AbonService;
import tn.esprit.ski.Services.PisteService;
import tn.esprit.ski.Services.PisteServiceImpl;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Couleur;
import tn.esprit.ski.entities.Piste;
import tn.esprit.ski.entities.Skieur;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class controllerTest {
   Piste p1= new Piste(14L, "piste1" ,Couleur.BLEU,14,4);
    @Autowired
    private PisteService pisteService;


}
