package fr.epsi.tp4.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class LivretA extends Compte {
    private Double taux;

    public LivretA() {
    }

    public LivretA(String numero, Double solde, Set<Client> clients, Double taux) {
        super(numero, solde, clients);
        this.taux = taux;
    }

    public LivretA(int id, String numero, Double solde, Set<Client> clients, Double taux) {
        super(id, numero, solde, clients);
        this.taux = taux;
    }
}
