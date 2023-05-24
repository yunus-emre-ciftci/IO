package io;

import java.io.File;

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

    public void isExists() {
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
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
    }
}
