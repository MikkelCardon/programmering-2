package opgave03.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ToFile implements RequestType{
    @Override
    public void logInfo(String message) {
        try {
            PrintWriter writer = new PrintWriter(new File("log.txt"));
            writer.print(RequestType.INFO + message);
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void logError(String message) {
        try {
            PrintWriter writer = new PrintWriter(new File("log.txt"));
            writer.print(RequestType.ERROR + message);
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
