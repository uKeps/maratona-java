package maratona.Introducao.EstRepeticao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
        }

        do {
            count++;
            System.out.println(count);
        }while (count < 10);

        for(int i=0; i < 10; i++){
            System.out.println("for: " + i);
        }
    }
}
