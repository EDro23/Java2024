package ca.nl.cna.ethan.drover.Test01;

/**
 * Course class to create the course object
 * This includes Name, Number and Credits
 * @author Ethan.Drover
 */
public class Course {

    private String Name;
    private String Number;
    private Integer Credits;

    /**
     * Course constructor with multiple params
     * @param name Takes in a name of a student
     * @param number Takes in the course number
     * @param credits Takes the credits for the course number
     */
    public Course(String name, String number, Integer credits) {
        Name = name;
        Number = number;
        Credits = credits;
    }

    /**
     * Get the student name
     * @return Returns the student name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set a students name
     * @param name Takes on param of student
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Get  the course number
     * @return Returns the course number
     */
    public String getNumber() {
        return Number;
    }

    /**
     * Set the course number
     * @param number Takes one param of number
     */
    public void setNumber(String number) {
        Number = number;
    }

    /**
     * Get the credits
     * @return Return the number of credits
     */
    public Integer getCredits() {
        return Credits;
    }

    /**
     * Set the amount of credits
     * @param credits Takes in one param, Credits
     */
    public void setCredits(Integer credits) {
        if (credits > 0) {
           Credits = credits;
        }
    }
}
