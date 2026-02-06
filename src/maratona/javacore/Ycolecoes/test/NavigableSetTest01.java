package maratona.javacore.Ycolecoes.test;

import maratona.javacore.Ycolecoes.domain.Manga;
import maratona.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;



class SmarthponeMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthponeMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>();
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
