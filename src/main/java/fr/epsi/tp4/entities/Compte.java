package fr.epsi.tp4.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String numero;

    private Double solde;

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    @OneToMany(mappedBy = "compte")
    Set<Operation> operations;

    @ManyToMany
    @JoinTable(name = "compte_client",
            joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "id")
    )
    Set<Client> clients;

    public Compte() {
    }

    public Compte(String numero, Double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public Compte(int id, String numero, Double solde) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
    }

    public Compte(String numero, Double solde, Set<Client> clients) {
        this.numero = numero;
        this.solde = solde;
        this.clients = clients;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
