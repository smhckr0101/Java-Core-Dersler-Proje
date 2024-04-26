package day_38inheritance;

public class C02_inheritancedaClassUyelerinikullanma extends C01_parent {

    String s = "ali";
    String t = "veli";

    int a = 33;
    int b = 34 ;
    int c = 35;
    public static void main(String[] args) {
        C02_inheritancedaClassUyelerinikullanma obj = new C02_inheritancedaClassUyelerinikullanma();

        obj.method();
    }

    private void method() {
        String s = "malatya";

        String k = "niğde";
        int a = 43;
        int b = 44;
        int c = 45;
        int d = 46;

        System.out.println(a); // 43
        System.out.println(this.a); //33  // ==> Class taki a yı yazdırır.Scope daki a yı atlar.
        System.out.println(super.a); // 10 ==> parent class taki a yı yazdırır.

        System.out.println(b); // 44
        System.out.println(this.b); // 34
        System.out.println(super.b); // 20

        System.out.println(c); // 45
        System.out.println(this.c); // 35
        // System.out.println(super.c); CTE

        System.out.println(d); // 46
        // System.out.println(this.d); // CTE
         // System.out.println(super.d); // CTE


        /* This.variable yazdığımızda aramaya scope u atlayıp
        class level'dan başlar.
        class seviyesinde veya parent class'larda buldupu ilk değeri kullanır.
        Class seviyesinde veya parent class larda variablle ı bulmazsa CTE verşr.

        super.variable ismi yazarsak aramay scope ve içinde oldupu class ıa tlayıp direkt parent class tan başlar.
        parent class veya parent class ın parentlarında bulduğu ilk değeri kullanır.
        Eğer perant class veya parent class ın parent larında bulamazsa CTE verir.

         */




        System.out.println(k); // Niğde
        System.out.println(s); // malatya
        System.out.println(t); // veli (scope ta olmadığı için class tan aldı
        System.out.println(str); // Java scope da ve class'daolmadığı için parent dan aldı

        /*
        Bir scope 'da herhangi bir class üyesini kullanmak istersek
        java sırası ile
        1- içinde olduğu scope
        2- içinde olduğu class
        3- parent class(lar) a bakar ve şlk bulduğunu kullanır.
         */

    }
}
