package maratona.javacore.Gassociacao.domain;

import java.util.Arrays;

public class Teacher {
    private Seminary[] seminary;
    private String name;
    private String specialty;

    public Teacher(String name, Seminary[] seminary, String specialty) {
        this.name = name;
        this.seminary = seminary;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "seminary=" + Arrays.toString(seminary) +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public Seminary[] getSeminary() {
        return seminary;
    }

    public void setSeminary(Seminary[] seminary) {
        this.seminary = seminary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
