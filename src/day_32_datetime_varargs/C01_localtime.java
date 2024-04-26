package day_32_datetime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C01_localtime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dpgumtarihi = LocalDate.of(1991,11,05);

        // verilen zamanlar arasındaki farkı bir variable a kaydetmek isterseniz
        Period yasim = dpgumtarihi.until(bugun);
        System.out.println(yasim.getYears());


        System.out.println(dpgumtarihi.until(bugun));
        System.out.println(dpgumtarihi.until(bugun).getYears()); // 32
        System.out.println(bugun.lengthOfMonth()); // 30
        System.out.println(bugun.lengthOfYear()); // 366

        // yılın kaçıncı gününde olduğuunu yazdıralım

        System.out.println(bugun.getDayOfYear()); // 97


    }
}
