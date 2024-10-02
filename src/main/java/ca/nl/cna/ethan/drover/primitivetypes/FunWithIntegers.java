package ca.nl.cna.ethan.drover.primitivetypes;

import java.util.Random;

/**
 * Primitive type int has support (wrapper class) integer
 * API 20 docs:
 * Demonstrating the value of integer class in java
 * @author Ethan.Drover
 */
public class FunWithIntegers {
    public static void main(String[] args) {
        System.out.println("Fun wiht integers!");

        System.out.printf("Largest possible int: %d", Integer.MAX_VALUE);
        System.out.printf("\nSmallest possible int: %d", Integer.MIN_VALUE);

        // Generate random list
        Random random = new Random();
        System.out.printf("\nRandom value possible int: %d", random.nextInt());

        Integer i;
        int j;
    }
}
