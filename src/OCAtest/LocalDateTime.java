package OCAtest;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTime {

    public static void main(String[] args) {

        LocalDate dt = LocalDate.now();

        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(dt.toString());

        Period p = Period.of(1,1,1);
        dt = dt.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dt.format(f));

        String  s = "01/12/2015";
        LocalDate d2 = LocalDate.parse(s,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(d2);

    }
}
