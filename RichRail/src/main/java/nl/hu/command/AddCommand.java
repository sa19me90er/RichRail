package nl.hu.command;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;

public class AddCommand implements ICommand {
    private final String add;
    private final String to;
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
        logger.add(train.getTrainID());
        logger.add(wagon.toString());
        if (train != null) {          
            if (wagon != null) {
            	wagonService.updateWagon(wagon.getWagonID(), wagon.getSeats(), wagon.getType(), train.getTrainID());
                logger.add("Wagon " + add + " added to train " + to);
                logger.add("Wagon " + add + " is already attached to " + to);
            } 
            else {
                logger.add("Can't find wagon " + add);
            }
        } 
        
        else {
            logger.add("Can't find train " + to);
        }
    }
}