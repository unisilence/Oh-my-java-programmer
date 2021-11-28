package KR;

import java.util.ArrayList;
import java.util.List;

public class company {

    private ArrayList s;
    private double income;

    public company(double inc){
        this.s = new ArrayList();
        this.income = inc;
    }

    public void hire(Employee employee) {
        this.s.add(employee);
    }

    public void hireAll(ArrayList args) { s.addAll(args); }

    public void fire(Employee employee) { s.remove(employee); }

    public double getIncome() { return income; }
    //s.add(50); // добавляем значение
//        s.size // длина списка
//        s.set(number, value) - value on number
//        Object o = anything;
//        s.remove(value); // если value число, удаляет по индексу, если нет или есть переменная типа object - удаляет объект
//        s.get(number) - получить значение

    public ArrayList getAll() { return s; }

    public ArrayList getTopSalaryStaff(int count) {
        ArrayList s1 = new ArrayList();
        for (int i=0; i<s.size(); i++){
            s1.add(s.get(i));
            int x = s1.size() - 1;
            while (x != 0 && x != -1 && ((Employee) s1.get(x)).getMonthSalary() > ((Employee) s1.get(x - 1)).getMonthSalary()) {
                Employee within = (Employee) s1.get(x - 1);
                s1.set(x - 1, s1.get(x));
                s1.set(x, within);
                x = x - 1;
            }
        }
        ArrayList s2 = new ArrayList();
        for (int i=0; i<count; i++){
            s2.add(s1.get(i));
        }
        return s2;
    }

    public ArrayList getLowestSalaryStaff(int count) {
        ArrayList s1 = new ArrayList();
        for (int i=0; i<s.size(); i++){
            s1.add(s.get(i));
            int x = s1.size() - 1;
            while (x != 0 && x != -1 && ((Employee) s1.get(x)).getMonthSalary() < ((Employee) s1.get(x - 1)).getMonthSalary()) {
                Employee within = (Employee) s1.get(x - 1);
                s1.set(x - 1, s1.get(x));
                s1.set(x, within);
                x = x - 1;
            }
        }
        ArrayList s2 = new ArrayList();
        for (int i=0; i<count; i++){
            s2.add(s1.get(i));
        }
        return s2;
    }
}
