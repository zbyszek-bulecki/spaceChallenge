import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    public static void main(String [] args) throws FileNotFoundException {

        System.out.println("Loading the simulation: ");

        Simulation simulation = new Simulation();
        ArrayList<Item> tools = simulation.loadItems("/Users/zbyszekbulecki/IdeaProjects/ud282/SpaceChallenge/src/tools.txt");
        System.out.println("\tTools list ready");

        ArrayList<Item> supplies = simulation.loadItems("/Users/zbyszekbulecki/IdeaProjects/ud282/SpaceChallenge/src/supplies.txt");
        System.out.println("\tSupplies list ready \n");

        // U1 Rockets
       System.out.println("Running simulation for U1 rockets:");

        ArrayList<U1> toolsU1RocketList = simulation.loadU1(tools);
        System.out.println("\tU1 rockets with tools ready");

        int u1Cost = simulation.runSimulation(toolsU1RocketList);
        System.out.println("\tU1 Phase 1 cost: " + u1Cost);


        ArrayList<U1> suppliesU1RocketList = simulation.loadU1(tools);
        System.out.println("\tU1 rockets with supplies ready");

        u1Cost += simulation.runSimulation(suppliesU1RocketList);
        System.out.println("\tU1 Total cost: " + u1Cost + "\n");
        
        // U2 Rockets

        System.out.println("Running simulation for U2 rockets:");

        ArrayList<U2> toolsU2RocketList = simulation.loadU2(tools);
        System.out.println("\tU2 rockets with tools ready");

        int u2Cost = simulation.runSimulation(toolsU2RocketList);
        System.out.println("\tU2 Phase 1 cost: " + u2Cost);


        ArrayList<U2> suppliesU2RocketList = simulation.loadU2(tools);
        System.out.println("\tU2 rockets with supplies ready");

        u2Cost += simulation.runSimulation(suppliesU2RocketList);
        System.out.println("\tU2 Total cost: " + u2Cost);
    }

}
