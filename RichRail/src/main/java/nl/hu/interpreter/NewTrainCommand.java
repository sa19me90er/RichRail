package nl.hu.interpreter;

import nl.hu.domain.Train;
import nl.hu.logic.TrainService;

/**
 * Created by Jason on 08/01/2017.
 */
public class NewTrainCommand extends VehicleFinder implements ICommand {
    private final String id;
    private Logger logger = RailCompany.getInstance().getLogger();

    public NewTrainCommand(String id) {
        this.id = id;
    }

    @Override
    public void execute() {
    	TrainService trainService = new TrainService();
        Train train = trainService.getTrainById(id);
        // not found
        if (train == null) {
            trainService.makeTrain(id);
            logger.add("new train created: " + id);
        } else {
            logger.add("Train with id: " + id + " already exists!");
        }
    }
}