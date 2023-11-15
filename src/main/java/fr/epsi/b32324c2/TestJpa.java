package fr.epsi.b32324c2;

import fr.epsi.b32324c2.entites.Livre;

import javax.persistence.*;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager em = emf.createEntityManager();



        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(new Livre(5, "Du plaisir dans la cuisine", "Jean-Pierre Coffe"));
        et.commit(); // ou et.rollback()
        

        Livre livre = em.find(Livre.class, 5);
        if(livre != null) {
            System.out.println(livre.toString());
        }


        em.close();
        emf.close();

    }
}