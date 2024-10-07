package ca.nl.cna.ethan.drover.Assignment2;

import java.util.Scanner;

/**
 * Class for having fun with employees.
 * A test application for employee class that prints out employee first name, last name and salary after the raise.
 * Also prints average of the salary of 3 employees.
 */
public class FunWithEmployees {

    public static void main(String[] args) {
        System.out.println("Fun with Employees!");
        Scanner input = new Scanner(System.in);

        double salaryTotal = 0;
        int employeeCount = 0;
        int NUM_EMPLOYEES = 3;

        while (employeeCount < NUM_EMPLOYEES) {
            System.out.println("\nEnter your first name: ");
            String firstName = input.next();

            System.out.println("Enter your last name: ");
            String lastName = input.next();

            System.out.println("Enter employee salary: ");
            double employeeSalary = input.nextDouble();

            Employee employee = new Employee(firstName, lastName, employeeSalary);
            employee.giveRaise(0.08); // Calling the function to give the employee the raise.

            System.out.printf("\nName: %s, %s Salary: $%.2f", employee.getFirstname(), employee.getLastName(), employee.getEmployeeSalary());

            salaryTotal += employee.getEmployeeSalary(); // Adding employee salary to total salary.
            employeeCount ++; // Updating the employee count by 1.
        }
        System.out.printf("\nThe average salary for all %d employees is: $%.2f",employeeCount, salaryTotal / NUM_EMPLOYEES);
    }
}
