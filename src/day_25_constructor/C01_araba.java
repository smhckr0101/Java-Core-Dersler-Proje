package day_25_constructor;

public class C01_araba {
    String marka = "Marka belirtilmedi";
    String model = "model belirtilmedi";
    int yil = 1998;
    int fiyat ;

    C01_araba(){

        // Java nın class lara koyduğu default constructor
        // 1-parametresizdir
        // 2-body sinde kod yoktur.
        //3- Görünmez

        }

        C01_araba(int a) {
        // bir yapının Constructor olabilmesi için
            // Şu iki şartı mutlaka sağlamalı
            // 1- ismi class ile birebir aynı olmalı
            // 2- Return type olmamalı
            // bu iki şartı sağladığı sürece
            // signature ları farklı istediğiniz kadar Constructor oluştureabilirsiniz.
        }
    void method1(){
        // bir method ile constructor arasındaki fark
        //methodların mutlaka return typre ları olur.
        // ama constructorların return type şarı olmaz
    }
}
