package KR;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        company E_corp = new company(15000000);
        int ops = 0;
        int mans = 0;
        int topmans = 0;
        for (int i = 0; i < 271; i++){
            int a = (int) (Math.random() * 101);
            if (a < 5 && topmans < 10) {
                TopManager emp = new TopManager((Math.random() * (2500000) + 500000), E_corp);
                E_corp.hire(emp);
                topmans = topmans + 1;
            } else if (a < 36 && mans < 80) {
                Manager emp = new Manager((Math.random() * (120001) + 80000));
                E_corp.hire((Employee) emp);
                mans = mans + 1;
            } else {
                if (ops < 180) {
                    Operator emp = new Operator((Math.random() * (70001) + 50000));
                    E_corp.hire(emp);
                    ops = ops + 1;
                } else if (mans < 80){
                    Manager emp = new Manager((Math.random() * (120001) + 800000));
                    E_corp.hire(emp);
                    mans = mans + 1;
                } else {
                    TopManager emp = new TopManager((Math.random() * (2900000) + 500000), E_corp);
                    E_corp.hire(emp);
                    topmans = topmans + 1;
                }
            }
        }

        ArrayList s = E_corp.getAll();

        ArrayList top = E_corp.getTopSalaryStaff((int) (Math.random() * 6 + 10));
        System.out.println("Top for the first time: ");
        for (int i=0; i < top.size(); i++){
            System.out.println(((Employee) top.get(i)).getMonthSalary() + " руб.");
        }

        System.out.println("Low for the first time: ");
        ArrayList low = E_corp.getLowestSalaryStaff(30);
        for (int i=0; i < low.size(); i++){
            System.out.println(((Employee) low.get(i)).getMonthSalary() + " руб.");
        }

        for (int i=0; i<136; i++){
            E_corp.fire((Employee) s.get(i));
        }

        System.out.println("Top for the second time: ");
        top = E_corp.getTopSalaryStaff((int) (Math.random() * 6 + 10));
        for (int i=0; i < top.size(); i++){
            System.out.println(((Employee) top.get(i)).getMonthSalary() + " руб.");
        }

        System.out.println("Low for the second time: ");
        low = E_corp.getLowestSalaryStaff(30);
        for (int i=0; i < low.size(); i++){
            System.out.println(((Employee) low.get(i)).getMonthSalary() + " руб.");
        }
    }
}