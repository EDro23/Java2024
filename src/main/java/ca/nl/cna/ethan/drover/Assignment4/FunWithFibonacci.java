package ca.nl.cna.ethan.drover.Assignment4;

import java.util.Scanner;

/**
 * Class for having fun with Fibonacci calculator
 * @author Ethan.Drover
 */
public class FunWithFibonacci {

    public static void main(String[] args) {
        System.out.println("Fun with Fibonacci!\n");

        Scanner input = new Scanner(System.in);

        String choice = "";

        do {
            printMenu();
            choice = input.next();

            if (choice.equals("A")) {
                //TODO Method for printing fibonacci numbers up to a certain number
                System.out.println("Echo A");
            } else if (choice.equals("B")) {
                //TODO Method for printing the first X amount of fibonacci numbers from 0 to a specific number
                System.out.println("Echo B");
            } else if (choice.equals("C")) {
                //TODO Method for checking if the inputted number is a fibonacci number
                System.out.println("Echo C");
            } else {
                if (!choice.equals("Q")) {
                    System.out.println("Not a valid choice, Try again!");
                    System.out.printf("Choice: " + choice);
                }
            }
        } while (!choice.equals("Q"));
    }

    private static void printMenu() {
        System.out.println("Menu");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("Q to quit");
    }
}
