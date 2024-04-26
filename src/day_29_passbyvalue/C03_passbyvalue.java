package day_29_passbyvalue;

public class C03_passbyvalue {

    static int sayi =50;

    public static void main(String[] args) {
        int sayi = 10;


    }

    public static void method1 (){
        int sayi = 40;
        System.out.println(sayi); // 40

    }

    public static void method2 (int sayi){

        System.out.println(sayi); // 50

    }

}
