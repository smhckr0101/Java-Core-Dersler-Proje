package day_41_abstract_and_interfaces;

public abstract class C03_abstractgandparent {
    // abstract methodlar sadece abbstract yapılar içinde bulunabilir.
    // conscrete yapılar içinde abstract method bulunmaz

    public abstract void methodd1();

    public abstract int method2();

    public void method3(){
        System.out.println("GP method3");
    }

    public int method4(){

        return 2;
    }
}
