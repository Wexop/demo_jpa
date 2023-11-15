package fr.epsi.b32324c2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-a1");
        EntityManager entityManager = emf.createEntityManager();

        System.out.println(entityManager); // se connecte à la bdd

        entityManager.close();
        emf.close();

    }
}