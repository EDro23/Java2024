package ca.nl.cna.ethan.drover.Assignment2;

/**
 * A simple class for creating an employee object
 * @author Ethan.Drover
 */
public class Employee {

    private String firstname;
    private String lastName;
    private double salary;

    /**
     * Employee class that takes the following params
     * @param firstName First name of employee
     * @param lastName Last name of employee
     * @param salary Employee salary
     */
    public Employee(String firstName, String lastName, double salary) {
        this.firstname = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     * Gets the first name
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Set the first name
     * @param firstname firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Get the last name.
     * @return lastname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name
     * @param lastName lastname
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get employee salary
     * @return employeeSalary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set employee salary
     * @param salary employeeSalary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Gives a raise to salary of certain percent, Takes employee salary, multiplies by 1 + percent given.
     * @param percent given percent
     */
    public void giveRaise(double percent) {
        if (percent >0) {
            this.salary = this.salary * (1 + percent);
        }

    }

}
