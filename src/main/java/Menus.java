public class Menus {
    public static void printWelcomeMenu() {
        System.out.println("");
        System.out.println("*************************************************************");
        System.out.println("******* WELCOME TO THE SUBMARINE POSITION CALCULATOR! *******");
        System.out.println("*************************************************************");
        System.out.println("");
    }

    public static void printInputFileMenu() {
        System.out.println("Please choose a number from the following options:");
        System.out.println("(1) Analyze a submarine command file");
        System.out.println("(2) Exit");
    }

    public static void getFileNameMenu() {
        System.out.println("");
        System.out.println("Please enter the name of the submarine command file to be analyzed: ");
    }

    public static void printFinalPositionInfoMenu() {
        System.out.println("");
        System.out.println("Dive! Dive! Dive!");
        System.out.println("*************************************************************");
    }

    public static void printClosingMenu() {
        System.out.println("*************************************************************");
        System.out.println("Now returning to periscope depth.");
        System.out.println("");
    }
}
