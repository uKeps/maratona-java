package maratona.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeDutch = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeDutch);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        System.out.println("Italy "  + dateFormat1.format(calendar.getTime()));
        System.out.println("Dutch "  + dateFormat2.format(calendar.getTime()));
        System.out.println("India "  + dateFormat3.format(calendar.getTime()));
        System.out.println("Japan "  + dateFormat4.format(calendar.getTime()));
        System.out.println("CH "  + dateFormat5.format(calendar.getTime()));

        System.out.println(localeJapan.getDisplayCountry(localeJapan));
        System.out.println(localeCH.getDisplayCountry(localeCH));
    }
}
