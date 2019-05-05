package nl.hu.command;

/**
 * Created by Jason on 08/01/2017.
 */
public class HelpCommand implements ICommand {
    private Logger logger = RailCompany.getInstance().getLogger();


    @Override
    public void execute() {
        logger.add("The following commands can be used:");
        logger.add("    new train [name]");
        logger.add("    new wagon [name]");
        logger.add("    new wagon [name] numseats [number]");
        logger.add("    add [wagonName] to [trainName]");
        logger.add("    getnumseats train [name]");
        logger.add("    getnumseats wagon [name]");
        logger.add("    delete train [name]");
        logger.add("    delete wagon [name]");
        logger.add("    remove [wagonName] from [trainName]");
    }
}