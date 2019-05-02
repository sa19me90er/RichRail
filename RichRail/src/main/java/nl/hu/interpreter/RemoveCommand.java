package nl.hu.interpreter;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;


public class RemoveCommand extends VehicleFinder implements ICommand {
    private Logger logger = RailCompany.getInstance().getLogger();
    private String from;
    private String rem;
    private TrainService trainService;
    private WagonService wagonService;

    public RemoveCommand(String rem, String from) {
        this.from = from;
        this.rem = rem;
    }

    public void execute() {
        Train train = trainService.getTrainById(from);
        if (train != null) {
            Wagon wagon = wagonService.getWagonById(rem);
            if (wagon != null) {
                wagonService.OntkoppelWagon(wagon.getWagonID());
                logger.add("Wagon " + rem + " succesfully removed from " + from);
            } else {
                logger.add("Wagon " + rem + " not found.");
            }
        } else {
            logger.add("Train " + from + " not found.");
        }
    }
}