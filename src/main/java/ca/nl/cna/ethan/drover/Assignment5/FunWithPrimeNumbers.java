package ca.nl.cna.ethan.drover.Assignment5;

import java.util.Scanner;

/**
 * Class to test the prime numbers calculator with a built-in menu:
 * 1. Display all prime numbers up to a value
 * 2. Display all primes between two numbers
 * 3. Display the unique prime factorization of a number
 * 4. Display the unique prime factorizations up to a limit
 * 5. Exit
 *
 */
public class FunWithPrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nFun With Prime Numbers");
            System.out.println("1. Display all prime numbers up to a value");
            System.out.println("2. Display all primes between two numbers");
            System.out.println("3. Display the unique prime factorization of a number");
            System.out.println("4. Display the unique prime factorizations up to a limit");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter a value: ");
                int limit = scanner.nextInt();
                System.out.println("Prime numbers up to " + limit + ":");
                for (int i = 2; i <= limit; i++) {
                    if (PrimeNumberCalculator.isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter the start value: ");
                int start = scanner.nextInt();
                System.out.print("Enter the end value: ");
                int end = scanner.nextInt();
                System.out.println("Prime numbers between " + start + " and " + end + ":");
                for (int i = start; i <= end; i++) {
                    if (PrimeNumberCalculator.isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } else if (choice == 3) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                String factorization = PrimeNumberCalculator.getUniquePrimeFactorization(number);
                System.out.println("Unique prime factorization of " + number + ": " + factorization);
            } else if (choice == 4) {
                System.out.print("Enter a limit: ");
                int factorizationLimit = scanner.nextInt();
                System.out.println("Prime factorizations up to " + factorizationLimit + ":");
                for (int i = 2; i <= factorizationLimit; i++) {
                    String factors = PrimeNumberCalculator.getUniquePrimeFactorization(i);
                    System.out.println(i + " = " + factors);
                }
            } else if (choice == 5) {
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}