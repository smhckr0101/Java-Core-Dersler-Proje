package day_21_multidimensionalArrays;

import java.util.Arrays;

public class c05_soru {
    public static void main(String[] args) {
        ////Soru 2- Verilen 2 katli ,2 elemanli bir multidimensional array'de
        ////        ayni index'e sahip elementleri toplayip,
        ////        yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        ////    input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        ////     output:                       [5, 7, 11]

        int[][] arr =  {{3,4,5}, {2,3,6,7}};



        int toplamlar = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        int[] yeniarr = new int[toplamlar];


        for (int i = 0; i < toplamlar; i++) {

            yeniarr[i] = arr[0][i] + arr[1][i];

            }

        System.out.println(Arrays.toString(yeniarr));


        }
    }

