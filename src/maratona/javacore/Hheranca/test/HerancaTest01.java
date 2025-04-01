package maratona.javacore.Hheranca.test;

import maratona.javacore.Hheranca.dominio.Address;
import maratona.javacore.Hheranca.dominio.Employee;
import maratona.javacore.Hheranca.dominio.Person;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setRoad("Road 3");
        address.setCep("12320-020");
        Person person = new Person("Sung jhin Woo");
        person.setCpf("401204401");
        person.setAdress(address);
        person.print();
        System.out.println("----------------");
        Employee employee = new Employee("Naruto");
        employee.setCpf("418923412");
        employee.setAdress(address);
        employee.setSalary(20000);
        employee.print();
    }
}
