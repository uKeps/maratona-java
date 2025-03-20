package maratona.BIntroducaoMethods.Domain;

public class PrinterStudent {
    public void print(Student student){
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        student.name = "ChangedStudent";
    }
}
