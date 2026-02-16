package maratona.javacore.ZZEstreams.test;

import maratona.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 9.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Full Metal", 5.99),
            new LightNovel("Boku no pico", 1.69),
            new LightNovel("Overflow", 6.969)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = lightNovels.stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);
    }
}
