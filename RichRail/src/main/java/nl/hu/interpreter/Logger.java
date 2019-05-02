package nl.hu.interpreter;
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
}