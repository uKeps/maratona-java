package maratona.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate localDate = LocalDate.of(2025, Month.JANUARY, 28);
        LocalDate now = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDate);
        System.out.println(now);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
