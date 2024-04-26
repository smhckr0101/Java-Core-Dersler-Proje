package day_24_arraylistforeach;

public class C05_forEachLoop {
    public static void main(String[] args) {

        //Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.
        int[] arr = {3,4,5,2};

    }
    public static void karelerintoplami(int[] arr){

        int toplam = 0;

        for(int each:arr){
            toplam += each*each;
        }
        System.out.println("Arraydaki sayıların kareleri toplamı: " + toplam);
    }


}
