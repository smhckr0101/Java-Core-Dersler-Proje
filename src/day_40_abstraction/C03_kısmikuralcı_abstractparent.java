package day_40_abstraction;

public abstract class C03_kısmikuralcı_abstractparent {

    /*
    bir class istersen kendini parent edinecek child class ların
    mutlaka implement etmesi gereken methodları belirleyebilir.

     örneğin bu classımız kendisinde bulunan method1 ve method2 yi
     C03 edinen tüm child class ların implement etmesini zorunlu kılmak istiyor.

     bu zorunluluğu sağlamak için
     1-kural koymak isteyen class abstract olmalıdır.
     bir class ı abstract yapmak için class deklerasyonuna abstract yazmak yeterlidir.

     2- bir abstract class içindeki tüm method lar zorunlu değildir.
     child class ların implement etmesini zorunlu kılmak istediğimiz
     methodları da abstract yazmalıyız

     Bir methodu abstract yapmak için
     method deklerasyonuna abstract yazmalıyız
     abstract method lar bugüne kadar kullandığımız methodlar gibi değildir.
     Absract methodları normal bir method olarak değil sadece bir kuralı belirten
     standart yazısı gibi düşünebiliriz.
     Abstract method lar sadece kural cümlesidir.
     adından da anlaşıalacağı gibi (abstract= soyut yani body si olmayan)
     abstractmethodların body si olmaz

     */

    // Child classların kendine uyarlaması zorunlu olsın.

    public abstract void method1();

    // Child classların kendine uyarlaması zorunlu olsın.

    public abstract void method2();


    // Child classların kendine uyarlaması zorunlu OLMASIN.

    public void method3(){}



}
