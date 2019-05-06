package nl.hu.logic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.persistence.DAO.EntityManagerProvider;
import nl.hu.persistence.DAO.TrainDAO;
import nl.hu.persistence.DAO.WagonDAO;
import nl.hu.persistence.DaoJpaImpl.TrainDaoJpaImpl;
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
<<<<<<< HEAD

	public boolean makeWagon(String id, String type) {

=======
	
	public boolean makeWagon(String id) {
>>>>>>> branch 'master' of https://github.com/sa19me90er/RichRail.git
		EntityManager em = EntityManagerProvider.getEntityManager();
<<<<<<< HEAD
		Wagon wagon = new Wagon(id, type);
		wagon.setSeats(25);
=======
		int seats = 25;
		String type = "wagon" ;
		Wagon wagon= new Wagon(id, seats, type);
>>>>>>> branch 'master' of https://github.com/sa19me90er/RichRail.git
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
		
		if (trainID != null){
		TrainService trainService = new TrainService();
		Train train = trainService.getTrainById(trainID);
		wagon.setTrain(train.getTrainID());
		}
		else {
			wagon.setTrain(trainID);
		}
		em.getTransaction().begin();
		wagonDAO.update(wagon);
		em.getTransaction().commit();
		em.close();

		return true;
	}
	
	public boolean OntkoppelWagon(String id){
		EntityManager em = EntityManagerProvider.getEntityManager();
		WagonDAO wagonDAO = new WagonDaoJpaImpl(em);
		Wagon wagon = wagonDAO.findById(id);
		wagon.setSeats(wagon.getSeats());
		wagon.setType(wagon.getType());
		TrainService trainService = new TrainService();
		wagon.setTrain(null);
		em.getTransaction().begin();
		wagonDAO.update(wagon);
		em.getTransaction().commit();
		em.close();

		return true;
	}
	
	public boolean AddToTrain(String WagonId, String TrainId){
		EntityManager em = EntityManagerProvider.getEntityManager();
		WagonDAO wagonDAO = new WagonDaoJpaImpl(em);
		Wagon wagon = wagonDAO.findById(WagonId);
		wagon.setSeats(wagon.getSeats());
		wagon.setType(wagon.getType());
		
		TrainService trainService = new TrainService();
		Train train = trainService.getTrainById(TrainId);
		wagon.setTrain(train.getTrainID());
		
		em.getTransaction().begin();
		wagonDAO.update(wagon);
		em.getTransaction().commit();
		em.close();
		return true;
	}
}
