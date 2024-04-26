package day_31_datetime;

import java.time.LocalTime;
import java.time.chrono.JapaneseDate;

public class C01localtime {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 09:47:17.619090900

        for (int i = 0; i < 1000000 ; i++) {
            String str = i + "";

        }
        System.out.println(saat); //09:49:12.664236700

        LocalTime istenensaat = LocalTime.of(23,56,56);
        System.out.println(istenensaat);

        LocalTime bitissaati = LocalTime.now();
        System.out.println(bitissaati);

        saat.plusMinutes(267);

        saat.minusMinutes(284);

        System.out.println(saat.withSecond(0).withNano(0));

        System.out.println(saat.isBefore(bitissaati)); // true
        System.out.println(saat.isAfter(bitissaati)); // false

        System.out.println(saat.getNano()); // get mothodları saatin istediğimiz bölümlerini gösterir

        // gece 00:00'dan sonra şuana kadar geçen saniye ve nanosaniyeyi gösterir.
        System.out.println(saat.toNanoOfDay()); // 36289808370400
        System.out.println(saat.toSecondOfDay()); // 36341

        LocalTime loopbaslangic = LocalTime.now();
        Long loopbaslangicnano = LocalTime.now().toNanoOfDay();


        for (int i = 0; i < 1000000 ; i++) {
            String str = i + "";

        }

        LocalTime loopbitissaati = LocalTime.now();
        Long loopbitissaatimiz = LocalTime.now().toNanoOfDay();


        System.out.println("Loop baslangic " + loopbaslangic);
        System.out.println("Loop bitiş " + loopbitissaati);

        System.out.println("Loop islem süresi nano saniye olarak :"+(loopbitissaatimiz-loopbaslangicnano));



    }
}
