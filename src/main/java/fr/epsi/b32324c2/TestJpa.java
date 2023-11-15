package fr.epsi.b32324c2;

import javax.persistence.*;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager entityManager = null;

        try {
            // Create EntityManagerFactory
            emf = Persistence.createEntityManagerFactory("pu-a1");

            // Create EntityManager
            entityManager = emf.createEntityManager();

            System.out.println(entityManager.isOpen()); // Connect to the database

            // Perform database operations within a transaction if needed
            // Example: entityManager.getTransaction().begin();
            // ...

            // Commit the transaction if started
            // Example: entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close EntityManager
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }

            // Close EntityManagerFactory
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        }
    }
}
