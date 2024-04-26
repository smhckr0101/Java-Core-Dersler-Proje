package day_35_Accessmodifier;

public class C03_aynopackagefarkliclass {
    public static void main(String[] args) {
        System.out.println(C02_depo.defaultstr);
        System.out.println(C02_depo.str);
        System.out.println(C02_depo.publicstr);
        // C02_depo.privatestr private göremiyoruz


        C02_depo depo = new C02_depo();
        // obje oluştursan diğerlerine ulaşırsın ama yine private a ulaşamazsın

    }
}
