import model.Command;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void calculateFinalPosition_givenForwardCommand_addHorizontalDistance() {
        //Arrange
        ArrayList<Command> commands = new ArrayList<>();
        Command forwardCommand = new Command("forward", 5);
        commands.add(forwardCommand);
        Calculator positionCalculator = new Calculator();
        //Act
        positionCalculator.calculateFinalPosition(commands);
        //Assert
        assertEquals(5, positionCalculator.getFinalHorizontalPosition());
    }

    @Test
    public void calculateFinalDepth_givenDownCommand_addDepth() {
        //Arrange
        ArrayList<Command> commands = new ArrayList<>();
        Command diveCommand = new Command("down", 7);
        commands.add(diveCommand);
        Calculator positionCalculator = new Calculator();
        //Act
        positionCalculator.calculateFinalPosition(commands);
        //Assert
        assertEquals(7, positionCalculator.getFinalDepth());
    }

    @Test
    public void calculateFinalDepth_givenUpCommand_subtractDepth() {
        //Arrange
        ArrayList<Command> commands = new ArrayList<>();
        Command surfaceCommand = new Command("up", 7);
        commands.add(surfaceCommand);
        Calculator positionCalculator = new Calculator();
        //Act
        positionCalculator.calculateFinalPosition(commands);
        //Assert
        assertEquals(-7, positionCalculator.getFinalDepth());
    }

    @Test
    public void calculateFinalPositionProduct_givenFinalPositionAndFinalDepth_multiplyPositions() {
        //Arrange
        Calculator positionCalculator = new Calculator();
        int finalHorizontalPosition = 10;
        int finalDepth = 15;
        //Act
        positionCalculator.calculateFinalPositionProduct(finalHorizontalPosition, finalDepth);
        //Assert
        assertEquals(150, positionCalculator.getFinalPositionProduct());
    }
}
