package fr.epsi.b32324c2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOURNISSEUR")
public class TestJpa {

    @Id
    private int ID;

    @Column(name = "NOM")
    private String nom;
}