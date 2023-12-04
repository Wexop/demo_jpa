package fr.epsi.b32324c2;

import fr.epsi.b32324c2.entites.Emprunt;
import fr.epsi.b32324c2.entites.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestBibliotheque {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager em = emf.createEntityManager();

        Emprunt h2 = em.find(Emprunt.class, 1);

        System.out.println(h2.toString());


        em.close();
        emf.close();
    }
}
