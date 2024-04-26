package day_39_inheritance_overriding;

public class C05_child extends C04_parent{
    public void method1(){
        // Child class ta overriding method oluşturmak için
        // method ismi ve signature ı aynı olmalıdır.
    }
    public void method2(int sayi){
        // parent'daki method2 ile sşgnature ı aynı olmadığından
        // overriding olmaz
        // signature == isim + parametreler
    }

    @Override
    public int method3() {
        // overriding methodu intellij e oluşturduğumuzda
        // @override notasyonu kullanılır.
        // bu notasyonun görevi parent classs taki
        // overridden methodu takip edip
        // override etmeye mani olacak bir değişiklik olursa
        // CTE vermektir.
        return 6;

    }
    public String method4()
    {

        // access modifier method signature ına dahil değildir
        // ama overriding için access mdifier lar da önemlidir.

        // overriding de shilc classs taki methodun acces modifier I
        // parent class takinden daha kısıtlayıcı olamaz

        return "java";
    }
    private void method5(){
        // parent class da olsa private  access modifier ı olan class üyeleri
        // başka class lardan görülemeyeceği için
        // private method lar override edilemez.
    }

    public static void metod6(){

        // static method lar da override edilemez

    }

    // public void method7(){ ==> over ride edilemiyor
    // çünkü parent ta final olarak belirlendi

    public int method8(){

        // return type da signature a dahil değildir.
        // ama overriding de onemlidir.
        // parent class daki method un return type ı
        // primitive data türleri veya void ise
        // overriding methodun return type ı AYNI OLMALIDIR.

        return 6;

    }

    public String method9(){

        //Eğer return typr noon-primitive ise
        // Child class taki return type
        // ya parent daki return type ile aynı olmalı
        // ya da parent daki return type ın child ı olabilir.
        // bu ilişkiye co-variant data türü denir.

        return "java";
    }
    public void method10 () {

        // bizim müdahalemiz olmazsa overridden method ve
        // overriding method dan sadece biri çalışır.
        // Eğer iki metodun da çalışmasını istersek
        // child class taki method'da
        // Parent class taki methodu çağırabiliriz. super.method10 yazarak

    }



}

