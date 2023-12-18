package fr.epsi.tp4;

import fr.epsi.tp4.entities.*;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a2");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();
        //CREATE A BANQUE
        em.persist(new Banque("Richou"));

        //CREATE A CLIENT
        Banque banque = em.find(Banque.class, 1);
        em.persist(new Client("Michel", "Bernard", LocalDate.now(), banque, new Adresse(30, "rue des noisettes", 44000 ,"NoisetteVille")));

        //CREATE A COMPTE
        Client client = em.find(Client.class, 1);
        em.persist(new Compte("1234", 20000.0, Set.of(client) ));

        //CREATE A OPERATION
        Compte compte = em.find(Compte.class, 1);
        em.persist(new Operation("Achat de noisette", 20.00, LocalDateTime.now(), compte ));

        //CREATE A LIVRET A
        em.persist(new LivretA("Livret A SUPER", 100.0, Set.of(client), 20.0 ));

        //CREATE A ASSURANCE VIE
        em.persist(new AssuranceVie("ASSURANCE VIE SUPER", 670.0, Set.of(client), 20.0, LocalDate.now() ));

        //CREATE A VIREMENT
        em.persist(new Virement("Virement noisette", 1230.30 ,LocalDateTime.now(), compte, "Michel"));



        et.commit(); // ou et.rollback()

        em.close();
        emf.close();

    }
}