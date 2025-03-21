package maratona.javacore.AIntroducaoClasses.test;

import maratona.javacore.AIntroducaoClasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "James";
        student.age = 30;
        student.sex = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student);
    }
}
