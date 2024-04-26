package day_22_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_setmetodu {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,5,4,3,2,2));

        sayilar.set(9,5);
        System.out.println(sayilar);
    }
}
