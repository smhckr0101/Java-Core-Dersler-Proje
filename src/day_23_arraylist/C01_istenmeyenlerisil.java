package day_23_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_istenmeyenlerisil {
    public static void main(String[] args) {
        //soru3 verilen string bir listede
        //istenmeyen harf içeren elemenleri silip
        //kalan kısmını bize list olarak döndüren bir metod oluşturun

        List<String> isimler = new ArrayList<>(Arrays.asList("semih", "murat", "ali", "kemal"));

        String istenmeyenharf = "e";

        System.out.println(istenmeyenharflersil(isimler, istenmeyenharf));

    }
    public static List<String> istenmeyenharflersil(List<String>isimler,String istenmeyenharf) {
        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenharf)) {
                isimler.remove(i);
                i--;
            }

        }
    return isimler;
    }

}
