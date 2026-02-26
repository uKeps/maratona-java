package maratona.javacore.Ycolecoes.test;

import maratona.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC","iPhone");
        Smartphone s2 = new Smartphone("1ABC","Samsung");
        // vai retornar true pq so ta comparando o serualNumber
        System.out.println(s1.equals(s2));
    }
}
