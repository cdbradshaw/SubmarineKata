import model.Command;
import model.Coordinate;

import java.util.ArrayList;

public class Calculator {
    private int startingHorizontalPosition = 0;
    private int startingDepth = 0;
    private int horizontalPosition;
    private int depth;
    private int finalHorizontalPosition;
    private int finalDepth;
    private int finalPositionProduct;
    Coordinate currentPosition = new Coordinate();
    private ArrayList<Coordinate> coordinatesList;

    public void calculateFinalPosition(ArrayList<Command> commands) {
        horizontalPosition = startingHorizontalPosition;
        depth = startingDepth;
        coordinatesList = new ArrayList<>();
        coordinatesList.add(new Coordinate(startingHorizontalPosition, startingDepth));


        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward":
                    horizontalPosition += command.getMagnitude();
                    currentPosition = new Coordinate(horizontalPosition, depth);
                    coordinatesList.add(currentPosition);
                    break;
                case "down":
                    depth += command.getMagnitude();
                    currentPosition = new Coordinate(horizontalPosition, depth);
                    coordinatesList.add(currentPosition);
                    break;
                case "up":
                    depth -= command.getMagnitude();
                    currentPosition = new Coordinate(horizontalPosition, depth);
                    coordinatesList.add(currentPosition);
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
        System.out.println("\"X\" marks the spot!");
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

    public ArrayList<Coordinate> getCoordinatesList() {
        return coordinatesList;
    }
}
