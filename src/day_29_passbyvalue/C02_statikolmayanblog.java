package day_29_passbyvalue;

public class C02_statikolmayanblog {

    // statik olmAYAN BLOKLAR CONSTRUCTOR DAN   önce çalışır. Obje oluşturulmadan önce yapılması gereken düwnlemeleri yapar.
    C02_statikolmayanblog(){
        System.out.println("Statik olmayan block çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("main methodçalıştı");

        C02_statikolmayanblog obj1 = new C02_statikolmayanblog();
        System.out.println("onj 1 oluştu");

        C02_statikolmayanblog ong2 = new C02_statikolmayanblog();
        System.out.println("obj2 oluştu");
    }

    {
        System.out.println("statik olmayan blok çalıştı");
    }
}
