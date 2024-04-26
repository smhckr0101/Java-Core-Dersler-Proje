package day_42_interfaces;

import java.util.List;

public class H_childİstisnaKullanımı implements G_InterfacedeBodysiOlanMethodoluurmu{

    @Override
    public void method1() {

    }

    // parent interface de defalut olarak işaretlenen method 3
    // ve statik olarak isretlenen method 4
    // istisnai methodlar olduğu için implement edilmek zorunda değildir.
    public static void main(String[] args) {
        /*
        bir interface de sonradan eklenecek olan method un
        child class lar tarafından implement edilmesini zorunlu olmaktan çıkarmak için
        default veya static keyword ları kullanılabilir.

        bu iki kelime arasında method oluşturma husuunda hiçbir fark yoktur.

        aralarındaki fark child class lardan bu methodlara erişim yöntemindedir.

        -statik metoda statik yöntemle yani
        interface adı.staticmethodadı (): ulaşabiliriz

        -default keyword ile oluşturulan methoda ise obje üzerinden ulaşabiliriz.

         */
        G_InterfacedeBodysiOlanMethodoluurmu.method4();

        H_childİstisnaKullanımı obj1 = new H_childİstisnaKullanımı();
        obj1.method3();

        G_InterfacedeBodysiOlanMethodoluurmu obj2 = new H_childİstisnaKullanımı();

        obj2.method3();



    }
}
