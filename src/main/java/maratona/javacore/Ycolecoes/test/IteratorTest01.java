package maratona.javacore.Ycolecoes.test;

import maratona.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"Berserk",19.9,0));
        mangas.add(new Manga(1L,"Naruto",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"DBZ",11.20,2));
        mangas.add(new Manga(2L,"AOT",2.99,0));

//        while(iterator.hasNext()){
//            Manga manga = iterator.next();
//            if (manga.getQuantidade() == 0){
//                iterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
