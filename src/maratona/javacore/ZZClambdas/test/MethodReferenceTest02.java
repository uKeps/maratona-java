package maratona.javacore.ZZClambdas.test;

import maratona.javacore.ZZClambdas.domain.Anime;
import maratona.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
        public static void main(String[] args) {
            AnimeComparators aC = new AnimeComparators();
            List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 1300), new Anime("Naruto", 500)));
            animeList.sort(aC::compareByEpisodesNonStatic);
            System.out.println(animeList);
        }
}
