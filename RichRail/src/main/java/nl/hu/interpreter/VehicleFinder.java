package nl.hu.interpreter;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;

public class VehicleFinder {


    /**
     * Returns a train
     */
    Train findTrain(String id) {
    	TrainService trainService= new TrainService();
        for (Train t : trainService.getAllTrains()) {
            if (t.getTrainID().equals(id)) {
                return t;
            }
        }
        return null;
    }

    /**
     * Returns a wagon
     */
    Wagon findWagon(String id) {
    	WagonService wagonService = new WagonService();

        for (Wagon w : wagonService.getAllWagons()) {
        	Train wagonTrain = w.getTrain();
            if (wagonTrain.getTrainID().equals(id)) {
                return w;
            }
        }
        return null;
    }
}