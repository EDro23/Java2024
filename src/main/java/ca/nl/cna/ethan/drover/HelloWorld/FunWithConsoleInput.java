package ca.nl.cna.ethan.drover.HelloWorld;

import java.util.Scanner;

/**
 * A Simple application for the Scanner
 *
 * @author Ethan.Drover
 */

public class FunWithConsoleInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter another number: ");
        int y = input.nextInt();

        int sum = x + y;

        System.out.printf("\nValue input: %d", sum);

        System.out.printf("\nThe sum of %d + %d = %d\n", x, y, sum);
    }
}
