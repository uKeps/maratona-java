package maratona.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos(numeros)
        // \D = tudo o que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = tdo que nao for incluso no \w
        // [] = todos os caracteres expecificados dentro dos colchetes, case sensitive
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        //() agrupamento
        // | o(v|c)o ovo | oco
        // $ fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Valid email");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(text.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:  " +text);
        System.out.println("index: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
