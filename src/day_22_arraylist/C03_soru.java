package day_22_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_soru
{
    public static void main(String[] args) {
        // Verilen bir String List'deki
// en uzun kelimeyi yazdirin
// en uzun kelimenin harf sayisina esit,
// birden fazla kelime varsa en sonuncuyu yazdirin

        List<String> isimler = new ArrayList<>(Arrays.asList("seher", "sumeyra", "ali", "veli"));

        String enuzunkelime =isimler.get(0);
        for (int i = 0; i < isimler.size() ; i++) {

            if (isimler.get(i).length() >= enuzunkelime.length()){

                enuzunkelime = isimler.get(i);
            }

        }
        System.out.println("enuzunkelime" + enuzunkelime);
    }
}
