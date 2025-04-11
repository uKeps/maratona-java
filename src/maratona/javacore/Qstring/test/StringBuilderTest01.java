package maratona.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Erik Piassini";
        name.concat(" DaleGremio");
        name.substring(0,4);
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Erik Piassini");
        sb.append(" DaleGremio").append(" e vasco");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
