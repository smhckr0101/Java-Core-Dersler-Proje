package day_32_datetime_varargs;

public class C03_varargs {
    public static void main(String[] args) {

        // Eğer bir moethod'da aynı cinsten istendiği kadar parametre kabul etmesini istiyorsak
        // parametre olarak varargs (variety of arguments) kullanırız.
        // varargs sadece parametre olarak kullanıır ve array altyapısı ile çalışır

        topla(5,4);
        topla(2,3,3);

        topla(2,3,3,32,3,3);




    }
    public static void topla(int... sayilar) {
        int toplam = 0;
        for (int each : sayilar){
            toplam += each;
        }
        System.out.println(toplam);
    }
    public static void topla(int a, int b)
    {
        System.out.println(a+b);
    }

    public static void topla(int a, int b, int c)
    {
        System.out.println(a+b);
    }
}
