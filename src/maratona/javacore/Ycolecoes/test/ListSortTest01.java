package maratona.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Naruto");
        mangas.add("Pokemon");
        mangas.add("DBZ");

        Collections.sort(mangas);

        for(String manga : mangas){
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);

        System.out.println(dinheiros);
    }
}
