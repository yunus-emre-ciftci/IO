package io.filterInputStream;

public class FilterInputStream {
    public void filterInputStream() {
        //FilterInputStream'den doğrudan obje oluşturamayız.
        FilterInputStream filterInputStream = new FilterInputStream();
        //Yukarıdaki kod hatalıdır.
        //FilterInputStream'in alt sınıflarından obje oluşturabiliriz ve onları kullanabiliriz.
    }
}
