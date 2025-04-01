package maratona.javacore.Hheranca.dominio;

public class Employee extends Person {
    private double salary;
    static {
        System.out.println("inside the static employee");
    }
    {
        System.out.println("inside the initialization employee");
    }
    {
        System.out.println("inside the initialization employee2");
    }

    public Employee(String name){
        super(name);
        System.out.println("Inside the employee's constructor");
    }

    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public void paymentReport(){
        System.out.println("I " + this.name + "received a salary of" + this.salary );
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
