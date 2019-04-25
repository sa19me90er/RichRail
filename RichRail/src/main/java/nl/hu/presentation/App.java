package nl.hu.presentation;

import java.io.IOException;

import javax.persistence.EntityManager;

import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;
import nl.hu.persistence.DAO.EntityManagerProvider;

public class App 
	{

    	 public static void main(String[] args) throws IOException {
             EntityManager em = EntityManagerProvider.getEntityManager();
             WagonService wagonService= new WagonService(); 
             TrainService trainService = new TrainService();
             
             wagonService.makeWagon("wg2", 25, "Locomotive");
             
//            trainService.makeTrain("tr2");
//             System.out.println(trainService.getAllTrains());
             

    }
}
