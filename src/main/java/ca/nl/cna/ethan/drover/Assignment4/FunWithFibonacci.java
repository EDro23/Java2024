package ca.nl.cna.ethan.drover.Assignment4;

import java.util.Scanner;

/**
 * A class for having fun with Fibonacci calculator
 * @author Ethan.Drover
 */
public class FunWithFibonacci {

    /**
     * A method for playing around with fibonacci numbers
     * @param args args param
     */
    public static void main(String[] args) {
        System.out.println("Fun with Fibonacci!\n");

        Scanner input = new Scanner(System.in);
        FibonacciCalculator FibonacciCalculator = new FibonacciCalculator();

        String choice = "";

        do {
            printMenu();
            choice = input.next();

            if (choice.equals("A")) {
                System.out.print("Enter a number: ");
                int limit = input.nextInt();
                System.out.println("Fibonacci numbers up to " + limit + ":");
                int index = 0;
                int fibonacciNumber = FibonacciCalculator.getFibonacciNumber(index);

                while (fibonacciNumber <= limit) {
                    System.out.print(fibonacciNumber + " ");
                    index++;
                    fibonacciNumber = FibonacciCalculator.getFibonacciNumber(index);
                }
                System.out.println();
            } else if (choice.equals("B")) {
                System.out.print("How many Fibonacci numbers to print? ");
                int count = input.nextInt();
                System.out.printf("The first %d Fibonacci numbers:",count);
                for (int i = 0; i < count; i++) {
                    System.out.print(FibonacciCalculator.getFibonacciNumber(i) + " ");
                }
                System.out.println();
            } else if (choice.equals("C")) {
                System.out.print("Enter a number to check if it's a Fibonacci number: ");
                int number = input.nextInt();
                if (FibonacciCalculator.isFibonacciNumber(number)) {
                    System.out.printf("\n%d is a Fibonacci number.", number, number);
                } else {
                    System.out.printf("\n%d is not a Fibonacci number.", number, number);
                }
            } else {
                if (!choice.equals("Q")) {
                    System.out.println("Not a valid choice, Try again!");
                    System.out.printf("Choice: %s",choice);
                }
            }
        } while (!choice.equals("Q"));

        input.close();
    }

    /**
     * Method for printing the menu
     */
    private static void printMenu() {
        System.out.println("\nMenu");
        System.out.println("A: Print Fibonacci numbers up to a certain number");
        System.out.println("B: Print the first X Fibonacci numbers");
        System.out.println("C: Check if a number is a Fibonacci number");
        System.out.println("Q: Quit");
    }
}
