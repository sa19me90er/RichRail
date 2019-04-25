package nl.hu.logic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.persistence.DAO.EntityManagerProvider;
import nl.hu.persistence.DAO.WagonDAO;
import nl.hu.persistence.DaoJpaImpl.WagonDaoJpaImpl;

public class WagonService {
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager em = EntityManagerProvider.getEntityManager();

	public List<Wagon> getAllWagons() {
		WagonDAO wagonDAO = new WagonDaoJpaImpl(em);
		List<Wagon> allWagons = wagonDAO.getAll();
		return allWagons;
	}

	public Wagon getWagonById(String id) {
		WagonDAO wagonDao = new WagonDaoJpaImpl(em);
		Wagon wagon = wagonDao.findById(id);

		return wagon;
	}

	public boolean makeWagon(String wagonID, int seats, String type) {
		EntityManager em = EntityManagerProvider.getEntityManager();
		Wagon wagon = new Wagon(wagonID, seats, type);
		WagonDAO wagonDAO = new WagonDaoJpaImpl(em);
		em.getTransaction().begin();
		wagonDAO.insert(wagon);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	public boolean deleteWagon(String id) {
		EntityManager em = EntityManagerProvider.getEntityManager();
		WagonDAO wagonDAO = new WagonDaoJpaImpl(em);
		Wagon wagon = wagonDAO.findById(id);
		em.getTransaction().begin();
		wagonDAO.delete(wagon);
		em.getTransaction().commit();
		em.close();
		return true;

	}

	public boolean updateWagon(String id, int seats, String type, String trainID) {
		EntityManager em = EntityManagerProvider.getEntityManager();
		WagonDAO wagonDAO = new WagonDaoJpaImpl(em);
		Wagon wagon = wagonDAO.findById(id);
		wagon.setSeats(seats);
		wagon.setType(type);
		TrainService trainService = new TrainService();
		Train train = trainService.getTrainById(trainID);
		wagon.setTrain(train);
		em.getTransaction().begin();
		wagonDAO.update(wagon);
		em.getTransaction().commit();
		em.close();

		return true;
	}
}
