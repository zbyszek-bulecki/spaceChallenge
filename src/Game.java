import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Game {
    public static void main(String [] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();
        ArrayList<Item> tools = simulation.loadItems("/Users/zbyszekbulecki/IdeaProjects/ud282/SpaceChallenge/src/tools.txt");
        System.out.println("Ready");
    }

}
