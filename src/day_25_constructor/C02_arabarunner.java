package day_25_constructor;

public class C02_arabarunner {
    public static void main(String[] args) {

        // biz bir classtan obje oluşturduğumuzda java obje oluşturup oluşturduğu clastaki
        // tüm instance variable ları e değerlerin birer kopyasını oluşturur
        // ve objeye yapıştırır.

        //PEKİ BU İŞİ KİM YAPIYOR

        // bir obje oluşturulduğunda o objeye ilk değer atama işlevini (initialization)
        // constructoro yapar.

        // Constructorlaar () kullandıkları için method lara benzetilirler.
        // ama constructorlar java da kendesine has bir yapıdır.

        // diğer bir deyişle bir constructor çalışmadan
        // bir obje oluşturulup ona iilk değer ataması yapmak mümkün değildir.

        // java her class tan obje oluşturabilmesini sağlamak için
        // her class a görünmeyen default bir constructor koymuştur.

        // yani bir class ta gözle görülebilir
        // bir constructor yoksa o class ta default constructor vardır


        C01_araba araba1 = new C01_araba();

        System.out.println(araba1.fiyat); // 0
        System.out.println(araba1.marka); // MB
        System.out.println(araba1.model); // MB
        System.out.println(araba1.yil); // 1998

        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil = 2012;
        araba1.fiyat = 8000;

        C01_araba araba2 = new C01_araba();


        System.out.println(araba2.fiyat); // 0
        System.out.println(araba2.marka); // MB
        System.out.println(araba2.model); // MB
        System.out.println(araba2.yil); // 1998

        C01_araba      araba3     =      new        C01_araba();
        // class ad   obje adı   atama   keyword    constructor

    }
}
