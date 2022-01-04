import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    public ArrayList<U1> loadU1(ArrayList<Item> itemsToLoad){
        U1 rakieta = new U1();
        rakieta.canCarry()

    }

}
