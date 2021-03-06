package nl.hu.persistence.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import nl.hu.persistence.DaoJpaImpl.HibernateUtil;

public class EntityManagerProvider {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManager getEntityManager() {
        try {
            entityManagerFactory = HibernateUtil.getEntityManagerFactory();
            return entityManagerFactory.createEntityManager();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

}