import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(String pathname) throws FileNotFoundException {

        final File itemsListFile = new File(pathname);
        final Scanner fileScanner = new Scanner(itemsListFile);

        final ArrayList<Item> items = new ArrayList<>();

        while (fileScanner.hasNextLine()) { // Loop for reading the tools file.
            final String line = fileScanner.nextLine();

            final String[] splitLine = line.split("=");
            final String itemName = splitLine[0];
            final int itemWeight = Integer.parseInt(splitLine[1]);

            final Item item = new Item(itemName, itemWeight);
            items.add(item);
        }
        return items;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> itemsToLoad){         // This method loads all the U1 rockets.
        final ArrayList<U1> u1Rockets= new ArrayList<>();             // Creates an ArrayList of U1 rockets.
        U1 rocket = new U1();                                         // Creates a new U1 rocket.
        u1Rockets.add(rocket);                                        // Adds the fist rocket to the list.

        for (Item item : itemsToLoad) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rocket = new U1();                               // Creates a new rocket.
                u1Rockets.add(rocket);                           // Adds the new rocket object.
            }
        }
        return u1Rockets;                                                 // Returns the list of U1 rockets.
    }

    public ArrayList<U2> loadU2(ArrayList<Item> itemsToLoad){         // This method loads all the U2 rockets.
        final ArrayList<U2> u2Rockets= new ArrayList<>();             // Creates an ArrayList of U2 rockets.
        U2 rocket = new U2();                                         // Creates a new U2 rocket.
        u2Rockets.add(rocket);                                        // Adds the fist rocket to the list.

        for (Item item : itemsToLoad) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rocket = new U2();                               // Creates a new rocket.
                u2Rockets.add(rocket);                           // Adds the new rocket object.
            }
        }
        return u2Rockets;                                                 // Returns the list of U2 rockets.
    }


    public int runSimulation(ArrayList<Rocket> rocketList) {                    // This method launches the rockets and tracks cost of the programme for each rocket type.

      


            }




}
