package day_30_passbyvallue;

public class C05_Stringpool {
    public static void main(String[] args) {
        /*
        equals metodu sadece metne odaklanır

        == ise hem depere hem de referansa bakar
        referans farklı ise metin aynı olsa da false verir.
         */

        String str1 = "Ali";

        String str2 = "Ali";

        String str3 = new String("Ali");

        String str4 = "A" + "li";

        String str5 = "A";

        String str6 = "li";

        String str7 = str5 + str6;

        String str8 = "a";

        String str9 = str8.toUpperCase().concat(str6);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true

        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str7)); // true

        System.out.println(str1.equals(str9)); // true

        System.out.println(str1.equals("Ali")); // true

        System.out.println("==============");

        System.out.println(str1==str2); // True
        System.out.println(str1==str3); // False
        System.out.println(str1==str4); // True
        System.out.println(str1==str2); // True







    }
}
