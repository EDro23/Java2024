package ca.nl.cna.ethan.drover.Objects;

import java.util.Scanner;

/**
 * Fun with Students class to create a student object
 */
public class FunWithStudents {

    public static void main(String[] args) {
        System.out.println("Fun with Students");

        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter Students first name: ");
        String firstName = input.nextLine();
        student.setFirstName(firstName);

        System.out.println("Enter Students last name: ");
        String lastName = input.nextLine();
        student.setLastName(lastName);

        System.out.printf("Students name: %s %s",
                student.getFirstName(),
                student.getLastName());

    }
}
