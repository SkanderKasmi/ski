package tn.esprit.ski.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Services.AbonService;
import tn.esprit.ski.entities.Abonnement;

import java.util.List;
import java.util.Optional;

@RequestMapping("Abonnement")
@RestController
public class AboController {
    //localhost:9090/abonnement
    @Autowired
    private AbonService abonService;
    @PostMapping()
    Abonnement addAbonnement(@RequestBody Abonnement a){
        abonService.add(a);
        return a;
    }
    @GetMapping()
    List <Abonnement>listAll(){

        System.out.println(abonService.getAll());
        return abonService.getAll();
    }
    @PutMapping()
    Abonnement updateAbonnement(@RequestBody Abonnement a ){

        return  a;

    }
    @GetMapping("/{id}")
    Abonnement Listbyid ( @PathVariable long id){
        Abonnement a=abonService.getById(id).get();
         return a;
    }
    @DeleteMapping ("/{id}")
        void removeAbonnemnt(@PathVariable long id)
    {
        abonService.remove(id);
    }
}
