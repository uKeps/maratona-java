package maratona.javacore.ZZEstreams.test;

import maratona.javacore.ZZEstreams.domain.Category;
import maratona.javacore.ZZEstreams.domain.LightNovel;
import maratona.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static maratona.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static maratona.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 9.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Full Metal", 5.99,Category.FANTASY),
            new LightNovel("Boku no pico", 1.69,Category.ROMANCE),
            new LightNovel("Overflow", 6.969,Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);


        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
