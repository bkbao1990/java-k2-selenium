package Practice04;

import javax.swing.*;
import java.util.*;


public class SalaryCalculator {
    public static void main(String[] args) {
        // Create 1 CEO 1 Manager 2 Employee
        CEO ceo = new CEO();
        Manager manager = new Manager();
        NormalEmployee employee1 = new NormalEmployee();
        NormalEmployee employee2 = new NormalEmployee();
        //set up CEO data
        ceo.setName(JOptionPane.showInputDialog("Input Ceo Name: "));
        ceo.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Input " + ceo.getName() + " Salary: ")));
        //set up Manager data
        manager.setName(JOptionPane.showInputDialog("Input Manager Name: "));
        manager.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Input " + manager.getName() + " Salary: ")));
        //set up Employee1 data
        employee1.setName(JOptionPane.showInputDialog("Input Employee1 Name: "));
        employee1.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Input " + employee1.getName() + " Salary: ")));
        //set up Employee2 data
        employee2.setName(JOptionPane.showInputDialog("Input Employee2 Name: "));
        employee2.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Input " + employee2.getName() + " Salary: ")));

        //Set up Main Data
        Map<String,Double> companyEmployees = new HashMap<>();
        companyEmployees.put(ceo.getName(),ceo.getSalary());
        companyEmployees.put(manager.getName(),manager.getSalary());
        companyEmployees.put(employee1.getName(),employee1.getSalary());
        companyEmployees.put(employee2.getName(),employee2.getSalary());

        for(Double key : companyEmployees.values()){
            System.out.println(key);
        }
        // Get monthly salary -> Total
        double monthlyBudget = ceo.getSalary() + manager.getSalary() + employee1.getSalary() + employee2.getSalary();
        JOptionPane.showMessageDialog(null, "The total salary that the company must pay monthly is: " + monthlyBudget + " $");
    }
}
