package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOFile {
    public void fileIO() {
        //File sınıfından bir file objesi oluşturduk. Temel dosya işlemlerini File sınıfı ile yapacağız.
        //Obje oluştururken dosyanın yolunu parantez içerisine yazdık.

        //Linux tabanlı işletim sistemlerinde / ile dosyaları ulaşılır.
        File file = new File("C:/Users/YUNUS_EMRE/Desktop/file2.txt");

        //Microsoft'ta ise \ kullanılır. Fakat Java'da \\ kullanılır. Nedeni \ escape karakter olduğu için. \n gibi.
        File file1 = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file1");

        //File = dosya (.txt .pdf .png vs. (Klasör ile çok karıştırılır.))

    }

    public void exists() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file");

        //File'ın var olup olmadığını kontrol eder.
        boolean exists = file.exists();
        System.out.println(exists);
    }

    public void isFile() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file");

        //File'ın file olup olmadığını kontrol eder.
        boolean isFile = file.isFile();
        System.out.println(isFile);
    }

    public void getPath() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file");

        //File'ın yolunu gösterir.
        String path = file.getPath();
        System.out.println(path);
    }

    public void getAbsolutePath() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file");

        //File'ın tam yolunu verir.
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
    }

    public void fileInputStreamWithByte() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file");
        try {
            //FileInputStream veriyi byte byte okumamıza yardımcı olur.
            //FileInputStream kullanırken try-catch ya da throwable kullanılması şart.
            //new FileInputStream parantezleri içine bir dosya yolu ya da dosya yolu atanmış File değişkeni koymamız gerekiyor.
            FileInputStream fileInputStream = new FileInputStream(file);

            //.read metodu dosyayı okumamıza yardımcı olur. .read geriye int döndürür.
            //65. satırdaki kod bloku tek bir byte okur.
            int read = fileInputStream.read();

            //neden (read != -1) yaptık? Çünkü -1 demek dosyanın sonuna geldiğimize işarettir ve sonrasında okunacak bir şey yoktur. Yani dosyanın sonuna kadar dön mesajı veriyoruz.
            while (read != -1) {
                System.out.print(read + ", ");
                //71. satırda tek tek atama yapılır ve -1'e eşit olup olmadığını 68. saatırda kontrol eder.
                read = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileInputStreamWithChar() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file2.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int read = fileInputStream.read();
            while (read != -1) {
                //char'a cast ederek dosyanın çıktısını byte byte değil char char yani metinsel bir anlam içinde aldık.
                System.out.print((char) read);
                read = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileInputStreamCloseWithFinally() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file2.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int read = fileInputStream.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //Dosya okuma işlemlerinde dosyayı muhakkak kapamak gerekiyor. Bunu da finally blokları arasında yapmak mümkün.
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void fileInputStreamCloseWithTryCatchResource() {
        File file = new File("C:\\Users\\YUNUS_EMRE\\Desktop\\file2.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) { // try blokunun yanına parantez içine dosya okuma objesi koyulursa dosyayı otomatik olarak kapatır.
            int read = fileInputStream.read();
            while (read != -1) {
                //char'a cast ederek dosyanın çıktısını byte byte değil char char yani metinsel bir anlam içinde aldık.
                System.out.print((char) read);
                read = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
