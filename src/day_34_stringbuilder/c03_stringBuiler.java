package day_34_stringbuilder;

public class c03_stringBuiler {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Candır");

        System.out.println(sb.indexOf("a")); // 1

        // bize stringbuilder döndürmeyen metodlar string builderda kalıcı değişiklik yapmaz

        System.out.println(sb.substring(2, 4)); // va

        System.out.println(sb);

        // sb can içerir mi?
        // sb de contains yoksa string e çevirip (tostring ile)  string metodlarını kullanabiliriz.
        // bu yöntem ile yapılan değişiklikler kalıcı olmaz.


        System.out.println(sb.toString().contains("Can")); // true

        // sb yi büyük harfe çevirin

        sb = new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb);
    }
}
