package day_26_Constructor;

public class C03_arabarunner {
    public static void main(String[] args) {
        C01_araba araba1 = new C01_araba();
        araba1.marka = "BMW";
        araba1.model = "5.20";
        araba1.yil = 2001;
        araba1.fiyat = 5000;

        System.out.println(araba1); //marka='BMW', model='5.20', yil=2001, fiyat=5000

        C01_araba araba2 = new C01_araba("tofaş","şahin",1988,25000);

        C01_araba araba4 = new C01_araba("opel","corsa",2010,125000);
        /*     // Bir obje oluşturulduğunda ya Class tali dtandar özelliklere sahip olur.
        ve sonradan tek tek bu özelliklere değer ataması yapılır ==>>> araba1 gibi

        ya da taşımasını istediğimiz özellikler parametre olarak Constructor a yollanıp
        constructor içerisinde atamalar yapılır
        böylece objenin oluşturduğu satırda istediğimiz özelliklere sahip bir obje olulmuş olur.

         */



    }
}
