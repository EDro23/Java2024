package ca.nl.cna.ethan.drover.Assignment5;

/**
 * Prime number calculator class
 * Includes 2 methods, one to determine if a number is prime and another to get the unique prime factorization
 */
public class PrimeNumberCalculator {

    /**
     * Determines whether an integer is prime
     *
     * @param number the number that is being checked
     * @return true if number is prime, false if not prime
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determines the unique prime factorization of a given integer and returns it as a formatted string.
     * The method takes an integer input, finds its prime factors, and returns a string representation
     * of the factors separated by " x ".
     *
     * @param number the integer to be factorized
     * @return a string representing the unique prime factorization of the input number
     *         or the number itself if it is less than or equal to 1
     */
    public static String getUniquePrimeFactorization(int number) {
        if (number <= 1) {
            return String.valueOf(number);
        }

        String result = "";
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                while (number % i == 0) {
                    if (result.isEmpty()) {
                        result += i;
                    } else {
                        result += " x " + i;
                    }
                    number = number / i;
                }
            }
        }
        return result;
    }
}