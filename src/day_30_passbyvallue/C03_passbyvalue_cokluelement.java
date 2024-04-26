package day_30_passbyvallue;

import java.util.Arrays;
import java.util.List;

public class C03_passbyvalue_cokluelement {
    public static void main(String[] args) {
        int[] arr = {6,9,2};

        // array in  tüm elementlerini bir azaltıp yazdıran bir method oluşturun

        eksiltyazdir(arr); // [5, 8, 1]


        // METHOD CALL DAN SONRA ARRAY İ YAZDIRALIM

        System.out.println(Arrays.toString(arr));

        // yeni bir method oluşturun. method da uzunluğu 4 olan yeni bir array oluşturup
        // arr deki elamnları yeni array e taşıyın
        // 4.eleman olarak 3 atayın
        // işlem bittikten sonra yeni array i arr ye atayıp yazdırın

        elemanekle(arr);

        System.out.println("eleman ekle methodundan sonraa arr : " + Arrays.toString(arr));
        // method da yapılan yeni atama method da kalır burada eski listeyi yazdırır.
    }
    public static void elemanekle(int[] arr){ // {5,8,1}

        int[] yeniarr = new int[4]; // [0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {

            yeniarr[i] = arr[i];

        }
        yeniarr[3] = 3;

        arr = yeniarr;

        System.out.println(Arrays.toString(arr));

    }

    public static void eksiltyazdir(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            arr[i] -= 1;

        }
        System.out.println(Arrays.toString(arr));

    }
}
