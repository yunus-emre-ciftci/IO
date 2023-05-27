package charOriented.main;

import charOriented.io.FileReaderTest;
import charOriented.io.FileWriterTest;
import charOriented.io.SetOutInErr;

import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        FileReaderTest fileReaderTest = new FileReaderTest();
        //fileReaderTest.fileReader();
        FileWriterTest fileWriterTest = new FileWriterTest();
        //fileWriterTest.fileWriter();
        SetOutInErr setOutInErr = new SetOutInErr();
        setOutInErr.test();
    }
}
