package fr.epsi.tp4.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@DiscriminatorColumn(name = "TYPE")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String motif;

    private Double montant;


    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "ID_COMPTE")
    Compte compte;
    public Operation() {
    }

    public Operation(String motif, Double montant, LocalDateTime date) {
        this.motif = motif;
        this.montant = montant;
        this.date = date;
    }

    public Operation(String motif, Double montant, LocalDateTime date, Compte compte) {
        this.motif = motif;
        this.montant = montant;
        this.date = date;
        this.compte = compte;
    }

    public Operation(int id, String motif, Double montant, LocalDateTime date, Compte compte) {
        this.id = id;
        this.motif = motif;
        this.montant = montant;
        this.date = date;
        this.compte = compte;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
