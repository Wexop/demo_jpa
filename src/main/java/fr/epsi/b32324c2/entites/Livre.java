package fr.epsi.b32324c2.entites;

import javax.persistence.*;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "TITRE")
    String titre;

    @Column(name = "AUTEUR")
    String auteur;

    @Override
    public String toString() {
        return String.format("{ id: %s, titre: %s, auteur: %s }", this.id, this.titre, this.auteur);
    }

    public Livre() {

    }

    public Livre(int id) {
        this.id = id;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Livre(int id,String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.id = id;
    }
}
