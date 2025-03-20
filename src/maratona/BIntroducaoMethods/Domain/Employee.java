package maratona.BIntroducaoMethods.Domain;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void printerEmployee() {
        System.out.println("----------------");
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary == null) {
            return;
        }
        for (double num : salary) {
                System.out.print(num + " ");
        }

        //System.out.println(Arrays.toString(this.salary));
        averageSalary();
}


    public void averageSalary() {
        if (salary == null) {
            return;
        }
        double sum = 0;
        for (double num : salary) {
                sum += num;

        }
        //sum /= salary.length;
        System.out.println("\nAverage Salary:  " + sum);
    }
}
