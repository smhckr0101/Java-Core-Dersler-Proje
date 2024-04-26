package day_35_encapsulation_inheritance;

public class C06_Encapsulerunner {
    public static void main(String[] args) {
        C05_Encapsuleclass obj = new C05_Encapsuleclass();

        // obj.satistutari = 30;
        // System.out.println(obj.satistutari);
        // System.out.println(obj.toplamsatisstutari);

        obj.setSatistutari(50);
        //System.out.println(obj.setSatistutari(50););

        // satış miktarına değer atayabiliyoruz ama yazdıramıyoruz.
        obj.setSatistutari(200);
        obj.setSatistutari(25);

        System.out.println(obj.getToplamsatisstutari());
        // obj.getToplamsatisstutari() = 500;
        // toplam satış tutarını yazdırıp görebiliriz ama toplam satış tutarına değer atayamıyoruz

        obj.publicsayi = 60;
        System.out.println(obj.publicsayi); // 60

        // obj.getEncapsulesayi() private olduğu için atama olmaz yazdırılamaz da

        // ama getter ve setter üzerinden işlem yapılabilir.

        obj.setEncapsulesayi(45);
        System.out.println(obj.getEncapsulesayi());

        /*
        bir variable ı public yapmak ile private yapıp setter ve getter oluşturmak erişim açısından aynı sonucu verir.
        Bazı developerlar public yapmak yerine getter ve setter yapmayı tercih ederler.
         */


    }



}
