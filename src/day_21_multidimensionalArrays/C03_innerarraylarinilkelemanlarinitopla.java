package day_21_multidimensionalArrays;

public class C03_innerarraylarinilkelemanlarinitopla {

    public static void main(String[] args) {
        //Soru 1- Verilen 2 katli bir array'de
//       her bir inner array'deki 0. index'de bulunan sayilari toplayip,
//       sonucu yazdiran bir method olusturun.

        int [][] arr = {{1,2,3}, {4,5,8}};

        ilkelemanlarintoplami(arr);

    }

    public static void ilkelemanlarintoplami(int [][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i][0];



        }
        System.out.println("ilk elemanların toplamı "+toplam);
    }
}
