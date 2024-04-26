package Day_practice;

public class C03_practise2
{
    public static void main(String[] args) {
        //Soru 5- Verilen 2 katli bir array’de
        //        her bir inner array’in son elementlerinin toplaminini
        //        yazdiran bir method olusturun.

        int [][] arr = {{2,2,3,3,2,7},{4,5,6},{1,2,3}};
        sonsayilaritopla(arr);
    }

    public static void sonsayilaritopla(int[][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
             toplam += arr[i][arr[i].length-1];

        }
        System.out.println(toplam);

    }
}
