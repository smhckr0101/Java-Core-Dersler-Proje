package day_31_datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class C02_Localdate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);//2024-04-05

        // Japonya daki tarihi yazdıralım

        LocalDate japonyadatarih = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Japonya Tarihi : "+ japonyadatarih);

        // istenen tarihi oluşturma

        LocalDate dogumtarihi1 = LocalDate.of(1991,11,05);
        LocalDate dogumtarihi2 = LocalDate.of(1991, Month.NOVEMBER,05);

        System.out.println(tarih.plusDays(25));

        System.out.println(dogumtarihi1.isBefore(dogumtarihi2) ? dogumtarihi1 : dogumtarihi2);

        // verilen yılın artık yıl olup olmadığını yazdırın

        System.out.println(dogumtarihi1.isLeapYear());


    }
}
