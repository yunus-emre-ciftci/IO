package charOriented.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SetOutInErr {
    public void test() throws FileNotFoundException {
        //setOut ile System.out.println() ile yazılan tüm veriler console dosyasına yazılır.
        System.setOut(new PrintStream("console"));


        System.setIn(new FileInputStream("print"));

        //setErr ile alınan tüm hatalar err dosyasına yazdırılır.
        System.setErr(new PrintStream("err"));

        System.out.println("Hello World");
        System.out.println(3/0);
    }
}
