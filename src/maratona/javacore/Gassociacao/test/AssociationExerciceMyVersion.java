package maratona.javacore.Gassociacao.test;

import maratona.javacore.Gassociacao.domain.Location;
import maratona.javacore.Gassociacao.domain.Seminary;
import maratona.javacore.Gassociacao.domain.Student;
import maratona.javacore.Gassociacao.domain.Teacher;

public class AssociationExerciceMyVersion {
    public static void main(String[] args) {
        Student student = new Student("Carlos", 12);
        Student student2 = new Student("Erik", 69);
        Student[] students = {student, student2};
        Location location = new Location("Rua tal");
        Teacher teacher = new Teacher("clarencio teacher","TI");
        Seminary seminary = new Seminary(location, "vasco", students, teacher);
        Seminary seminary2 = new Seminary(location, "gremio", students, teacher);
        Seminary[] seminaries = {seminary, seminary2};
        teacher.setSeminary(seminaries);

        seminary.print();
    }
}
