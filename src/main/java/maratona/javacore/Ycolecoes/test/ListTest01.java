package maratona.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Erik");
        nomes2.add("vasco");
        nomes.add("Coutinho");
        nomes.add("Marquinhos");
        nomes.remove("Erik");

        nomes.addAll(nomes2);

        for (String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Yuri Alberto");

        System.out.println("--------");
        int size = nomes.size();
        for (int i = 0; i < size ; i++) {
            nomes.add("Neymar");
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
