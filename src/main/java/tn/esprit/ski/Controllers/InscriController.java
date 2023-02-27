package tn.esprit.ski.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Services.AbonService;
import tn.esprit.ski.Services.InscriService;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Inscription;

import java.util.List;
@RequestMapping("Inscription")
@RestController
public class InscriController {
    @Autowired
    private InscriService inscriService;
    @PostMapping()
    Inscription addInscription(@RequestBody Inscription a){
        inscriService.add(a);
        return a;
    }
    @GetMapping()
    List<Inscription> listAll(){

        System.out.println(inscriService.getAll());
        return inscriService.getAll();
    }
    @PutMapping()
    Inscription updateInscription(@RequestBody Inscription a ){

        return  a;

    }
    @GetMapping("/{id}")
    Inscription Listbyid ( @PathVariable long id){
        Inscription a=inscriService.getById(id);
        return a;
    }
    @DeleteMapping ("/{id}")
    void removeInscription(@PathVariable long id)
    {
        inscriService.remove(id);
    }
}
