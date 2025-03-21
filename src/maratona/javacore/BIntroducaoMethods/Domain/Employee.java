package maratona.javacore.BIntroducaoMethods.Domain;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double average;

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

        for (double num : salary) {
                average += num;

        }
        average /= salary.length;
        System.out.println("\nAverage Salary:  " + average);
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
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

    public double getAverage() {
        return average;
    }
}
