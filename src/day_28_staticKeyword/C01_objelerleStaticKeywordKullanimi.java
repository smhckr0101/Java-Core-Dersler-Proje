package day_28_staticKeyword;

public class C01_objelerleStaticKeywordKullanimi {
    public static void main(String[] args) {
        C00_kastane hemsire1 = new C00_kastane();
        System.out.println(hemsire1.peraonelisim); //deger atanmadı
        System.out.println(hemsire1.personeladres); //adres girilmedi
        System.out.println(hemsire1.personeltel);  // telefo girilmedi

        // Staticlere ulaşmak için class ismi yazmalı

        System.out.println(C00_kastane.bashekimisim); // ılgar
        System.out.println(C00_kastane.hasataneisim); // YILDIZ HASTANESİ

        hemsire1.peraonelisim = "Meltem";
        hemsire1.personeladres = "Sincan";
        hemsire1.hasataneisim = "Yenimahalle";

        C00_kastane hemsire2 = new C00_kastane();
        System.out.println(hemsire2.peraonelisim); //deger atanmadı
        System.out.println(hemsire2.personeladres); //adres girilmedi
        System.out.println(hemsire2.personeltel);  // telefo girilmedi

        System.out.println(hemsire2.hasataneisim); //yenimahalle

        hemsire2.peraonelisim = "selma";
        hemsire2.personeladres = "altindag";
        hemsire2.personeltel = "4564545";

        hemsire2.hasataneisim = "Medikal";
        hemsire2.bashekimisim = "murat";

        C00_kastane hemsire3 = new C00_kastane();

        System.out.println(hemsire3.peraonelisim); //deger atanmadı
        System.out.println(hemsire3.personeladres); //adres girilmedi
        System.out.println(hemsire3.personeltel);  // telefo girilmedi






    }
}
