/**
 * A simple class for creating an employee object.
 */
package ca.nl.cna.ethan.drover.Assignment2;

import java.util.Scanner;

/**
 * A simple class for creating an employee object
 * @author Ethan.Drover
 */
public class Employee {

    private String firstname;
    private String lastName;
    private double employeeSalary;

    public Employee(String firstName, String lastName, double employeeSalary) {
        this.firstname = firstName;
        this.lastName = lastName;
        this.employeeSalary = employeeSalary;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public double getEmployeeSalary() {

        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
            this.employeeSalary = employeeSalary;

    }
    public void giveRaise(double percent) {
        if (percent >0) {
            this.employeeSalary = this.employeeSalary * (1 + percent);
        }

    }

}
