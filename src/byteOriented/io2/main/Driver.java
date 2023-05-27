package byteOriented.io2.main;

import byteOriented.io2.out.OutputStream;
import byteOriented.io2.out.PrinttStream;

public class Driver {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();
        //outputStream.fileOutputStream();
        PrinttStream printtStream = new PrinttStream();
        printtStream.printStream();
        //printtStream.printConsole();
       //inttStream.scannerTest();
    }
}
