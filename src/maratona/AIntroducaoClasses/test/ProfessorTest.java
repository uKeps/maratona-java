package maratona.AIntroducaoClasses.test;

import maratona.AIntroducaoClasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "William";
        professor.age = 33;
        professor.sex = 'M';
        System.out.println(professor.name + " " + professor.age + " " + professor.sex);
    }
}
