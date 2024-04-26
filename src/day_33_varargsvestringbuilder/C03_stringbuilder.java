package day_33_varargsvestringbuilder;

public class C03_stringbuilder {
    public static void main(String[] args) {
        String str = "java güzeldir";

        String s = new String("String non primitive dir");

        StringBuilder  sb1 = new StringBuilder();
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder("deneme");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity()); // 16 + length kadar >> 22



        StringBuilder sb3 = new StringBuilder(7); // 7 karakter alabilen bir string alır
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 7


    }
}
