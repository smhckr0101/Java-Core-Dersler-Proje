package day_41_abstract_and_interfaces;

public abstract class C04_abstractparent extends C03_abstractgandparent {

    // bir class abstract yapıldığında child class ları bazı methodlara uyarlamaya
    //zorunlu kılmak için oluşturulur.

    //bir abstract class parent ı olan abstract class lardaki
    // abstract methodları kendine uyarlamak zorunda değildir.
    // isterse kendisine uyarlayabilir.isterse uyarlamadan yeni metodlar ekleyebilir.

    public void method1(){
        System.out.println("parent method1");

    }

    public abstract void method5();

    public int mathod6(){
        return 0;
    }
}
