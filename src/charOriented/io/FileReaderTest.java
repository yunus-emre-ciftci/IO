package charOriented.io;

import java.io.FileReader;

public class FileReaderTest {
    public void fileReader() {
        //FileReader sınıfı dosya okuma için kullanılır.
        try (FileReader fileReader = new FileReader("./print")) {
            int read;
            while ((read = fileReader.read()) != -1){
                System.out.print((char) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
