package nl.hu.domain;

import java.util.List;

import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;

public class TrainFacade {
		private TrainService trainService;
		
		public void makeTrain(String id){
			trainService.makeTrain(id);
			}
		public boolean deleteTrain(String id){
			return trainService.deleteTrain(id);
		}
		public List<Train> getAllTrains(){
			return trainService.getAllTrains();
		}
		
		public Train findById(String id){
			return trainService.getTrainById(id);
		}
		}
