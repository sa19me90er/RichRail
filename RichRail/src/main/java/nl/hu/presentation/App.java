package nl.hu.presentation;

import java.io.IOException;

import javax.persistence.EntityManager;

import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;
import nl.hu.persistence.DAO.EntityManagerProvider;

public class App {

	public static void main(String[] args) throws IOException {
		EntityManager em = EntityManagerProvider.getEntityManager();

		// TrainService trainService = new TrainService();
		// trainService.makeTrain("tr3");
		
		//System.out.println(trainService.getAllTrains());
		
		WagonService wagonService = new WagonService();
		wagonService.updateWagon("wg4", 25, "Shant", "tr1");

		System.out.println(wagonService.getAllWagons());

	}
}
