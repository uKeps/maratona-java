package maratona.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - Bloco de inicialização estatico é executado quando a JVM carregar a classe
    // 1 - Alocado espaço na memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Inside initializer block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length ; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside initializer block1");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes){
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
