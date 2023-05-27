package byteOriented.io2.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrinttStream {
    public void printStream() {
        //InputOutput projesinde print file'ı açtık.
        //PrintStream sınıfı metin tabanlı verileri dosyaya yazdırmak için kullanılır. Konsola da yazdırılır.
        //
        try (PrintStream printStream = new PrintStream("./print")) {
            printStream.println("\n Benim adım Yunus Emre Çiftçi");
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

    public void scannerTest() {
        try (Scanner scanner = new Scanner(new File("./log"))) {
            String s = scanner.nextLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
