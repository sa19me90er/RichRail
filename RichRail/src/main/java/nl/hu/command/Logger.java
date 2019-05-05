package nl.hu.command;
import java.util.ArrayList;

/**
 * Created by Jason on 03/01/2017.
 */
public class Logger {


	private ArrayList<String> LOG = new ArrayList<>();

   public ArrayList<String> getLog() {
        return LOG;
    }

    public void add(String string) {
        LOG.add(string);
    }
    
    @Override
	public String toString() {
		return "- "+ LOG + " \n";
	}
}