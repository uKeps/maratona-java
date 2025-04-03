package maratona.javacore.Lclasseabstratas.domain;

public class Dev extends Employee{
    public Dev(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
