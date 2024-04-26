package day_32_datetime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_localDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);  // 2024-04-06T09:29:30.531178700

        /*
        Eğer tarih ve saati istediğin formatta olmasını istersen önce o formatı oluşturmalısın.
        oluşturduktan sonra LDT'yi istenen formatta yazrdırabilirsiniz.

          d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini
             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h
                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati
                 a yazarsak AM veya PM degerini yazar
         */

        // Tarihi 03 Apr 24 şeklinde yazalım
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMM yy");
        System.out.println(ldt.format(dtf1));

        // 3 Aor 2024

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d MMM YYYY");
        System.out.println(ldt.format(dtf2));

        // 03 Apr Wednesday

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd MMM EEEE");
        System.out.println(ldt.format(dtf3));

        // 3/4/ 2024 20:33

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d/M/yyy HH:mm");
        System.out.println(ldt.format(dtf4));

        // 8:33 pm
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(ldt.format(dtf5));

    }
}
