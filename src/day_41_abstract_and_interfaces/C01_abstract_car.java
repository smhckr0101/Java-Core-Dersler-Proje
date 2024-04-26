package day_41_abstract_and_interfaces;

public abstract class C01_abstract_car {

    // bu class ı car üretmek isteyen markaların
    //kendilerine uyarlaması gereken methodları belirlemek için oluşturduk

    // motoru mecbur yapalım
    public abstract void motor();
    //body si olmaz


    // sunroof isteğe bağlı
    public void sunroof(){
        System.out.println("Arabalar isterse sunroof kullanabilir");
        // child calss ları kendisine uyarama konusunda
        //serbest bırakmak istediğimiz methodları
        // consrete yanı abstract olmayan metod olarak oluştururuz

    }

    //yakıt zorunlu
    public abstract void yakit();
    // abstract metodlar consrete metodlar gibi
    //bir işlem yapmak üzere değil
    //Child classları uyarlamaya mecbur etmek için kullanılır
    //standartlarda olan yazılar gibidir.

    //geri görüş kamerası zorunlu değil
    public void gerigoruskamerasi(){
        System.out.println("Arabalar isterse gerigörüş kameraso kullanabilir");
    }


    //düzvitesotomatikvites zorunlu

    public abstract void sanzuman();

}
