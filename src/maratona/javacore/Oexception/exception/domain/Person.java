package maratona.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Person {
    public void save() throws LoginInvalidException, IOException {
        System.out.println("Saving person");
    }
}
