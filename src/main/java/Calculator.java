import java.util.ArrayList;

public class Calculator {
    private int startingHorizontalPosition = 0;
    private int startingDepth = 0;
    private int horizontalPosition;
    private int depth;
    private int finalHorizontalPosition;
    private int finalDepth;
    private int finalPositionProduct;

    public void calculateFinalPosition(ArrayList<Command> commands) {
        horizontalPosition = startingHorizontalPosition;
        depth = startingDepth;

        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward":
                    horizontalPosition += command.getMagnitude();
                    break;
                case "down":
                    depth += command.getMagnitude();
                    break;
                case "up":
                    depth -= command.getMagnitude();
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
            finalHorizontalPosition = horizontalPosition;
            finalDepth = depth;
            calculateFinalPositionProduct(finalHorizontalPosition, finalDepth);
        }
    }

    public void calculateFinalPositionProduct(int finalHorizontalPosition, int finalDepth) {
        finalPositionProduct = finalHorizontalPosition * finalDepth;
    }

    public void printFinalCalculatedPositions() {
        System.out.print("The submarine's final horizontal position is ");
        System.out.printf("%,d.%n", finalHorizontalPosition);
        System.out.print("The submarine's final depth is ");
        System.out.printf("%,d.%n", finalDepth);
        System.out.print("The product of the vessel's final coordinates is ");
        System.out.printf("%,d.%n", finalPositionProduct);
    }

    public int getFinalHorizontalPosition() {
        return finalHorizontalPosition;
    }

    public int getFinalDepth() {
        return finalDepth;
    }

    public int getFinalPositionProduct() {
        return finalPositionProduct;
    }
}
