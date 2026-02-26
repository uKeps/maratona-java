package maratona.javacore.Gassociacao.domain;

public class Student {
    private Seminary seminary;
    private String name;
    private int age;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Student(Seminary seminary, String name, int age) {
        this.seminary = seminary;
        this.name = name;
        this.age = age;
    }

    public Seminary getSeminary() {
        return seminary;
    }

    public void setSeminary(Seminary seminary) {
        this.seminary = seminary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
