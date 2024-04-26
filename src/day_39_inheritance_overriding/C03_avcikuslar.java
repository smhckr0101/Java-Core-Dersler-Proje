package day_39_inheritance_overriding;

public class C03_avcikuslar extends C02_kuslar{
    public void hareket() {
        System.out.println("ucarlar");
    }
    public void beslenme() {
        System.out.println("et yerler");
    }
    public void pence() {
        System.out.println("pencelidir");
    }
    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {


    /*
    önceki gün özellikleri variable olarak oluşturmuştuk.
    Özellikler variable ise
    dikkat etmemiz gereken en önemli nokta,DATA TÜRÜ seçilen Class dır.
    data türü seçilen class dan aramaya başlayıp, ilk bulduğumuzu kullanırız.

    Ancak;
    özellikler method olarak oluşturulduğunda
    overriding(geçersiz kılmak) devreye gireirç
    override eden method lar ve override edilen methodlar
    intellij de aşağı ve yukarı yönlerle override ı ifade ederler.

    özellikleri belirlemede data türü seçilen classs ve constructor lar
    birlikte eetkili olurlar.

    aramaya data türü seçilen class'tan başlarız.
    aranana özellik bulununca, hemen ilk bulunanı kullanmayız.
    bulduğumuz method constructor ın olduğu class a kadar
    override edilmişse
    daha güncel bilgiyi kulllanırız.

    Eğer constructor ve data türü aynı class tan ise
    özelliklerin variable veya method olması farketmez.
    o class tan ilk bulduğumuzu kullanırız.
    Eğer constructor ve data türü farklı ise variable ve method lar
    farklı davranır.  ikisinde de aramaya data türünden bşalarız.
    variable ilk bulduğunu kullanır.
    methos ise en güncelini arar ve onu kullanır.

     */

        C03_avcikuslar kartalAvK = new C03_avcikuslar();
        kartalAvK.omur(); // H yasar ve olurler

        kartalAvK.solunum();// K akcigerle nefer alor
        kartalAvK.cogalma(); // K yumustayla cogalır
        kartalAvK.kanat(); // K kanatlıdır

        kartalAvK.hareket(); // AvK uçaarlar
        kartalAvK.beslenme(); // AvK etle beslenir
        kartalAvK.pence(); // AvK pencelidir
        kartalAvK.gaga(); // AvK sivrigagalıdır.


        C02_kuslar kartalkus = new C03_avcikuslar();

        // data türü ve sonstructor aynı ise method ya da variable olmasının bir farkı yok
        //  ama farklı class larda durum farklı
        // yukarda obje avcıkuslardan oluturuluyor ve constructor new in yanıdaki oluyor
        // aramaya kuslar class ından başlıyoruz avcıkuslar class ından değil

        kartalkus.omur(); // H yasar ve olurler

        kartalkus.solunum();// K akcigerle nefer alor
        kartalkus.cogalma(); // K yumustayla cogalır
        kartalkus.kanat(); // K kanatlıdır

        kartalkus.hareket(); // AvK uçaarlar
        kartalkus.beslenme(); // AvK etle beslenir
        //  kartalkus.pence(); // AvK pencelidir // CTE kuşlar ve Hayvanlar da yok
        kartalkus.gaga(); // AvK sivrigagalıdır.

        C01_hayvanlar kartalHayvan = new C03_avcikuslar();

        // constructor ve obje farklı class farklı
        // aramaya haycvanlar class ından başlanmalı

        kartalHayvan.omur(); // H yasar ve olurler

        kartalHayvan.solunum();// K akcigerle nefer alor
        kartalHayvan.cogalma(); // K yumustayla cogalır
        //kartalHayvan.kanat(); //  CTE hayvanlar da yok

        kartalHayvan.hareket(); // AvK uçaarlar
        kartalHayvan.beslenme(); // AvK etle beslenir
        //kartalHayvan.pence(); // CTE  HAyvanklarda yok
        //kartalHayvan.gaga(); // CTE hayvanlarda yok

        C02_kuslar kus1 = new C02_kuslar();

        kus1.omur(); // H yasar ve olurler

        kus1.solunum();// K akcigerle nefer alor
        kus1.cogalma(); // K yumustayla cogalır
        kus1.kanat(); // K kanatlıdır

        kus1.hareket(); // H hareket eder
        kus1.beslenme(); // H beslenir
        // kus1.pence(); // AvK pencelidir // kuşlar ve Hayvanlar da yok
        kus1.gaga(); // AvK sivrigagalıdır

        C01_hayvanlar kushayvanlar = new C02_kuslar();

        // aramaya hayvanlardan bakar yoksa cte verir varise kkuşlara kadar inip en güncelini arar

        kushayvanlar.omur(); // H yasar ve olurler

        kushayvanlar.solunum();// K akcigerle nefer alor
        kushayvanlar.cogalma(); // K yumustayla cogalır
        // kushayvanlar.kanat(); // CTE hayvanlar da yok

        kushayvanlar.hareket(); // H hareket eder
        kushayvanlar.beslenme(); // H beslenir
        //kushayvanlar.pence(); // CTE hayvanlar da yok
        //kushayvanlar.gaga(); // CTE hayvanlar da yok

        C01_hayvanlar hayvan1 = new C01_hayvanlar();

        hayvan1.omur(); // H yasar ve olurler

        hayvan1.solunum();// K akcigerle nefer alor
        hayvan1.cogalma(); // K yumustayla cogalır
        // hayvan1.kanat(); //  CTE hayvanlar da yok

        hayvan1.hareket(); // H hareket eder
        hayvan1.beslenme(); // H beslenir
        //hayvan1.pence(); // CTE hayvanlar da yok
        // hayvan1.gaga(); // CTE hayvanlar da yok
    }
}