package maratona.javacore.BIntroducaoMethods.Test;

import maratona.javacore.BIntroducaoMethods.Domain.PrinterStudent;
import maratona.javacore.BIntroducaoMethods.Domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrinterStudent printer = new PrinterStudent();

        student01.name = "John";
        student01.age = 18;
        student01.gender = 'M';

        student02.name = "Sarah";
        student02.age = 19;
        student02.gender = 'F';

        printer.print(student01);

        printer.print(student02);
    }
}
