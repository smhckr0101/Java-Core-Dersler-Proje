package day_41_abstract_and_interfaces;

public class C06_concretechild extends C05_concreteChildClass{

    // parert class olan c05 te
    // bütün abstract lar concrete leştirildiği için
    //C06 nın hiçbir mecburiyeti kalmaz.
    // normal ınheritanc e kuralları çerçevesinde hareket ederler.

    public void method3(){
        System.out.println("GC method3");
    }
    public int method6(){
        return 20;
    }

    public static void main(String[] args) {

        C06_concretechild gc1 = new C06_concretechild();
        // dataa türü ve const. aynı, C06 ya git ilk bulduğunu kullan

        gc1.method1(); // parent method1
        System.out.println(gc1.method2()); // 10
        gc1.method3(); // GC method3
        System.out.println(gc1.method4()); // 2
        gc1.method5(); // C method 5
        System.out.println(gc1.method6()); // 20


        C04_abstractparent gc2 = new C06_concretechild();
        // data türü ve cons farklı
        // c04 e gitbulursan C06 ya kadar güncel ara
        gc2.method1(); // parent method1
        System.out.println(gc2.method2()); // 10
        gc2.method3(); // GC method3
        System.out.println(gc2.method4()); // 2
        gc2.method5(); // C method 5
        System.out.println(gc2.mathod6()); // 20


        C05_concreteChildClass cc1 = new C05_concreteChildClass();
        // data türü ve cons aynı
        // C05 e git ilk bulduğunu yazdır.

        cc1.method1(); // parent method1
        System.out.println(cc1.method2()); // 10
        cc1.method3(); // GC method3
        System.out.println(cc1.method4()); // 2
        cc1.method5(); // C method 5
        System.out.println(cc1.mathod6()); // 0

        C03_abstractgandparent cc2 = new C05_concreteChildClass();
        // data türü ve cons farklı

        // C03 tten aramaya başla bulursan c05 e kadar en günceli var mı bak

        cc2.method2(); // parent method1
        System.out.println(cc2.method2()); // 10
        cc2.method3(); // GC method3
        System.out.println(cc2.method4()); // 2
        // cc2.method5(); // CTE C03 te yok
        // System.out.println(cc2.mathod6()); //  CTE C03 te yok




    }
}
