package day_29_passbyvalue;

public class C01_StaticBlocks {

    // Static bloklar tüm method larfan ve kod bloklarından önce çalışırç
    // main method dan bile önce çalışır.

    // Class çalışmaya başlamadan yapılması gereken herhangi bir iişlem varsa Static bloklar kullanılmalıdır.
    // Eğer birden fazla statik blok varsa kendi içlerinde üstteki blok daha önce çalışır


    C01_StaticBlocks() {
        System.out.println("Constructor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("main method çalıştı");

        C01_StaticBlocks obj = new C01_StaticBlocks();

    }

    public static void method1(){
        System.out.println("method çalıştı");
    }

    static {
        System.out.println("Static block çalıştı"); // en önce bu çalışır
    }
}
