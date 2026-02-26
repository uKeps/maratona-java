package maratona.javacore.BIntroducaoMethods.Test;

import maratona.javacore.BIntroducaoMethods.Domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Neymar Jr");
        employee.setAge(27);
        employee.setSalary(new double[] {2005.2, 3000.40, 1955.20});

        employee.printerEmployee();
        System.out.println("Average Salary: " + employee.getAverage());
    }
}
