package nl.hu.logic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import nl.hu.domain.Train;
import nl.hu.persistence.DAO.EntityManagerProvider;
import nl.hu.persistence.DAO.TrainDAO;
import nl.hu.persistence.DaoJpaImpl.TrainDaoJpaImpl;



public class TrainService {
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager em = EntityManagerProvider.getEntityManager();
	
    public List<Train> getAllTrains() {
        TrainDAO trainDao = new TrainDaoJpaImpl(em);
        List<Train> allTrains = trainDao.getAll();
      return allTrains;
        }
	
    
    public Train getTrainById(int id) {
        TrainDAO trainDao = new TrainDaoJpaImpl(em);
        Train train = trainDao.findById(id);
        return train;

	}

    public boolean makeTrain(String name) {
		EntityManager em = EntityManagerProvider.getEntityManager();
		Train train= new Train(name);
		TrainDAO trainDao = new TrainDaoJpaImpl(em);
		em.getTransaction().begin();
        trainDao.insert(train);
		em.getTransaction().commit();
		em.close();
		return true;

	}
    
	public boolean deleteTrain(int id) {
		EntityManager em = EntityManagerProvider.getEntityManager();
		TrainDAO trainDao = new TrainDaoJpaImpl(em);
		Train train = trainDao.findById(id);
		em.getTransaction().begin();
		trainDao.delete(train);
		em.getTransaction().commit();
		em.close();
		return true;
	}

}
