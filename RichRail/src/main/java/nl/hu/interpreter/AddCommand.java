package nl.hu.interpreter;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;

public class AddCommand extends VehicleFinder implements ICommand {
    private final String to, add;
    private Logger logger = RailCompany.getInstance().getLogger();
    
    private TrainService trainService;
    private WagonService wagonService;

    public AddCommand(String add, String to) {
        this.to = to;
        this.add = add;
    }

    public void execute() {
        Train train = trainService.getTrainById(to);
        Wagon wagon = wagonService.getWagonById(add);
        if (train != null) {          
            if (wagon != null) {
                wagonService.AddToTrain(to, add);
                logger.add("Wagon " + add + " added to train " + to);
                logger.add("Wagon " + add + " is already attached to " + to);
            } else {
                logger.add("Can't find wagon " + add);
            }
        } else {
            logger.add("Can't find train " + to);
        }
    }
}