package day_37inheritance;

public class C02_Grandparent {
    C02_Grandparent(){
        System.out.println("Gparent parametresiz cons");
    }
    C02_Grandparent(double c) {
        this () ;
        c=5;
        System.out.println(c);
    }
}
