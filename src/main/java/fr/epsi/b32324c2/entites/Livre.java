package fr.epsi.b32324c2.entites;

import javax.persistence.*;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TITRE")
    String titre;

    @Column(name = "AUTEUR")
    String auteur;

    @Override
    public String toString() {
        return String.format("{ id: %s, titre: %s, auteur: %s }", this.id, this.titre, this.auteur);
    }
}
