package day_42_interfaces;

public interface G_InterfacedeBodysiOlanMethodoluurmu {

    /*
    büyük bir projede pekçok interface olabilir.
    bu interface lar yüzlerce / binlerce class tarafından implement edilmiş olabilir.

    Eğer günün birinde varolan bir interface a
    yeni bir method eklememiz gerekirse
    bugüne kadar o interface ı implement etmiş olan
    Bütün Child Class lar yeni methodu implement etmediği için CTE verir.
    tüm child class ları bulmamız
    her bir class ın durumunu inceleyip
    yeni method u Child class lara uyarlamamız gerekir.

    Developer ların bu tür ihtiyaçları sorunsuz çözebilmesi için
    JAVA 8 ile istisnai bir yol oluşturuşmuştur.

    Java özel 2 keyword belirleyerek interface içinde
    bu keyword e sahip olan methodların body si olmasına
    ve böylece implement edilme zorunluluğu olmamasına olanak sağlamıştır.

    Bu iki keyword : default, static
     */

    public void method1();  // ınterface içinde olduğndan biz yazmasak da
                            // java otomatik olarak abstract kabul eder.
    // public void method2(){}  // body oluşturmaya izin yok

    public default void method3(){
        // burada default un access modifier olması mümkün değil
        // çünkü access modifier olarak public var
        // burdaki default 1.istisna keywordudur.

        System.out.println("ınterface içinde default method ");

    }


    public static void method4(){
        // istisna olarak default ve static keyword içeren method oluştururssak
        // mutlaka bodysi olmalıdır.

        System.out.println("interface içinde static method");
    }


}
