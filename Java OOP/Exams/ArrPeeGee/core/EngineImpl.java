package app.core;

import app.contracts.Battlefield;
import app.contracts.Engine;
import app.contracts.Reader;
import app.contracts.Writer;

import java.io.IOException;
import java.util.Arrays;

public class EngineImpl implements Engine {
    private Reader reader;
    private Writer writer;
    private Battlefield battleField;

    public EngineImpl(Reader reader, Writer writer, Battlefield battlefield) {
        this.reader = reader;
        this.writer = writer;
        this.battleField = battlefield;
    }

    @Override
    public void run() throws IOException {

        String line = reader.readLine();
        while (!line.equals("Peace")) {
            String[] lineTokens = line.split("\\s+");

            switch (lineTokens[0].toLowerCase()) {
                case "createparticipant":
                    this.battleField.createParticipant(lineTokens[1], lineTokens[2]);
                    break;
                case "createaction":
                    this.battleField.createAction(lineTokens[1],
                            Arrays.copyOf(Arrays.stream(lineTokens).skip(2).toArray(),
                                    Arrays.stream(lineTokens).skip(2).toArray().length,
                                    String[].class));
                    break;
                case "statparticipants":
                    this.battleField.reportParticipants();
                    break;
                case "statactions":
                    this.battleField.reportActions();
                    break;
                case "createspecial":
                    this.battleField.createSpecial(lineTokens[1],lineTokens[2]);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

            line = reader.readLine();
        }
    }
}
