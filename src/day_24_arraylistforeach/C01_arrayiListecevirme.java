package day_24_arraylistforeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arrayiListecevirme {
    public static void main(String[] args) {
        Integer[] sayilar = {3,5,6,4,7,8,9,0};

        // bu arrayi liste çevirim
        // 1- bir loop ile arrayfaki tüm elementleri list e ekleyebiliriz

        // bir arrayi list e çevirmek için nu yöntem daha sağlıklıdir.

        List<Integer> sayilist1 = new ArrayList<>();

        for (int i = 0; i <sayilar.length ; i++) {
            sayilist1.add(sayilar[i]);

            sayilist1.add(9);
            sayilist1.remove(0);
        }

        System.out.println(sayilist1);

        // 2-aslist

        /*  varolan bir arrayi tek satırla list e çevirebiliriz
        1--->Ancak buna arrayda olduğu gibi ekleme kaldırma yapamayız
        2----> aslist ile dönüştürülen liste
         ve kaynak olarak kullanılan array etkileşime devam eder.

         */

        List<Integer> sayilist2 = Arrays.asList(sayilar);

        System.out.println("aslist ile dondütülen liste : " + sayilist2);
        sayilist2.add(9);

    }
}
