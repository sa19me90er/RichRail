package nl.hu.interpreter;

import nl.hu.interpreter.antlr4.*;
import nl.hu.domain.Train;
import nl.hu.domain.Wagon;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.Observable;


public class RailCompany {
    private static RailCompany railCompany;
    private Logger logger = new Logger();
    private ArrayList<Train> trains;
    private ArrayList<Wagon> wagons;

    public RailCompany() {
        trains = new ArrayList<>();
        wagons = new ArrayList<>();
//        setTestData();
    }

    static void setNewInstance() {
        railCompany = null;
    }

    public static RailCompany getInstance() {
        if (railCompany == null) {
            railCompany = new RailCompany();
        }
        return railCompany;
    }

    private void setTestData() {
        new NewTrainCommand("tr1").execute();
        new NewWagonCommand("wg1", "20").execute();
        new AddCommand("wg1", "tr1").execute();
        new GetSeatsCommand("wagon", "wg1").execute();
        new RemoveCommand("wg1", "tr1").execute();
        new DeleteTrainCommand("tr1").execute();
        new DeleteWagonCommand("wg1").execute();
    }


    public ArrayList<String> getLog() {
        return logger.getLog();
    }



    public Train getTrain(String trainID) {
        for (Train t : trains) {
            if (t.getTrainID().equalsIgnoreCase(trainID)) {
                return t;
            }
        }
        return null;
    }

    public Logger getLogger() {
        return logger;
    }

    public void parse(String text) {
        if (!text.contains("help")) {
            ANTLRInputStream input = new ANTLRInputStream(text); // a character stream
            RichRailLexer lex = new RichRailLexer(input); // transforms characters into tokens
            CommonTokenStream tokens = new CommonTokenStream(lex); // a token stream
            RichRailParser parser = new RichRailParser(tokens); // transforms tokens into parse trees
            parser.command();
        } else {
            new HelpCommand().execute();
        }
    }
}