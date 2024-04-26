package day_32_datetime_varargs;

public class C04_varargs {
    public static void main(String[] args) {
        // verilen farklı adetlerdeki sayıların
        // ilki hariç geriye kalanları toplayıp
        //ilk sayı ile bu toplamıı çarpıp yazdıran bir method oluşturalım.

        islem(2,3,3,3);
    }

    public static void islem(int ilksayi, int... kalansayilar){
        int toplam = 0;


        for (int each : kalansayilar){
            toplam += each;

        }
        System.out.println(toplam*ilksayi);

    }
}
