package day_33_varargsvestringbuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        method1("Ali");
        method1("semih","murat","mehmet");
        method1("a","b","c","d","e");

    }
    public static void method1(String s,String... t) {
        System.out.println(s.length() + t.length);
    }
}
