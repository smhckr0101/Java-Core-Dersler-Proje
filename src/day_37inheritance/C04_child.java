package day_37inheritance;

public class C04_child extends C03_parent{

    /*
    Child class da oluşturulan her objenin
    parent classtaki özelliklere de sahip olabilmesi için java extends kullanan bir class taki
    her constructor ın ilk satırında
    constructor call olma mecburiyetş koymuştur.
    ,
         ilk satırda bir constructor call varsa ona göre çalışır
         yok ise java default olarak PARAMETRESİZ super() koyar*/
    C04_child(){
        System.out.println("Child parametresiz cons");
    }
    C04_child(int a){
        System.out.println( "int paramettreli cons");
    }
    C04_child(String s){
        super(5);
        System.out.println(" Child stringsüper parametreli");
    }
    C04_child(String a, int b ){
        super("ali");
        System.out.println(" chlid string ve int parametreli cons");
    }

    C04_child(double c){
        super(2.3);
        System.out.println(c);
    }

    public static void main(String[] args) {
        //C04_child child3 = new C04_child("Ali");

    C04_child child4 = new C04_child("a",1);

    C04_child child5 = new C04_child(1.1);
    }

}

