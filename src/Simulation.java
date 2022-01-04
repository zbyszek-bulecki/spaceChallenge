import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    File toolsList = new File("tools.txt");

    Scanner fileScanner = new Scanner(toolsList);

    ArrayList phase1Tools = new ArrayList(); // Array containing the tools file.

    while (fileScanner.hasNextLine()) { // Loop for reading the tools file.
        phase1Tools.add(fileScanner.nextLine());
    }


    public Simulation() throws FileNotFoundException {
    }
}
