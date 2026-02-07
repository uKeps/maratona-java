package maratona.javacore.Zgenerics.test;

import maratona.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Gerson");
        lista.add("Gerson");

        for (String s : lista) {
            System.out.println(s);
        }
        add(lista, new Consumidor("Cabrunco"));
        for (String s : lista) {
            System.out.println(s);
        }

    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
