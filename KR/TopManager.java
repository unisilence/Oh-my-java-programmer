package KR;

public class TopManager extends Employee{

    private double company_inc;

    public TopManager(double salary, company employer) {
        super(salary);
        this.company_inc = employer.getIncome();
        double plus = 0;
        if (company_inc > 10000000){ plus = 1.5 * this.salary;}
        this.salary = salary + plus;
    }
}
