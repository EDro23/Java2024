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

    @Test
    public void testLargeRandomPrimeFactorization() {
        Random random = new Random();
        int randomNumber = random.nextInt(90000) + 1000000;
        System.out.printf("Random number: %d",randomNumber);

        String primeFactorization = PrimeNumberCalculator.getUniquePrimeFactorization(randomNumber);

        // Parse the prime factorization and compute the product
        String[] factors = primeFactorization.split(" x ");
        int recomputedProduct = 1;
        for (String factor : factors) {
            recomputedProduct *= Integer.parseInt(factor);
        }

        System.out.printf("\nRecomputed number: %d",recomputedProduct);
        // Verify the recomputed product matches the original random number
        assertEquals(randomNumber, recomputedProduct,
                "The product of the prime factorization should equal the original number.");

        // Verify each factor in the prime factorization is a prime number
        for (String factor : factors) {
            int primeFactor = Integer.parseInt(factor);
            assertTrue(PrimeNumberCalculator.isPrime(primeFactor),
                    primeFactor + " should be identified as a prime number.");
        }
    }
}