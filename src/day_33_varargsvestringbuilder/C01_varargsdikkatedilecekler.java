package day_33_varargsvestringbuilder;

public class C01_varargsdikkatedilecekler {
    public static void main(String[] args) {
        // verilen farklı adetlerdeki sayıların
        // sonuncusu hariç geriye kalanları toplayıp
        //son sayı ile bu toplamıı çarpıp yazdıran bir method oluşturalım.


        // ÖNEMLİ NOT
        // var args ın kapasite sınırlaması yok verilen her sayıyı lamk isteyecektir. Bu durumda
        // eğer parametre olarak yazılan varars'dan sonra başka bir parametre yazarsanız
        // varargs kendinden sonraki parametreeye bir eleman bırakmaz
        // Bu durumda method çalışmaz

        // Kural1 : Varargs her zaman son parametre olarak yazılmalıdır.
        // Kural 2 : Kural1 den dolayı bir method da birden fazla VARARGS olamaz
    }
    // public static void islem(int...bastaki sayilar, int sondaki)
}
