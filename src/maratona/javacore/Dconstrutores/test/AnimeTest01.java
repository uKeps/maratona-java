package maratona.javacore.Dconstrutores.test;

import maratona.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Solo Leveling", "TV", 12, "Action, Adventure, Fantasy", "Madhouse");
        anime.print();
    }
}
