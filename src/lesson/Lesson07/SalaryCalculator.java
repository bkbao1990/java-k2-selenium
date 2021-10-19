package lesson.Lesson07;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
    public static double getSalaries(List<Employee> employees){
        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries = totalSalaries + employee.getSalary() + employee.getSupportMoney();
        }
        return  totalSalaries;
    }

    public static void main (String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee ceo = new CEO();
        Employee manager = new Manager();
        Employee standardEmployee = new StandardEmployee();
        standardEmployee = new Manager();
        employees.add(ceo);
        employees.add(manager);
        employees.add(standardEmployee);

        double totalSalaries = SalaryCalculator.getSalaries(employees);
        System.out.println(totalSalaries);
    }
}
