package fr.epsi.b32324c2.entites;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NOM")
    String nom;

    @Column(name = "PRENOM")
    String prenom;

    @OneToMany(mappedBy = "client")
    Set<Emprunt> emprunts;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emprunts=" + emprunts +
                '}';
    }

    public Client() {
    }
    public Client(int id) {
        this.id = id;
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
