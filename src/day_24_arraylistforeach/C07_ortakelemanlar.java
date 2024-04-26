package day_24_arraylistforeach;

import java.util.ArrayList;
import java.util.List;

public class C07_ortakelemanlar {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[] array1 = {3,6,8,1,0,3,8,1,1};
        int[] array2 = {3,6,7,5,6,5,6,5,1};

        List<Integer> ortakelemanlarlistesi = new ArrayList<>();

        // bir arraydeki tüm elemanları
        // diğer elemanlarla karşılaştırmak için nested loop kullanmak zorundayız

        for(int each1 : array1) {
            for(int each2 : array2){
                if (each1 == each2 && !ortakelemanlarlistesi.contains(each1)){
                    ortakelemanlarlistesi.add(each1);
                }
            }
        }
    }
}
