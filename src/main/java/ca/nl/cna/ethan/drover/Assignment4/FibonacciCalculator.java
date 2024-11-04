package ca.nl.cna.ethan.drover.Assignment4;

/**
 * A class for representing and using a fibonacci calculator
 * @author Ethan.Drover 
 */
public class FibonacciCalculator {

    /**
     * A method for determining if a number is a fibonacci number
     * @param number number passed in by user
     * @return return if the number passed in is a fibonacci number
     */
    public boolean isFibonacciNumber(int number) {
        if (number < 0) {
            return false;
        }
        int expression1 = 5 * number * number + 4;
        int expression2 = 5 * number * number - 4;
        return (Math.sqrt(expression1) % 1 == 0) || (Math.sqrt(expression2) % 1 == 0);
    }

    /**
     * 
     * @param number number passed in from the user
     * @return Returns the nth Fibonacci number
     */
    public int getFibonacciNumber(int number) {
        if (number < 0) {
            return -1;
        }
        // Base cases
        if (number == 0) {
            return 0;
        };
        if (number == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= number; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    /**
     * Print Fibonacci numbers up to a certain limit (no print statements in this class)
     * @param limit Takes the param limit, as max number to go up to
     * @param calculator calculator
     */
    public static void printFibonacciUpTo(int limit, FibonacciCalculator calculator) {
        int index = 0;
        int fibonacciNumber = calculator.getFibonacciNumber(index);

        while (fibonacciNumber <= limit) {
            System.out.print(fibonacciNumber + " ");
            index++;
            fibonacciNumber = calculator.getFibonacciNumber(index); // Get the next Fibonacci number
        }
    }

    /**
     * Print the first X Fibonacci numbers
     * @param count count param takes in the first number and prints fibonacci numbers up to that number starting at 0.
     * @param calculator calculator param
     */
    public static void printFirstXFibonacci(int count, FibonacciCalculator calculator) {
        for (int i = 0; i < count; i++) {
            System.out.print(calculator.getFibonacciNumber(i) + " ");
        }
    }
}
