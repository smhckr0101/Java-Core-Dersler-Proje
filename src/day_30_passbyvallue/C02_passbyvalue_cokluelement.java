package day_30_passbyvallue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_passbyvalue_cokluelement {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,5,7,9,10));

        // Listedeki elementler 3er artırıp listenin yeni halini yazdıralım
        // bir method oluşturun

        elementartir(sayilar);

        System.out.println(sayilar);

        // 5 elemanlı yeni bir liste oluşturup
        // sayılar list ine atayıni
        // sayılar listiniin son halini yazdıran bir method oluşturun
    }

    public static void elementartir(List<Integer> sayilar){

        for (int i = 0; i <sayilar.size() ; i++) {

            sayilar.set(i, sayilar.get(i)+3);

        }
        System.out.println(sayilar);
    }

    public static void yenilisteoluştur (List<Integer>sayilar){
        List<Integer> yenilist = new ArrayList<>(Arrays.asList(0,0,0,0,0));

        sayilar = yenilist;

        System.out.println("sayılar listesinin son hali" + sayilar);

    }
}
