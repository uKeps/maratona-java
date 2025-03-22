package maratona.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // 1 - Alocado espaço na memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Inside initializer block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length ; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : episodes){
            System.out.print(episode + " ");
        }
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
