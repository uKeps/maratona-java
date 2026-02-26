package maratona.javacore.BIntroducaoMethods.Test;

import maratona.javacore.BIntroducaoMethods.Domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.name = Djonga
        //person.age = 30;
        person.setName("Djonga");
        person.setAge(30);
        person.printerPerson();
        //System.out.println(person.getName());
        //System.out.println(person.getAge());
    }
}
