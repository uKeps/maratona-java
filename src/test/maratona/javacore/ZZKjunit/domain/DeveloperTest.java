package maratona.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {


    @Test
    public void instanceOf_ExecuteChildClassMethods_WhenObjectIsOfChildType() {
        Employee employeeDeveloper = new Developer("1", "Java");
        if (employeeDeveloper instanceof Developer) {
            Developer developer = (Developer) employeeDeveloper;
            assertEquals("Java", developer.getMainLanguage());
        }
        if(employeeDeveloper instanceof Developer developer){
            assertEquals("Java", developer.getMainLanguage());
        }
    }
}
