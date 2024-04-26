package day_34_stringbuilder;

public class C04_karsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("ulvi");

        StringBuilder sb2 = new StringBuilder("ulvi");

        String str = "ulvi";

        System.out.println((sb1 == sb2)); // false

        // farklı data türündeki non primitive lar için == KULLANILAMAZ


        // equals

        System.out.println(sb1.equals(sb2)); // false -- CTE vermez metin aynı da olsa False verir.

        System.out.println(str.equals(sb1)); // false -- java cte vermez ama sonuç false olur.


        System.out.println(sb1.equals(sb1)); // true

        // Stringbuilder da metinleri karşılaştırmak için compare metodu kullanılmalıdır.
        // compareTo metodu 0 döndürürse metinler aynı değilse farklıdır.

        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("Tava");
        StringBuilder s3 = new StringBuilder("Javaa");
        StringBuilder s4 = new StringBuilder("Java");
        StringBuilder s5 = new StringBuilder("Jaka");

        System.out.println(s1.compareTo(s2)); // -10
        System.out.println(s1.compareTo(s3)); // -1
        System.out.println(s1.compareTo(s4)); // 0

        // CompareTo () iki string builder ı harf harf karşılaştırır.
        // Eğer tüm indexlerdeki karakterler aynı ise sonuç olarak 0 döner.
        // Eğer herahngi bir indexte farklı karakter bulursa bu karakterlerin
        // ascıı kodları arasındaki farkı döndürür ve işlemi bitirir.

        StringBuilder sb10 = new StringBuilder("OCAJP8");

        sb10.subSequence(2, 4);

        sb10.deleteCharAt(3);

       sb10.reverse( );

        System.out.println(sb10);


    }
}
