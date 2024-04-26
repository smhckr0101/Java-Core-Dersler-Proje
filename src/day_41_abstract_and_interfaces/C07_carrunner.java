package day_41_abstract_and_interfaces;

public class C07_carrunner {
    public static void main(String[] args) {

        // abstract class lar class oldukları için coonstructor lar ı vardır
        //ama abst class larda abst method lar olduğundan
        // bu abst class lardan obje oluşturulamaz.

        //data türü olarak abst class lar seçilebilir .
        // ancak const olarak concrete bir class seçilebilir.
        C01_abstract_car car1 = new C02_javacar();

        car1.gerigoruskamerasi();
        // arabalar isterse geri görüş kamerası kullanabilir.
        car1.motor();


    }
}
