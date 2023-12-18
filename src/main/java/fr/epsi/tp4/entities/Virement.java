package fr.epsi.tp4.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Virement extends Operation {
    private String beneficiaire;

    public Virement() {
    }

    public Virement(String motif, Double montant, LocalDateTime date, Compte compte, String beneficiaire) {
        super(motif, montant, date, compte);
        this.beneficiaire = beneficiaire;
    }

    public Virement(int id, String motif, Double montant, LocalDateTime date, Compte compte, String beneficiaire) {
        super(id, motif, montant, date, compte);
        this.beneficiaire = beneficiaire;
    }
}
