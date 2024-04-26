package day_23_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C03_pozitiftambolenlerlistesi {
    public static void main(String[] args) {
        //veilen pozitif bir tam sayıyı tam bölebilen tüm pozitif tam sayıları
        // bir liste olarak bize döndüren bir metod oluşturun

        System.out.println(pozitifbolenlistesi(20)); // [1, 2, 4, 5, 10, 20]

        System.out.println(pozitifbolenlistesi(120)); // [1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40, 60, 120]

    }

    public static List<Integer> pozitifbolenlistesi (int sayi)
    {
    List<Integer> pozitifbolenlerlistesi = new ArrayList<>();


        for (int i = 1; i <= sayi ; i++) {
            if (sayi%i == 0){
                pozitifbolenlerlistesi.add(i);
            }

        }

    return pozitifbolenlerlistesi;}
}
