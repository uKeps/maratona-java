package maratona.javacore.Lclasseabstratas.test;

import maratona.javacore.Lclasseabstratas.domain.Dev;
import maratona.javacore.Lclasseabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Dev dev = new Dev("Toguro", 12000);
        System.out.println(manager);
        System.out.println(dev);
        manager.print();
        dev.print();
    }
}
