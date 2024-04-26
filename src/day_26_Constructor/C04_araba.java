package day_26_Constructor;

public class C04_araba {
    String marka = "Marka belirtilmedi";
    String model = "model belirtilmedi";
    int yil = 1998;
    int fiyat ;
    /* Eğer Constructor içinde instance Variable lara
    atama yapmak istersek constructor a parametre yazabiliriz.

    Parametre isimleri instance variable isimlerinden farklı ise
    Marka = mrkbu atamada mrknın parametresi açıkça belli olduğundan Java ekstre bilgiye ihtiyac duymaz.

    parametre isimeleri ile instance variable ları aynı ise marka = marka bu atama anamsız olur.
    içinde olduğumuz scope'da narka variable olduğundan Java class leverdaki instance lara bakmaz.

    Objeye ait instance markayıbelirtmek için this kullanılır.

    This. kullanıldığında Java içinde bulunduğumuz scope a bakmadan direkt class levellara bakar

     */

    C04_araba(){}

    C04_araba(String mrk, int fyt){

    marka = mrk;
    fiyat = fyt;}


    @Override
    public String toString() {
        return "C01_araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
