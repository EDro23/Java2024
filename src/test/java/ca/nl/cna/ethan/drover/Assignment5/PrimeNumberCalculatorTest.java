package ca.nl.cna.ethan.drover.Assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

class PrimeNumberCalculatorTest {

    PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();

    @Test
    public void testFirst25KnownPrimes() {
        int[] knownPrimes = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97
        };
        for (int prime : knownPrimes) {
            assertTrue(PrimeNumberCalculator.isPrime(prime), prime + " should be identified as a prime number.");
        }
    }

    /**
     * Tests a set of known non-prime numbers.
     */
    @Test
    public void testKnownNonPrimes() {
        int[] nonPrimes = {0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 34, 35, 36};
        for (int nonPrime : nonPrimes) {
            assertFalse(PrimeNumberCalculator.isPrime(nonPrime), nonPrime + " should be identified as not a prime number.");
        }
    }

    /**
     * Tests large prime products using a random number generator.
     */
    @Test
    public void testLargePrimeProduct() {
        Random random = new Random();
        int prime1;
        int prime2;

        do {
            prime1 = random.nextInt(40000) + 10000; // Generates a number between 10000 and 50000
        } while (!PrimeNumberCalculator.isPrime(prime1));

        do {
            prime2 = random.nextInt(40000) + 10000; // Generates a number between 10000 and 50000
        } while (!PrimeNumberCalculator.isPrime(prime2));

        int product = prime1 * prime2;

        assertFalse(PrimeNumberCalculator.isPrime(product), "The product of two primes should not be a prime number.");
        assertTrue(PrimeNumberCalculator.isPrime(prime1), prime1 + " should be identified as a prime number.");
        assertTrue(PrimeNumberCalculator.isPrime(prime2), prime2 + " should be identified as a prime number.");
    }
}