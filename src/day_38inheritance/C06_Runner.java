package day_38inheritance;

import java.sql.SQLOutput;

public class C06_Runner {
    public static void main(String[] args) {
        C05_avcikuslar kartalavcikus = new C05_avcikuslar();


        System.out.println(kartalavcikus.omur); // yaşarlar ve ölürler

        System.out.println(kartalavcikus.soluma); // Akciğerle
        System.out.println(kartalavcikus.cogalma); // yumurtayla
        System.out.println(kartalavcikus.kanat); // kanatlıdır
        System.out.println(kartalavcikus.hareket); // uçarlar

        System.out.println(kartalavcikus.gaga); // sivrigagalidir.
        System.out.println(kartalavcikus.beslenma); // etle beslenirer
        System.out.println(kartalavcikus.pence); // pancelidir

        System.out.println("====================");

        C04_kuslar kartalkus = new C05_avcikuslar();

        // Kuşlar class ındaki kartalın özellikleri
        // pençe yukarıda da olmadığı için CTE verir.

        System.out.println(kartalkus.omur); // yaşarlar ve ölürler

        System.out.println(kartalkus.soluma); // Akciğerle
        System.out.println(kartalkus.cogalma); // yumurtayla
        System.out.println(kartalkus.kanat); // kanatlıdır


        System.out.println(kartalkus.hareket); // uçarlar

        System.out.println(kartalkus.gaga); // sivrigagalidir.
        System.out.println(kartalkus.beslenme); // etle beslenirer
        // ********  System.out.println(kartalkus.pence); // pancelidir

        C03_hayvanlar kartalhayvan = new C03_hayvanlar();
        // hayvanlar class ındaki kartalın özellikleri

        System.out.println(kartalhayvan.omur); // yaşarlar ve ölürler

        System.out.println(kartalhayvan.solunum); // nefes alır
        System.out.println(kartalhayvan.cogalma); // cogalır
        // System.out.println(kartalhayvan.kanat); // CTE Hayvanlar class ında yok


        System.out.println(kartalhayvan.hareket); // hareket eder

        // System.out.println(kartalhayvan.gaga); // CTE Hayvanlar da yok
        System.out.println(kartalhayvan.beslenme); // beslenir
        // System.out.println(kartalhayvan.pence); // pancelidir

        C04_kuslar kus1 = new C04_kuslar();
        // Kuşlar class ındaki kus1 özellikleri
        // pençe yukarıda da olmadığı için CTE verir.

        System.out.println(kus1.omur); // yaşarlar ve ölürler

        System.out.println(kus1.soluma); // Akciğerle
        System.out.println(kus1.cogalma); // yumurtayla
        System.out.println(kus1.kanat); // kanatlıdır

        System.out.println(kus1.hareket); // hareker eder

        System.out.println(kus1.gaga); // gagalidir.
        System.out.println(kus1.beslenme); // beslenirer
        // ********  System.out.println(kus1.pence); // CTE

        System.out.println("============");




    }
}
