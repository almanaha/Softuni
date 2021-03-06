package avatar;

import avatar.engines.Engine;
import avatar.core.CarManager;
import avatar.io.ConsoleInputReader;
import avatar.io.ConsoleOutputWriter;
import avatar.utilities.InputParser;

public class Main {
    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter();
        InputParser inputParser = new InputParser();
        CarManager carManager = new CarManager();
        Engine engine = new Engine(inputReader, outputWriter, inputParser, carManager);

        engine.run();
    }
}
