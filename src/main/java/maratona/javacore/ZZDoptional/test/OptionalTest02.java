package maratona.javacore.ZZDoptional.test;

import maratona.javacore.ZZDoptional.domain.Manga;
import maratona.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Jujutsu");
        mangaByTitle.ifPresent(m -> m.setTitle("Jujutsu Kaisen"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Boku no pico").orElseGet(() -> new Manga(3, "Boku no pico", 20));
        System.out.println(newManga);

    }
}
