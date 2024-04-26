package day_30_passbyvallue;

import java.util.Scanner;

public class C01_passbyvalue {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfrn indirimsiz fiyatı giriniz");
        double fiyat = scanner.nextDouble();


        System.out.println("%10 indirimli fiyat " + yuzde10indirim(fiyat));

        System.out.println("%10 indirimli fiyat UYGULANDIKTAN SONRA FİYAT" + fiyat);

        // fiyatta kalıcı %30 indirim yapalım

        fiyat = yuzde30indirim(fiyat);
        System.out.println("%30 indirimli fiyat methodu çağrıldıktan sonra fiyat" + fiyat);


    }
    public static double yuzde10indirim (double fiyat) {
        fiyat = fiyat * 90/100;

        return fiyat;
    }

    public static double yuzde20indirim (double fiyat) {
        fiyat = fiyat * 80/100;

        return fiyat;
    }

    public static double yuzde30indirim (double fiyat) {
        fiyat = fiyat * 70/100;

        return fiyat;
    }
}
