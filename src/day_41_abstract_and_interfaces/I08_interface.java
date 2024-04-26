package day_41_abstract_and_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I08_interface {
    public static final int sayi = 10;
    public int a = 5; // public gereksiz
    static int b = 20; // static gereksiz

    // bir interface içinde olan tüm variable lar
    // public,static ve finaldirler
    // bu keywordlar yazılamsa da farketmez

    int d = 23;

    //  private int e = 23;

    // interface içindeki tüm variable lar final olduğundan
    // sonradan değerleri değiştirilemiyor.
    // bundan dolayı değer atanmadan variable oluşturulmasına izin verilmez

    //int e;

    // statik final variable lar için büyük harf ile isim verilir.<

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
    public abstract void method1();
    public void method2();
    abstract void method3();

    // ınterface de oluşturulan methodlar public ve abst. dır. ya
    // yazsak da yazmasak da farketmez.

    List<Integer> sayilar = new ArrayList<>();

}
