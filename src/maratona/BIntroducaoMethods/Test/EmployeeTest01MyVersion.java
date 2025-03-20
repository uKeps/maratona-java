package maratona.BIntroducaoMethods.Test;

import maratona.BIntroducaoMethods.Domain.EmployeeMyVersion;

public class EmployeeTest01MyVersion {
    public static void main(String... args) {
         EmployeeMyVersion employeeMyVersion = new EmployeeMyVersion();
         employeeMyVersion.name = "Cleopatra";
         employeeMyVersion.age = 69;
         //employeeMyVersion.salary = new double[] {2005.2, 3000.40, 1955.20};

            employeeMyVersion.printerEmployee();
            //employeeMyVersion.averageSalary(2000, 3000, 1955);
    }
}
