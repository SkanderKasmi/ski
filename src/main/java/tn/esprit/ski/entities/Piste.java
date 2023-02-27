package tn.esprit.ski.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numPiste;
    String nomPiste;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    int longeur;
    int pente;
    @ManyToMany(mappedBy = "pistes")
    List<Skieur> skieurs;

    public Piste(long numPiste, String nomPiste, Couleur couleur, int longeur, int pente) {
        this.numPiste = numPiste;
        this.nomPiste = nomPiste;
        this.couleur = couleur;
        this.longeur = longeur;
        this.pente = pente;
    }
}
