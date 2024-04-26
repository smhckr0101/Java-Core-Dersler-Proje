package day_35_encapsulation_inheritance;

public class C04_runner {
    public static void main(String[] args) {
        C03_depoclass obj = new C03_depoclass();

        // obj.intprivate = 20;

        obj.intdefault = 40;
        System.out.println(obj.intdefault); // 40

        obj.intprotected = 23;
        System.out.println(obj.intprotected); // 23

        obj.integerpublic = 0;
        System.out.println(obj.integerpublic);


    }
}
