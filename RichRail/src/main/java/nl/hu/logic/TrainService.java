package nl.hu.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.persistence.DAO.EntityManagerProvider;
import nl.hu.persistence.DAO.TrainDAO;
import nl.hu.persistence.DAO.WagonDAO;
import nl.hu.persistence.DaoJpaImpl.TrainDaoJpaImpl;
import nl.hu.persistence.DaoJpaImpl.WagonDaoJpaImpl;



public class TrainService {
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager em = EntityManagerProvider.getEntityManager();
	
    public List<Train> getAllTrains() {
        TrainDAO trainDao = new TrainDaoJpaImpl(em);
        List<Train> allTrains = trainDao.getAll();
      return allTrains;
        }
	
    
    public Train getTrainById(String id) {
        TrainDAO trainDao = new TrainDaoJpaImpl(em);
        Train train = trainDao.findById(id);
        return train;

	}

    public boolean makeTrain(String id) {
		EntityManager em = EntityManagerProvider.getEntityManager();
		Train train= new Train(id);
		TrainDAO trainDao = new TrainDaoJpaImpl(em);
		em.getTransaction().begin();
        trainDao.insert(train);
		em.getTransaction().commit();
		em.close();
		return true;

	}
    
	public boolean deleteTrain(String id) {
		EntityManager em = EntityManagerProvider.getEntityManager();
		TrainDAO trainDao = new TrainDaoJpaImpl(em);
		Train train = trainDao.findById(id);
		em.getTransaction().begin();
		trainDao.delete(train);
		em.getTransaction().commit();
		em.close();
		return true;
	}
	
	public List<Wagon> getAllTrainWagons(String trainId){
		WagonService wagonService = new WagonService();
	    List<Wagon> allWagons = wagonService.getAllWagons();
	    List<Wagon> allTrainWagons = new ArrayList<Wagon>();
	      for (Wagon w : allWagons){
	    	   if (Objects.equals(w.getTrain(),trainId)){
	    		  allTrainWagons.add(w);
	    	  } 
	      }
	      return allTrainWagons;
	}
	
	public int getAllTrainSeats(String trainId){
		Train train = getTrainById(trainId);
		List <Wagon>trainWagons = getAllTrainWagons(trainId);
		int seats = 0;
		for (Wagon wagon : trainWagons){
			seats += wagon.getSeats();
		}
		return seats;
	}

}
