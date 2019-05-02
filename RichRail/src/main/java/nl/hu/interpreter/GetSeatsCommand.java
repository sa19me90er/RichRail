package nl.hu.interpreter;

import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;


public class GetSeatsCommand extends VehicleFinder implements ICommand {
   private final String type, id;
   private Logger logger = RailCompany.getInstance().getLogger();
   
   private TrainService trainService = new TrainService();
   private WagonService wagonService = new WagonService();

   public GetSeatsCommand(String type, String id) {
       this.type = type;
       this.id = id;
   }

   @Override
   public void execute() {
       if (type.contains("train")) {
           Train train = trainService.getTrainById((id));
           if (train != null) {
               logger.add("Train " + id + " has " + trainService.getAllTrainSeats(id) + " seats.");
           } else {
               logger.add("Can't find train " + id);
           }
       } else if (type.contains("wagon")) {
           Wagon wagon = wagonService.getWagonById(id);
           if (wagon != null) {
               logger.add("Wagon " + id + " has " + wagon.getSeats() + " seats.");
           } else {
               logger.add("Can't find wagon " + id);
           }
       }
       logger.add("No train or wagon found.");
   }
}