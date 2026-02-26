package maratona.javacore.Oexception.exception.test;

import maratona.javacore.Oexception.exception.domain.Employee;
import maratona.javacore.Oexception.exception.domain.LoginInvalidException;
import maratona.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverwrittenWithExceptionTetst01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
