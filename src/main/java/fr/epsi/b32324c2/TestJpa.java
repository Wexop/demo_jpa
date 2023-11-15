package fr.epsi.b32324c2;

import fr.epsi.b32324c2.entites.Livre;

import javax.persistence.*;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager entityManager = emf.createEntityManager();

        Livre livre = entityManager.find(Livre.class, 1);
        if(livre != null) {
            System.out.println(livre.toString());
        }


        entityManager.close();
        emf.close();

    }
}