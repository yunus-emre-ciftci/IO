package io2.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public void fileOutputStream() {
        //Yeni bir log dosyası oluşturuyoruz.
        File file = new File("./log");

        //FileOutputStream sınıfı dosyaya veri yazma veya var olan dosyaya yeni veri eklemek için kullanılır.
        //File'ın yanında append olarak true verilmesi eklenen verilerin aynı dosyaya eklenmesine neden olur.
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {

            //Veri yazma yolu aşağıdaki gibidir.
            String fullName = "Yunus Emre Çiftçi \n";
            byte[] bytes = fullName.getBytes();
            fileOutputStream.write(bytes); //Parametre olarak byte array'i istiyor.

            //FileInputStream'deki gibi .close a benzer şekilde dosya sonunda .flush yapılması gerekiyor.
            //Fakat autoCloseable ile FileOutputStream'i yazdığımız için buna gerek yoktur.
            //fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
