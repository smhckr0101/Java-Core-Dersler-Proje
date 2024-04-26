package day_29_passbyvalue;

public class C04_passbyvalue {
    public static void main(String[] args) {
        int sayi =30;

        method1(sayi);
        System.out.println("Method call'dan sonra main method'da sayı :" + sayi);
    }

    public static void method1 (int sayi)
    {
        sayi = 3* sayi ;

        System.out.println("method daki sayıımım değeri "+ sayi);
    }



    }
    
