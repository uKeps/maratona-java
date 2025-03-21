package maratona.javacore.BIntroducaoMethods.Domain;

public class EmployeeMyVersion {
    public String name;
    public int age;
    public double[] salary;

    public void printerEmployee(double... salary){
        System.out.println("----------------");
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary.length == 0){
            System.out.println("No salary informed");
            return;
        }
        //System.out.println(Arrays.toString(this.salary));
        for(double num : salary){
            System.out.print(num + " ");
        }
        averageSalary(salary);
    }

    public void averageSalary(double... salary){
        if (salary.length == 0){
            System.out.println("No salary informed");
            return;
        }
        double sum = 0;
        for(double num : salary) {
            sum += num;
        }
        sum /= salary.length;
        System.out.println("\nAverage Salary:  "+sum);
    }
}
