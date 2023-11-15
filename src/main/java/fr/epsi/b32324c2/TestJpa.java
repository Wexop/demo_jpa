package fr.epsi.b32324c2;

import fr.epsi.b32324c2.entites.Livre;

import javax.persistence.*;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager em = emf.createEntityManager();



        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(new Livre("ELMER", "David McKee"));


        et.commit(); // ou et.rollback()

        Livre livre = em.find(Livre.class, 6);
        if(livre != null) {
            System.out.println(livre.toString());
        }


        em.close();
        emf.close();

    }
}