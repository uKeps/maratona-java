package maratona.javacore.Xserializacao.test;

import maratona.javacore.Xserializacao.domain.Classes;
import maratona.javacore.Xserializacao.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L,"Erik", "123");
        Classes classs = new Classes("Vasco");
        student.setClasses1(classs);
        serializar(student);
        deserializar();
    }
    private static void serializar(Student student){
        Path path = Paths.get("folder_renamed/aluno.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(student);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void deserializar(){
        Path path = Paths.get("folder_renamed/aluno.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
