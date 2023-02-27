package tn.esprit.ski.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Services.PisteService;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Piste;

import java.util.List;
@RequestMapping("Piste")
@RestController
public class PisteController {
    @Autowired
    private PisteService pisteService;
    @PostMapping()
    Piste addPistes(@RequestBody Piste a){
        pisteService.add(a);
        return a;
    }
    @GetMapping()
    List<Piste> listAll(){

        System.out.println(pisteService.getAll());
        return pisteService.getAll();
    }
    @PutMapping()
    Piste updatePiste(@RequestBody Piste a ){

        return  a;

    }
    @GetMapping("/{id}")
    Piste Listbyid ( @PathVariable long id){
        Piste a=pisteService.getById(id).get();
        return a;
    }
    @DeleteMapping ("/{id}")
    void removePistes(@PathVariable long id)
    {
        pisteService.remove(id);
    }

}
