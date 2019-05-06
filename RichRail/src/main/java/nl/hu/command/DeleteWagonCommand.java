package nl.hu.command;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;

/**
 * Created by Jason on 08/01/2017.
 */
public class DeleteWagonCommand extends VehicleFinder implements ICommand {
    private final String id;
    private Logger logger = RailCompany.getInstance().getLogger();

    public DeleteWagonCommand(String id) {
        this.id = id;
    }

    @Override
    public void execute() {
    	WagonService wagonService = new WagonService();
    	TrainService trainService = new TrainService();
        Wagon wagon = wagonService.getWagonById(id);
        if (wagon != null) {
            wagonService.deleteWagon(id);
            logger.add("Wagon " + id + " removed.");
        } else {
            logger.add("No wagon found with id " + id);
        }
    }
}