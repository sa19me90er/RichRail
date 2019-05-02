package nl.hu.interpreter;

import nl.hu.domain.Wagon;
import nl.hu.logic.WagonService;

public class NewWagonCommand extends VehicleFinder implements ICommand {
    private final String id, number;
    private Logger logger = RailCompany.getInstance().getLogger();

    public NewWagonCommand(String id, String number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public void execute() {
    	WagonService wagonService = new WagonService();
        if (number != null) {        	
        	wagonService.makeWagon(id);
            logger.add("new wagon created: " + id);
        } else {
        	wagonService.makeWagon(id);
            logger.add("new wagon created: " + id);
        }
    }
}