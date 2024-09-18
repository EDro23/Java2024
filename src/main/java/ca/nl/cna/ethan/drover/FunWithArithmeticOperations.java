package ca.nl.cna.ethan.drover;

import java.util.Scanner;

/**
 * Having fun with arithmetic operations
 *
 * @author Ethan.Drover
 */
public class FunWithArithmeticOperations {

    public static void main(String[] args) {
        System.out.println("Fun With Arithmetic Operations! :)");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter a second number: ");

        int y = input.nextInt();

        int sum = x + y;

        System.out.printf("\nValue input: %d", sum);

        // Addition
        System.out.println("\n\nAddition!");
        System.out.printf("The sum of %d + %d = %d\n", x, y, x+y);

        // Subtraction
        System.out.println("\nSubtraction!");
        System.out.printf("The sum of %d - %d = %d\n", x, y, x-y);

        // Division
        System.out.println("\nDivison!");
        System.out.printf("The sum of %d / %d = %d\n", x, y, x/y);

        // Multiplication
        System.out.println("\nMultiplication!");
        System.out.printf("The sum of %d * %d = %d\n", x, y, x*y);

        // Remainder
        System.out.println("\nRemainder!");
        System.out.printf("The sum of %d %% %d = %d\n", x, y, x%y);

    }
}
