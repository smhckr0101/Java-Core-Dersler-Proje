package day_35_Accessmodifier;

public class C04_aynıpackageChildclass extends C02_depo{
    public static void main(String[] args) {

            System.out.println(C02_depo.defaultstr);
            System.out.println(C02_depo.str);
            System.out.println(C02_depo.publicstr);
            // C02_depo.privatestr private göremiyoruz

        C02_depo depo = new C02_depo();
        System.out.println(C02_depo.defaultstr);
        System.out.println(C02_depo.publicstr);
    }
}
