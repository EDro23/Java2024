package ca.nl.cna.ethan.drover.Assignment4;

public class FibonacciCalculator {

    // Check if a number is a Fibonacci number
    public boolean isFibonacciNumber(int number) {
        if (number < 0) {
            return false; // Negative numbers are not Fibonacci numbers
        }

        // Calculate the two expressions
        int expression1 = 5 * number * number + 4;
        int expression2 = 5 * number * number - 4;

        // Check for perfect squares
        return (Math.sqrt(expression1) % 1 == 0) || (Math.sqrt(expression2) % 1 == 0);
    }

    // Get the Fibonacci number at a specific index n
    public int getFibonacciNumber(int n) {
        if (n < 0) {
            return -1; // Return -1 for negative indices
        }

        // Base cases
        if (n == 0) return 0; // 0th Fibonacci number
        if (n == 1) return 1; // 1st Fibonacci number

        // Iterative calculation for Fibonacci numbers
        int a = 0, b = 1; // Starting values
        for (int i = 2; i <= n; i++) {
            int c = a + b; // Calculate the next Fibonacci number
            a = b; // Move forward in the sequence
            b = c; // Update to the new Fibonacci number
        }
        return b; // Return the nth Fibonacci number
    }

    // Print Fibonacci numbers up to a certain limit (no print statements in this class)
    public static void printFibonacciUpTo(int limit, FibonacciCalculator calculator) {
        int index = 0;
        int fibNumber = calculator.getFibonacciNumber(index);

        while (fibNumber <= limit) {
            System.out.print(fibNumber + " ");
            index++;
            fibNumber = calculator.getFibonacciNumber(index); // Get the next Fibonacci number
        }
    }

    // Print the first X Fibonacci numbers (no print statements in this class)
    public static void printFirstXFibonacci(int count, FibonacciCalculator calculator) {
        for (int i = 0; i < count; i++) {
            System.out.print(calculator.getFibonacciNumber(i) + " ");
        }
    }
}
