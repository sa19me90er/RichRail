package nl.hu.presentation;

import java.io.IOException;

import javax.persistence.EntityManager;

import nl.hu.logic.TrainService;
import nl.hu.persistence.DAO.EntityManagerProvider;

public class App 
	{

    	 public static void main(String[] args) throws IOException {
             EntityManager em = EntityManagerProvider.getEntityManager();
             
             TrainService trainService = new TrainService();
//             trainService.deleteProduct(7);
             System.out.println(trainService.getAllTrains());
             

    }
}
