package day_24_arraylistforeach;

import java.util.Arrays;
import java.util.Scanner;

public class C06_foreachloop {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle yazın");
        String cumle = scanner.nextLine();

        String harf = "";

        while (harf.length() != 1){
            harf = scanner.nextLine();

        }

        String[] harfarrayi = cumle.split("");
        System.out.println(Arrays.toString(harfarrayi));

        int sayac = 0;

        for (String each : harfarrayi) {
            if (each.equalsIgnoreCase(harf))
            {sayac ++;}
        }

        if (sayac == 0) {
            System.out.println("harf cümlede kullanılmamış");
        }
        else
        {
            System.out.println("verilen" +harf+"harfi cümlede "+ sayac +"defa kullanılmış");
        }


    }
}
