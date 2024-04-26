package day_24_arraylistforeach;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class C04_foreachloop {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int[] arr = {3,3,4,5,5,6,7,8,6,4,1};

        List<Integer> benzersizlist = new ArrayList<>();

        for (int each :arr){
            if (!benzersizlist.contains(each)){

                benzersizlist.add(each);
            }
        }

        System.out.println(benzersizlist);

        // array den eleman silemediğimiz için
        // istediğimiz elemanlara sahip yeni bir array oluşturalım

        arr = new int[benzersizlist.size()];

        // array e index olmadan atama yapamayacağımız için for loop kullanalım.
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = benzersizlist.get(i);


        }



    }
}
