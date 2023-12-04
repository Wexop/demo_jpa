package fr.epsi.b32324c2;

import fr.epsi.b32324c2.entites.Livre;

import javax.persistence.*;
import java.util.List;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();
        Livre livre = em.find(Livre.class, 7);
        if (livre != null){
            em.remove(livre);
        }
        et.commit();

        // print all

        Query queryAllBooks = em.createQuery("SELECT l FROM Livre l");
        List<Livre> livres = queryAllBooks.getResultList();
        System.out.println("Liste de tous les livres en base de données:");
        for (Livre l : livres) {
            System.out.println(l.toString());
        }

        em.close();
        emf.close();




    }
}