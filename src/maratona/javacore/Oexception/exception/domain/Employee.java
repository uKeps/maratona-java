package maratona.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person{
    public void save() throws LoginInvalidException, FileNotFoundException {
        System.out.println("Saving Employee");
    }
}
