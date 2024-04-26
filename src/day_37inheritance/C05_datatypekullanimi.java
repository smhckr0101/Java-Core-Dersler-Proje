package day_37inheritance;

import day_35_encapsulation_inheritance.C07_Araba;
import day_35_encapsulation_inheritance.C08_Toyota;
import day_35_encapsulation_inheritance.C09_Corolla;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C05_datatypekullanimi {
    public static void main(String[] args) {
        String str = "java gün geçtikçe güzelleşiyor";

        // Burdaki string javanın oluşturduğu bir Class tır.
        // aynı zamanda str variable ının data türüdür.

        C09_Corolla corolla = new C09_Corolla();
        // Burdaki C09 Corolla hme bizim oluşturduğumuz class
        // hem de corolla objesinin data türüdür.

        // non-primitive data türleri bir class tan oluşturulan objelerdir
        // ve oluşturdukları class larda olan özellikleri (variable,method) taşırlar

        List<Integer> liste1 = new ArrayList<>();
        ArrayList<Integer> liste2 = new ArrayList<>();

        int sayi = 10;
        // String s = sayi;
        Object onj = sayi;

        String s = "java";
        onj = s ;

        // non-primitive data türlerinde aralarında parent-child ilişkisi olan class larda
        // parent class a child class atanabilir

        C09_Corolla corolla1  = new C09_Corolla();
        C08_Toyota corolla2 = new C09_Corolla();
        C07_Araba corolla3 = new C09_Corolla();

        // Bir objenin data türü olarak kendi class ı ya da parent classı

    }
}
