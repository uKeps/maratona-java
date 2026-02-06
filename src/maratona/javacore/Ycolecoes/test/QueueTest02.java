package maratona.javacore.Ycolecoes.test;

import maratona.javacore.Ycolecoes.domain.Consumidor;
import maratona.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Berserk",19.9,5));
        mangas.add(new Manga(1L,"Naruto",9.5,0));
        mangas.add(new Manga(4L,"Pokemon",3.2,2));
        mangas.add(new Manga(3L,"DBZ",11.20,4));
        mangas.add(new Manga(2L,"AOT",2.99,20));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
