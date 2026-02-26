package maratona.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos(numeros)
        // \D = tudo o que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tdo que nao for incluso no \w
        // [] = todos os caracteres expecificados dentro dos colchetes, case sensitive
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String text = "abaaba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text:  " +text2);
        System.out.println("index: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
