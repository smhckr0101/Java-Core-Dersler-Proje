package Day_practice;

public class C02_pratice16nisan {
    public static void main(String[] args) {
        //Soru 1- Verilen 2 katli bir array’de
        //       her bir inner array'deki 0. index'de bulunan sayilari toplayip,
        //       sonucu yazdiran bir method olusturun.

        int [] []  arr = {{1,2,3,4,5},{2,4,6,8},{4,7,11,25}};

        ilksayilaritopla(arr);

    }

    public static void ilksayilaritopla(int [] [] arr){
        int toplam = 0;


        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i][0];

        }

        System.out.println("verilen listedeki 0'nci index değerleri toplamı :" + toplam);

    }

}
