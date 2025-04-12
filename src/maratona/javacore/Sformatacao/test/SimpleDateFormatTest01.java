package maratona.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Amsterdam 11 de Abril de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
