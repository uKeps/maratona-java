package maratona.javacore.Gassociacao.domain;

public class Seminary {
    private Location location;
    private String title;
    private Student[] student;
    private Teacher teacher;

    public Seminary(Location location, String title, Student[] student, Teacher teacher) {
        this.location = location;
        this.title = title;
        this.student = student;
        this.teacher = teacher;
    }

    public void print(){
        System.out.println("------STUDENTS--------- " + "Seminary: " + this.title);
        if (student == null)
            return;
        for (Student student1 : student){
            System.out.println(student1.getName() + " Age: "+student1.getAge());
        }
        System.out.println("-------------Addres------------ ");
        if(location == null){
            System.out.println("location is dead :/");;
        }else {
            System.out.println(location.getAddres());
        }
        System.out.println("---------------teacher------------- ");
        if(teacher == null){
            System.out.println("teacher is high on the fight club :)");
        }else {
            System.out.println(teacher.getName());
        }
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Seminary{" +
                "title='" + title + '\'' +
                ", location=" + location +
                '}';
    }
}
