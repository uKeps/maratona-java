package maratona.javacore.Csobrecargametodos.test;

import maratona.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Solo Leveling", "TV", 12);
        anime.init("Solo Leveling", "TV", 12, "Action, Adventure, Fantasy");
        // same method name, different parameters
        anime.print();
    }
}
