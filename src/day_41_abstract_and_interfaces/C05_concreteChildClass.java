package day_41_abstract_and_interfaces;

public class C05_concreteChildClass extends C04_abstractparent {


    @Override
    public void method5() {
        System.out.println("child method 5");

    }

    @Override
    public void methodd1() {

    }

    @Override
    public int method2() {
        return 10;
    }
}
    /*
    abstract silsileden sonra gelen
    İLK CONCRETE CLASS
    parent class larda concrete olmayan/concrete yapılmayan
    tum abstract yapıları uyarlamak ZORUNDADIR.

     */
