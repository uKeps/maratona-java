package maratona.javacore.Xserializacao.domain;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 7726002264881967011L;
    private Long id;
    private String name;
    private transient String password;
    private static final String NAME_SCHOOL = "Gremio";
    private transient Classes classes1;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(classes1.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String className = ois.readUTF();
            classes1 = new Classes(className);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", NAME_SCHOOL='" + NAME_SCHOOL + '\'' +
                ", Class='" + classes1 + '\'' +
                '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Classes getClasses1() {
        return classes1;
    }

    public void setClasses1(Classes classes1) {
        this.classes1 = classes1;
    }
}
