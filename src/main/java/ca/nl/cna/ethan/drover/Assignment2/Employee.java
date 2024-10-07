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
    private Double employeeSalary;

    public Employee(String firstName, String lastName, Double employeeSalary) {
        firstname = firstName;
        lastName = lastName;
        employeeSalary = employeeSalary;
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

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        if (employeeSalary < 0) {
            employeeSalary = 0.0;
        } else
        {
            this.employeeSalary = employeeSalary;
        }
    }
}
