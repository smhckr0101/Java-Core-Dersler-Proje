package day_34_stringbuilder;

public class C01_stringBuilder {
    public static void main(String[] args) {
        StringBuilder  sb1 = new StringBuilder();
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder("deneme");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity()); // 16 + length kadar >> 22



        StringBuilder sb3 = new StringBuilder(7); // 7 karakter alabilen bir string alır
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 7

        // Java non-primitive data türleri için
        // başlangıçta data türüne ve data kapasitesine bağlı olarak
        // uygun bir alan ayırır.
        // Eğer bilgi değişiirse
        // hafizada tuttuğu alan değişir

        sb3.append("java");
        System.out.println(sb3); // java
        System.out.println(sb3.length()); // 4
        System.out.println(sb3.capacity()); // 7 (java nın kapasitesi 7 den kğçğk olduğu için// )

        sb3.append(" candır");
        System.out.println(sb3);
        System.out.println(sb3.length()); // 11
        System.out.println(sb3.capacity()); // 7*2 +2 = 14

        sb3.append(false);
        sb3.append(44);

        System.out.println(sb3); // java candırfalse44
        System.out.println(sb3.length()); // 18
        System.out.println(sb3.capacity());  // 16*2+2 : 34

        sb3.trimToSize(); // fazlalıkları budar capacity length ile eşitlenir

        System.out.println(sb3);
        System.out.println(sb3.length()); // 18

        System.out.println(sb3.capacity()); // 18

        // stringbuilder string gibi metin ifadeler barındırır.
        // dolayısıyla metodlarda benzerdir ama ismi aynı olan her metod aynı şekilde çalışmayabilir.

        String str = "malatya";

        System.out.println(sb3.append(str, 4, 6)); // java candırfalse44ty
        System.out.println(sb3.length()); // 20
        System.out.println(sb3.capacity()); // 18*2 + 2 =38



    }
}
