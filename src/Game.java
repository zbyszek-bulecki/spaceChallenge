import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    public static void main(String [] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();
        ArrayList<Item> tools = simulation.loadItems("/Users/zbyszekbulecki/IdeaProjects/ud282/SpaceChallenge/src/tools.txt");
        System.out.println("List ready");

        simulation.loadU1(tools);
        System.out.println("U1 rockets ready");
    }

}
