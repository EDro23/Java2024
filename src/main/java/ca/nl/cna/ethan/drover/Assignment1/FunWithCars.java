/**
 * Fun with cars!
 */
package ca.nl.cna.ethan.drover.Assignment1;

import java.util.Scanner;

/**
 * Fun with Cars Class! A class to have fun with a car object.
 *
 * @author Ethan.Drover
 */
public class FunWithCars {

    /**
     * Creating a car object and having fun with it.
     *
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println("Fun With Cars!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the make: ");
        String make = input.nextLine();

        System.out.println("Enter the model: ");
        String model = input.nextLine();

        System.out.println("Enter the year: ");
        Integer year = input.nextInt();

        System.out.println("Enter the value: ");
        Float value = input.nextFloat();

        Car car = new Car(make, model, year, value);

        System.out.printf("Car information: %s, %s from %d. Value: $%.2f", car.getMake(), car.getModel(), car.getYear(), car.getValue());
    }
}
