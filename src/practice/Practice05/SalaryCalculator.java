package practice.Practice05;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        // Create 1 CEO, 1 Manager, 2 Employees
        CEO ceo = new CEO();
        Manager manager = new Manager();
        NormalEmployees employees1 = new NormalEmployees();
        NormalEmployees employees2 = new NormalEmployees();

        salaryCalculator.totalMonthlyBudget(Arrays.asList(ceo, manager, employees1, employees2));
    }

    public void totalMonthlyBudget(List<CompanyEmployees> companyEmployees) {
        double totalSalary = 0.0;
        for (CompanyEmployees individualSalary : companyEmployees) {
            totalSalary += individualSalary.getSalary();
        }
        System.out.printf("Total Monthly Budget is: %f", totalSalary);
    }
}
