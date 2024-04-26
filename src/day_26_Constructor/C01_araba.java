package day_26_Constructor;

public class C01_araba {
    String marka = "Marka belirtilmedi";
    String model = "model belirtilmedi";
    int yil = 1998;
    int fiyat ;

    C01_araba(){
        //Biz bir Class a görünür bir constructor oluşturduğumuzda
        // java default constructer'ı siler
        // Bu durumda daha önceden default constructor ı kullanarak oluşturuşan objeler CTE verir.
        // Kodun problem yaşamaması için görünür bir cons oluşturduğumuzda Hemen default  cons yerine de
        //görünür bir parametersiz Cons oluşturmalıyız
    }
    C01_araba(String mrk, String mdl, int yl, int fyt)
    {
       marka = mrk;
       model = mdl;
       yil = yl;
       fiyat = fyt;
    }







    @Override
    public String toString() {
        return "C01_araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
