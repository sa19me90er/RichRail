package nl.hu.interpreter;

import nl.hu.domain.Train;
import nl.hu.logic.TrainService;

/**
 * Created by Jason on 08/01/2017.
 */
public class DeleteTrainCommand extends VehicleFinder implements ICommand {
    private final String id;
    private Logger logger = RailCompany.getInstance().getLogger();

    public DeleteTrainCommand(String id) {
        this.id = id;
    }

    @Override
    public void execute() {
    	TrainService trainService = new TrainService();
        Train train = trainService.getTrainById(id);
        if (train != null) {
        	trainService.deleteTrain(id);
            logger.add("Train " + id + " removed.");
        } else {
            logger.add("No train found with id " + id);
        }
    }
}