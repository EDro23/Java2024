package ca.nl.cna.ethan.drover.Test01;

import ca.nl.cna.ethan.drover.Test01.Course;

/**
 * CP2280 Midterm
 *
 * Application for making sure your Course class is built according to the instructions
 *
 * Note: if this class doesn't find your Course class then you may want to create a new
 * version of this class inside your project and copy paste all this text in to ensure you are in the
 * right project.
 *
 */
public class FunWithCourses {

    public static void main(String[] args) {
        System.out.println("Fun with Courses on a Midterm! Yay!");

        //TODO you need to create a Course class. Make sure it's in the same project and default package

        //Create a simple course
        Course course = new Course("Java 1", "CP2280", 4);

        //Print out a course's information
        printCourseInfo(course);

        //TODO consider writing more tests to make sure you met all the requiremints

    }

    public static void printCourseInfo(Course course){
        System.out.printf("Course name: %s, number: %s, credit total: %d", course.getName(), course.getNumber(), course.getCredits());
    }


}
