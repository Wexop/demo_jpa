package fr.epsi.tp4.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class AssuranceVie extends Compte {
    private Double taux;
    private LocalDate dateFin;

    public AssuranceVie() {
    }

    public AssuranceVie(int id, String numero, Double solde, Set<Client> clients, Double taux, LocalDate dateFin) {
        super(id, numero, solde, clients);
        this.taux = taux;
        this.dateFin = dateFin;
    }

    public AssuranceVie(String numero, Double solde, Set<Client> clients, Double taux, LocalDate dateFin) {
        super(numero, solde, clients);
        this.taux = taux;
        this.dateFin = dateFin;
    }
}
