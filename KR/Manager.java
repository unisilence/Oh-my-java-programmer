package KR;

public class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
        double plus = 0.05 * (Math.random() * (25001) + 115000);
        this.salary = salary + plus;
    }


}
