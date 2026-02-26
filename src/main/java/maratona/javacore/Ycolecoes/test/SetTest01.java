package maratona.javacore.Ycolecoes.test;

import maratona.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
       // Set<Manga> mangas = new HashSet<>();
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Berserk",19.9));
        mangas.add(new Manga(1L,"Naruto",9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"DBZ",11.20));
        mangas.add(new Manga(2L,"AOT",2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
