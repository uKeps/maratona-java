package maratona.javacore.ZZKjunit.service;

import maratona.javacore.ZZKjunit.domain.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public boolean isAdult(Person person) {
        //Objects.requireNonNull(person, "Person cannot be null");
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemovingNotAdults(List<Person> people) {
        return people.stream()
                .filter(this::isAdult)
                .collect(Collectors.toList());
    }
}
