package day_19;

import java.util.Arrays;

public class C04_binarysearch {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,5,4,3,4};

        // binary search aranan elementin array da ilk kullanıldığı index i verir.
        // ama sort yani düzenlenmiş sıralanmış olursa sağlıklı çalışır

        // ayrıca arrayda olanın endexini
        // olmayanın eğer olsaydı sırasını bize döndürür.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 5));

        System.out.println(Arrays.binarySearch(arr, 4));

        System.out.println(Arrays.binarySearch(arr, 10));


    }
}
