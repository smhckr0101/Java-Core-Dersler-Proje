package Day_27_Constructor_call;

public class C01_ConstructorCall {
    C01_ConstructorCall(){
        this("java"); // Const 2 yi çağırdık ama BU İLK SATIRDAA OLMAK ZORUNDA.
    }// Cons1


    void C01_ConstructorCall(){} //Method

    C01_ConstructorCall(String str) {} // Cons 2

    C01_ConstructorCall(int a) { // Cons3
        // C01_ConstructorCall(d:"java") // BU SYNTAX METHOD CALL İÇİNDİR.
        // isim() : Bu syntax method call içindir
        this(); // Constructor call bu syntax ile çalışır

    }

    int C01_ConstructorCall(double d){ // method 2
        return 0;
    }


    public static void main(String[] args) {

    }
}

