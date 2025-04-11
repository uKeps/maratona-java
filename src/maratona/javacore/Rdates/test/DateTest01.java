package maratona.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1744395806022L);// log 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
