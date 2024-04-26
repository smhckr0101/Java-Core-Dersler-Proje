package day_22_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_listedekielemanlaritopla {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,7,5,4,3));

        int toplam = 0;

        for (int i = 0; i <list.size() ; i++) {
            toplam += list.get(i);

        }
        System.out.println(toplam);

    }
}
