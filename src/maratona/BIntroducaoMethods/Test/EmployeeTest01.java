package maratona.BIntroducaoMethods.Test;

import maratona.BIntroducaoMethods.Domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Cleopatra";
        employee.age = 69;
        //employee.salary = new double[] {2005.2, 3000.40, 1955.20};

        employee.printerEmployee();
        //employee.averageSalary();
    }
}
