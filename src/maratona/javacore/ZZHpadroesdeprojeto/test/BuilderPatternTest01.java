package maratona.javacore.ZZHpadroesdeprojeto.test;

import maratona.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Erik")
                .lastName("Santos")
                .email("K@G")
                .build();
        System.out.println(build);
    }
}
