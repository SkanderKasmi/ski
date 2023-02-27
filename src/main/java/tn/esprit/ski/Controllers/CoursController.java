package tn.esprit.ski.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.ski.Services.CoursService;


import tn.esprit.ski.entities.Cours;

import java.util.List;
@RequestMapping("Cours")
@RestController
public class CoursController {
    @Autowired
    private CoursService coursService;
    @PostMapping()
    Cours addCours(@RequestBody Cours a){
        coursService.add(a);
        return a;
    }
    @GetMapping()
    List<Cours> listAll(){

        System.out.println(coursService.getAll());
        return coursService.getAll();
    }
    @PutMapping()
    Cours updateAbonnement(@RequestBody Cours a ){

        return  a;

    }
    @GetMapping("/{id}")
    Cours Listbyid ( @PathVariable long id){
        Cours a=coursService.getById(id).get();
        return a;
    }
    @DeleteMapping ("/{id}")
    void removeCours(@PathVariable long id)
    {
        coursService.remove(id);
    }

}
