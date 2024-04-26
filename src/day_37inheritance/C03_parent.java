package day_37inheritance;

public class C03_parent extends C02_Grandparent{
    C03_parent(){
        System.out.println("parent parametresiz cons");
    }
    C03_parent(int b){
        System.out.println("parent int parametreli cons");
    }
    C03_parent(String k){
        this(3);
        System.out.println("parent string parametreli Cons");
    }
    C03_parent(double c){
        super(7.2);
        c=7;
        System.out.println(c);
    }
}
