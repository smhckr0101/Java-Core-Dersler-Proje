package Day_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_if {
    public static void main(String[] args) {
        // Kullanicidan bir harf alin
        // girilen harf kucuk harf ise "Kucuk"
        // buyuk harf ise "buyuk" yazdirin
        // Bunların dışında bir ifade girilirse "Giriş geçersizdir" yazdırslım

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz : ");
        char harf = scanner.nextLine().charAt(0);

        if(harf >= 'a' && harf <= 'z' )
        {
            System.out.println("Kucuk");
        }
        else if (harf >= 'A' && harf <= 'Z' ) {

            System.out.println("Buyuk");

        }
        else {
            System.out.println("Giriş geçersizdir");
        }

    }
}
