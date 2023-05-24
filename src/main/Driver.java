package main;

import IO.IOFile;

public class Driver {
    public static void main(String[] args) {
        IOFile ioFile = new IOFile();
        //ioFile.isExists();
        //ioFile.isFile();
        //ioFile.getPath();
        ioFile.getAbsolutePath();
    }
}
