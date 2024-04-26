package day_42_interfaces;

public class F_Child_of_classANDinterfaces extends E_parentclass
                                            implements A_parentinterface01, D_parentinterfaces03

{

    @Override
    public String method4() {
        return "";
    }

    @Override
    public int method3() {
        return 0;
    }
    // birden fazla parent edinen class
    // parent abstract yapılarda bulunan
    // concrete leştirilmemiş tüm abstract yapılarıı
    // kendisine uyarlamak zorundadır.

    //bu örnekte method1 ve method2
    // parentClass da concrete olarak bulunduğundan
    // implement etme zorunluluğu yoktur.

    public static void main(String[] args) {
        // System.out.println(SAYI); İKİ YERDE DE SAYI VAR HANGİSİ OLDUĞUNU ANLAYAMIYOR

        System.out.println(D_parentinterfaces03.SAYI); //20
        System.out.println(E_parentclass.SAYI); // 50
        System.out.println(A_parentinterface01.SAYI); // 10

        // A_parentinterface01.SAYI = 45; (CANNOT ASSIGN A VALUE TO FINAL VARİABLE)
        // interface lerdeki tüm variable lar final olduğundan değer atanaamaz
        E_parentclass.SAYI = 44; // BUNA DEĞER ATANABİLİR.


        /*
        birden fazla aynı isimde variable olursa
        parent ismi ile yazarak istediğimizi yazabiliriz.
         */
    }
}
