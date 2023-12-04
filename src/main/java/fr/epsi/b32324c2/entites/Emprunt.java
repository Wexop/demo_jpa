package fr.epsi.b32324c2.entites;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "DATE_DEBUT")
    Date dateDebut;

    @Column(name = "DATE_FIN", nullable = true)
    Date dateFin;

    @Column(name = "DELAI")
    int delai;

    @ManyToMany
    @JoinTable(name = "compo",
            joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID")
    )
    Set<Livre> livres;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    Client client;

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", delai=" + delai +
                ", livres=" + livres +
                '}';
    }



    public Emprunt() {
    }

    public Emprunt(Date dateDebut, Date dateFin, int delai, int clientId) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
    }

    public Emprunt(int id, Date dateDebut, Date dateFin, int delai, int clientId) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }
}
