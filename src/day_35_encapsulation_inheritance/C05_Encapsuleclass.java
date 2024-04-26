package day_35_encapsulation_inheritance;

public class C05_Encapsuleclass {
    /*
    1- Satışs elemanları satış tutrına atama yapbilsin.
    Bu atanan satışlar, otomatik olarak toplam satışına eklensin
    ama satış tutrına son atanan değeri satış görevlileri göremesin.

    2- Toplam satış tutarı olarak hesaplanan değer herkes tarafından görülebilsin ama kimse değer atayamasın.

     */

    private int satistutari; // setter
    private int toplamsatisstutari; // getter
    private int encapsulesayi ; // hem getter hem setter
    public int publicsayi;

    /*
    Encapsultion bir mecburiyet değil bize yardımcı olmak için Java'nın hazırladığı bir yöntemdir.

    Eğer bir class üyesi için readk ve write yetkilerini ayırmak isterseniz
    ENCAPSULATION kullanabilirsiniz.

    1- Adından da anlaşılacağı gibi
    önce bu yetkileri ayırmak istediğmiz variable lara normal yollarla erişimi engellemelisiniz

    2- Sadece değer ataması (write) yapılmasını istediğimiz variable lar setter
    sadece görünmesini istediğimiz Setter
     */

    public int getToplamsatisstutari() {
        return toplamsatisstutari;
    }

    public void setSatistutari(int satistutari) {
        this.satistutari = satistutari;
        toplamsatisstutari += satistutari;

    }

    public int getEncapsulesayi() {
        return encapsulesayi;
    }

    public void setEncapsulesayi(int encapsulesayi) {
        this.encapsulesayi = encapsulesayi;
    }
}
