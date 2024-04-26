package day_35_Accessmodifier;

public class C02_depo {

    // her class üyesinin  access modifier ı olmak zorundadır.
    // eğer görünür bi modifier yoksa java  o class üyesi için default access modifier atar.

    private int privatesayi;
    private static String privatestr;

    int defaultsayi ;
    static String defaultstr ;

    protected int protectedsayi ;
    protected static String str;

    public int publicsayi;
    public static String publicstr;

    public static void main(String[] args) {
        System.out.println(privatestr);
        System.out.println(defaultstr);
        System.out.println(str);
        System.out.println(publicstr);

    }
    public static void metod1(){
        // metod1 static olduğu için hem modifier a hem de static olmasına dikkat ederiz
        System.out.println(privatestr);
        System.out.println(defaultstr);
        System.out.println(str);

    }
    public void method2(){}
}

