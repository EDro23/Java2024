package ca.nl.cna.ethan.drover.Help.Random;

import java.util.Random;

public class FunwithRandomCars {
    public static void main(String[] args) {
        System.out.println("Fun with Random Cars");

        for (int i = 0; i < 5; i++) {
            printCarInfo(randomCarGenerator());
        }
    }

    private static Car randomCarGenerator(){

        String[] models = {"Civic", "CRV", "S2000", "Prelude"};
        String[] colors = {"Red", "Blue", "Orange", "Yellow", "Grey", "Black"};

        Random random = new Random();

        double randomPrice = random.nextDouble(2000,10000);
        int randomYear = random.nextInt(1960,2024);
        String randomModel = models[random.nextInt(models.length)];
        String randomColor = colors[random.nextInt(colors.length)];

        Car car = new Car("Honda",randomModel,randomColor,randomYear,randomPrice);

        return car;
    }

    private static void printCarInfo(Car car) {
        System.out.printf("You just generated a brand new %s %s," +
                " \nIts a %d, %s in color" +
                " \nThe original price on this sucker is $%.2f!\n\n",car.getMake(),car.getModel(),car.getYear(),car.getColor(),car.getPrice());
    }
}
