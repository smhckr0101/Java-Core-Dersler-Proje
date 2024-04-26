package day_23_arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class C02_fibonacciserisi {
    public static void main(String[] args) {
        // verilen pozitif bir n tamsayısını alarak bize
        // n tane fibonacci yi bir list olarak döndüren metod oluşturun.
        // fibonacci : 0,1 1 2 3 5 8 13
        System.out.println(fibonacciserisiolustur(5));
    }

    public static List<Integer> fibonacciserisiolustur (int sayiadedi)
    {
        List<Integer> fibonacciserisi = new ArrayList<>();
        if (sayiadedi <= 0)
        {
            System.out.println("sayı adedi 0 dan büyük olmalıdır.");
        } else if (sayiadedi==1) {
            fibonacciserisi.add(0);
        } else if (sayiadedi==2) {
            fibonacciserisi.add(0);
            fibonacciserisi.add(1);

        } else {
            fibonacciserisi.add(0);
            fibonacciserisi.add(1);
        }

        for (int i = 2; i < sayiadedi; i++) {
            fibonacciserisi.add (fibonacciserisi.get(i-2) + fibonacciserisi.get(i-1));

        }


        return fibonacciserisi;
        
    }
}
