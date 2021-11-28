package KR;

public class Employee {

    public double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public int getMonthSalary() {
        return (int) this.salary;
    }
}
