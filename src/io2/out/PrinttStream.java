package io2.out;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrinttStream {
    public void printStream() {
        //InputOutput projesinde print file'ı açtık.
        //PrintStream sınıfı metin tabanlı verileri dosyaya yazdırmak için kullanılır. Konsola da yazdırılır.

        try (PrintStream printStream = new PrintStream("./print")) {
            printStream.println("Hi JAVA!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printConsole() {
        //PrintStream'e System.out yazarsak konsola yazılır.
        //Not: Burada catch yoktur. try-finally birlikte de çalışabilir.
        try (PrintStream printStream = new PrintStream(System.out)) {
            printStream.println("Konsola yazdır.");
        }
    }
}
