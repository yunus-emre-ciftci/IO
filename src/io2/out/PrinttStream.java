package io2.out;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrinttStream {
    public void printStream() {
        try (PrintStream printStream = new PrintStream("./print")) {
            printStream.println("Hi JAVA!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
