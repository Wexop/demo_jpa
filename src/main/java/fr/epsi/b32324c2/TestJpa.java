package fr.epsi.b32324c2;

import fr.epsi.b32324c2.entites.Livre;

import javax.persistence.*;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager em = emf.createEntityManager();


        TypedQuery<Livre> query2 = em.createQuery("select l from Livre l where l.auteur ='Jules Verne'", Livre.class);
        Livre h2 = query2.getResultList().get(0);

        if(h2 != null) {
            System.out.println(h2.toString());
        }


        em.close();
        emf.close();

    }
}