package nl.hu.RichRail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import nl.hu.DAO.EntityManagerProvider;
import nl.hu.domain.Train;
import nl.hu.logic.TrainService;

public class App 
	{

    	 public static void main(String[] args) throws IOException {
             EntityManager em = EntityManagerProvider.getEntityManager();
             
             TrainService trainService = new TrainService();
//             trainService.deleteProduct(7);
             System.out.println(trainService.getAllTrains());
             

    }
}
