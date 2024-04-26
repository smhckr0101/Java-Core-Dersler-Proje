package day_34_stringbuilder;

public class C02_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb.insert(2, "t")); // jatva
        String str = "candir";

        System.out.println(sb.insert(3, str, 0, 4)); //jatcandva

        System.out.println(sb.delete(3, 6)); // jatdva

        System.out.println(sb.deleteCharAt(2)); // jadva

        System.out.println(sb.replace(2, 4, "ka candir")); // jaka candira

        System.out.println(sb.reverse()); // aridnac akaj

        System.out.println(sb.reverse()); // jaka candira




    }
}
