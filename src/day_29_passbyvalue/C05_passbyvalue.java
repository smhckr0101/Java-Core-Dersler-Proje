package day_29_passbyvalue;

public class C05_passbyvalue {
    public static void main(String[] args) {
        int sayi = 20;
        System.out.println(method1(sayi));

        System.out.println(sayi);
    }

    public static int method1(int sayi){
        sayi = sayi * 2;
        return sayi;
    }
}
