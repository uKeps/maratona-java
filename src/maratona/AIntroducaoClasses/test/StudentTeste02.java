package maratona.AIntroducaoClasses.test;

import maratona.AIntroducaoClasses.domain.Student;

public class StudentTeste02 {
    public static void main(String[] args) {
       Student student = new Student();
       Student student2 = new Student();
       student.name = "vasco";

        System.out.println(student.sex);
        System.out.println(student.age);
        System.out.println(student.name);

        System.out.println(student2.sex);
        System.out.println(student2.age);
        System.out.println(student2.name);
    }
}
