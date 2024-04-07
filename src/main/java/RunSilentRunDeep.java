import java.util.Scanner;

public class RunSilentRunDeep {
    public static void main(String[] args) {
        CommandParser parser = new CommandParser();
        Calculator subCalculator = new Calculator();
        final Scanner keyboardScanner = new Scanner(System.in);
        MyFrame graph = new MyFrame(subCalculator);
        graph.setVisible(false);

        Menus.printWelcomeMenu();

        boolean exitCondition = false;
        while (!exitCondition) {
            Menus.printInputFileMenu();
            String selection = keyboardScanner.nextLine();

            switch (selection) {
                case "1"://Take in a file
                    Menus.getFileNameMenu();
                    String inputFileName = keyboardScanner.nextLine().trim();

                    subCalculator.calculateFinalPosition(parser.parseCommandFile(inputFileName));

                    graph.setVisible(true);
                    Menus.printFinalPositionInfoMenu();
                    subCalculator.printFinalCalculatedPositions();
                    Menus.printClosingMenu();

                    break;
                case "2"://Exit
                    System.out.println("Bye.");
                    exitCondition = true;
                    break;
                default:
                    System.out.println("Invalid selection.  Please choose the number of a valid menu option.");
                    break;
            }
        }
    }
}
