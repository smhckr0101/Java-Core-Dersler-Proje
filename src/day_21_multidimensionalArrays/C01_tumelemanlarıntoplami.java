package day_21_multidimensionalArrays;

public class C01_tumelemanlarıntoplami {
    public static void main(String[] args) {
        // verilen iki katlı inteğger bir arraydaki tüm sayıların toplamını yazdıran bir metod oluştralım

        int [][] arr = {{1,2,3}, {4,5,8}};

        elemanlarintoplaminiyazdir(arr);

    }

    public static void elemanlarintoplaminiyazdir(int[][] arr)

    // 2 karlı arraylara ulaşmak için 2 katlı nested loop

    {

        int toplam =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];

            }

        }

        System.out.println("verilen elementteki değerlerin toplamı :" + toplam );
    }


}
