package day_30_passbyvallue;

import java.util.ArrayList;
import java.util.List;

public class C04_mutable_immutableClasses {
    public static void main(String[] args) {
        String str = "java candır";
        str.toUpperCase();

        System.out.println(str); // java candır
        // yazdırır çünkü atama burda yapılmadı yukarıda yapıldı

        System.out.println(str.substring(5)); // candir

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(4);
        sayilar.add(7);
        System.out.println(sayilar);  // [4, 7]

    }
}
