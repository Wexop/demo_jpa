package fr.epsi.tp4.entities;

import fr.epsi.b32324c2.entites.Emprunt;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nom;

    private String prenom;

    private LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name = "ID_BANQUE")
    Banque banque;
    @ManyToMany(mappedBy = "clients")
    Set<Compte> comptes;

    @Embedded
    private Adresse adresse;

    public Client() {
    }

    public Client(String nom, String prenom, LocalDate dateNaissance, Banque banque, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.banque = banque;
        this.adresse = adresse;
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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
