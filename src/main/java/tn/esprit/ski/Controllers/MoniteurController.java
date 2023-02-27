package tn.esprit.ski.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Services.MoniService;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Moniteur;

import java.util.List;
@RequestMapping("Moniteur")
@RestController
public class MoniteurController {
    @Autowired
    private MoniService moniService;
    @PostMapping()
    Moniteur addMonieur(@RequestBody Moniteur a){
        moniService.add(a);
        return a;
    }
    @GetMapping()
    List<Moniteur> listAll(){

        System.out.println(moniService.getAll());
        return moniService.getAll();
    }
    @PutMapping()
    Moniteur updateMoniteur(@RequestBody Moniteur a ){

        return  a;

    }
    @GetMapping("/{id}")
    Moniteur Listbyid ( @PathVariable long id){
        Moniteur a=moniService.getById(id).get();
        return a;
    }
    @DeleteMapping ("/{id}")
    void removeMoniteur(@PathVariable long id)
    {
        moniService.remove(id);
    }

}
