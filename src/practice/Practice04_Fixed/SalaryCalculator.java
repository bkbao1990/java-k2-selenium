package practice.Practice04_Fixed;

import java.util.ArrayList;
import java.util.List;


public class SalaryCalculator {
    public static void main(String[] args) {
        // Create 1 CEO 1 Manager 2 Employee
        CEO ceo = new CEO(1001);

        Manager manager = new Manager();
        manager.setSalary(1001);

        NormalEmployee employee1 = new NormalEmployee();
        employee1.setSalary(12);

        NormalEmployee employee2 = new NormalEmployee();
        employee2.setSalary(12);

        List<NormalEmployee> normalEmployees = new ArrayList<>();
        normalEmployees.add(employee1);
        normalEmployees.add(employee2);

        double totalSalaries = ceo.getSalary() + manager.getSalary();

        employee1.setSalary(13);

        for (NormalEmployee emp : normalEmployees) {
            totalSalaries += emp.getSalary();
        }
        System.out.printf("total %f", totalSalaries);

    }
}
