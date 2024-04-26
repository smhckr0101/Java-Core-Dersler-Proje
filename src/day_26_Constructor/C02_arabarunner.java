package day_26_Constructor;

public class C02_arabarunner {
    public static void main(String[] args) {
        C01_araba araba1 = new C01_araba();

        System.out.println(araba1); // C01_araba{marka='Marka belirtilmedi', model='model belirtilmedi', yil=1998, fiyat=0}

        C01_araba araba2;
        //System.out.println(araba2.fiyat); // Variable 'araba2' might not have been initialized
        // (değer ataması yapılmadı)

        // Bir constructor çalışmadan objeye ilk değer ataması yapılamaz. İlk değer ataması yapılmadan da kullanılamaz.

        System.out.println(new C01_araba().fiyat); // 0

        // eşitliğin sadece sağ tarafı olursa constructor çalıştığı için
        // Class'a gidip yeni bir obje oluşturur,bize getirir.
        //Ancak getirdiği objeyi kaydetmediğimiz için o obje sadece satır için VAR olur.
        // o yüzden iki taraflı eşitlik en sağlıklı çalışandır.



    }
}
