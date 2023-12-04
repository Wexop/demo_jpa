package fr.epsi.b32324c2;

import fr.epsi.b32324c2.entites.Livre;

import javax.persistence.*;
import java.util.List;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager em = emf.createEntityManager();

        //select auteur

/*        TypedQuery<Livre> query2 = em.createQuery("select l from Livre l where l.auteur ='Jules Verne'", Livre.class);
        Livre h2 = query2.getResultList().get(0);*/
        
        //select title

/*        TypedQuery<Livre> query2 = em.createQuery("select l from Livre l where l.titre ='ELMER'", Livre.class);
        Livre h2 = query2.getResultList().get(0);*/

        //update

/*        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(new Livre(5, "Du plaisir dans la cuisine", "Jean-Pierre Coffe"));
        et.commit(); // ou et.rollback()


        Livre livre = em.find(Livre.class, 5);
        if(livre != null) {
            System.out.println(livre.toString());
        }*/

        //insert

/*        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(new Livre("ELMER", "David McKee"));


        et.commit(); // ou et.rollback()

        Livre livre = em.find(Livre.class, 6);
        if(livre != null) {
            System.out.println(livre.toString());
        }*/

        // delete

/*        EntityTransaction et = em.getTransaction();
        et.begin();
        Livre livre = em.find(Livre.class, 7);
        if (livre != null){
            em.remove(livre);
        }
        et.commit();*/

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