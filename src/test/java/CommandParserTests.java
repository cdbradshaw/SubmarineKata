import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CommandParserTests {
    @Test
    public void parseCommandFile_givenCommandFile_correctArrayListGenerated() {
        //Arrange
        CommandParser parser = new CommandParser();
        String commandFileLocation = "src/main/resources/test.txt";

        ArrayList<Command> expectedCommands = new ArrayList<>();
        expectedCommands.add(new Command("forward", 5));
        expectedCommands.add(new Command("down", 5));
        expectedCommands.add(new Command("forward", 8));
        expectedCommands.add(new Command("up", 3));
        expectedCommands.add(new Command("down", 8));
        expectedCommands.add(new Command("forward", 2));
        //Act
        ArrayList<Command> parsedCommands = parser.parseCommandFile(commandFileLocation);
        //Assert
        assertEquals(expectedCommands.get(0).getDirection(), parsedCommands.get(0).getDirection());
        assertEquals(expectedCommands.get(1).getDirection(), parsedCommands.get(1).getDirection());
        assertEquals(expectedCommands.get(2).getDirection(), parsedCommands.get(2).getDirection());
        assertEquals(expectedCommands.get(3).getDirection(), parsedCommands.get(3).getDirection());
        assertEquals(expectedCommands.get(4).getDirection(), parsedCommands.get(4).getDirection());
        assertEquals(expectedCommands.get(5).getDirection(), parsedCommands.get(5).getDirection());

        assertEquals(expectedCommands.get(0).getMagnitude(), parsedCommands.get(0).getMagnitude());
        assertEquals(expectedCommands.get(1).getMagnitude(), parsedCommands.get(1).getMagnitude());
        assertEquals(expectedCommands.get(2).getMagnitude(), parsedCommands.get(2).getMagnitude());
        assertEquals(expectedCommands.get(3).getMagnitude(), parsedCommands.get(3).getMagnitude());
        assertEquals(expectedCommands.get(4).getMagnitude(), parsedCommands.get(4).getMagnitude());
        assertEquals(expectedCommands.get(5).getMagnitude(), parsedCommands.get(5).getMagnitude());
    }

    @Test
    public void parseCommandFile_givenCommandFile_arrayListGeneratedIsProperLength() {
        //Arrange
        CommandParser parser = new CommandParser();
        String commandFileLocation = "src/main/resources/test.txt";
        //Act
        ArrayList<Command> parsedCommands = parser.parseCommandFile(commandFileLocation);
        //Assert
        assertEquals(6, parsedCommands.size());
    }
}
