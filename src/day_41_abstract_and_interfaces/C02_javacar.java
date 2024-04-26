package day_41_abstract_and_interfaces;

public class C02_javacar extends C01_abstract_car{

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {
        // PARENT ABSTRACT CLASS DAKİ
        //ABSTRACT METHODLARI CHİLD CLASSA
        //IMPLEMENT(uyarlama) etmek zorundayız.

    }

    @Override
    public void sanzuman() {

    }

    @Override
    public void sunroof() {
        // parent class daki concrete methodlar ise
        // child class lar tarafından IMPLEMENT edilmek zorunda değildir.
        // child class isterse parent class daki concrete methodu direkt kullanır
        // isterse override edip kendisine uyarlar
    }
}
