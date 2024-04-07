import model.Command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CommandParser {
    private String direction;
    private int magnitude;
    private ArrayList<Command> commandsList;

    public ArrayList<Command> parseCommandFile(String inputFileName) {
        commandsList = new ArrayList<>();
        File inputFile = new File(inputFileName);

        try (Scanner fileScanner = new Scanner(inputFile.getAbsoluteFile())) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] splitLine = line.split(" ");

                direction = splitLine[0];
                magnitude = Integer.parseInt(splitLine[1]);

                Command command = new Command(direction, magnitude);
                commandsList.add(command);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.exit(1);
        }
        return commandsList;
    }
}
