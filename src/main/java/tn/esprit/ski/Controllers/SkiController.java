package tn.esprit.ski.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Services.SkiService;

import tn.esprit.ski.entities.Skieur;

import java.util.List;
@RequestMapping("Skieur")
@RestController
public class SkiController {
    @Autowired
    private SkiService skiService;

    @PostMapping()
    Skieur addSkieur(@RequestBody Skieur s){
        skiService.add(s);
        return s;
    }
    @GetMapping()
    List<Skieur> listAll(){

        System.out.println(skiService.getAll());
        return skiService.getAll();
    }
    @PutMapping()
     Skieur updateSkieur(@RequestBody Skieur a ){

        return  a;

    }
    @GetMapping("/{id}")
    Skieur Listbyid ( @PathVariable long id){
        Skieur a=skiService.getById(id);
        return a;
    }
    @DeleteMapping ("/{id}")
    void removeSkieur(@PathVariable long id)
    {
        skiService.remove(id);
    }



}
