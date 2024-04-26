package day_42_interfaces;

public class C_chlidofinterfaces implements B_parentinterface02{
    // parent i olan tüm abstract yapılardaki
    // concrete olmayan methodları
    // implement etmek zorundadır.


    public void method1(){}

    public String method2(){
        return null;
    }
    public String method3(){
        return null;
    }
    // Bir class birden fazla parent edinirse
    //(bir class veya istediği kadar interface)
    // ve bu parent larda aynı isimde methodlar varsa
    // - parent class larda aynı isimde olan methodların
    // return typre ları aynıysa sorun yok
    // - ama return type ları farklı ise
    // iki parent ı da mutlu etme şansı olmadığından
    // ya parent lardan birinden vazgeçmelisiniz
    // ya da parentlarda değişiklik yapmalısınız.

    // parent edinilen interface lerde değişiklik yapmak
    // o interface ı implement eden pek çok class da
    // değişikliklere sebep olacağından
    // ZORUNLU KALMADIKÇA tercih edilmez.

    public int method4(){

        return 8;
    }

}
