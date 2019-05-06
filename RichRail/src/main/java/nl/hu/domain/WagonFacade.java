package nl.hu.domain;

import java.util.List;

import nl.hu.logic.WagonService;



public class WagonFacade {

	private WagonService wagonService;
	
	public boolean makeWagon(String id,String type){
		return true;
		}
	
	public boolean deleteWagon (String id){
		return wagonService.deleteWagon(id);
	}
	public List<Wagon> getAllWagons(){
		return wagonService.getAllWagons();
	}
	
	public Wagon findById(String id){
		return wagonService.getWagonById(id);
	}
	
	public boolean updateWagon(String id, int seats, String type, String trainID) {
		return wagonService.updateWagon(id, seats, type, trainID);
	}
	}