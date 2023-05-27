package charOriented.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public void fileWriter() {
        try (FileWriter fileWriter = new FileWriter("./print", true)) {
            fileWriter.write("Yunus Emre Çiftçi \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
