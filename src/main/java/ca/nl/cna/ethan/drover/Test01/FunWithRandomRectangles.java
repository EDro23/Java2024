package ca.nl.cna.ethan.drover.Test01;

import java.util.Random;

public class FunWithRandomRectangles {
    public static void main(String[] args) {
        System.out.println("Fun with random Rectangles!");

        for (int i = 0; i < 10; i++) {
            printRectangleInfo(randomRectangleGenerator());
        }
    }

    private static Rectangle randomRectangleGenerator(){
        Random random = new Random();

        double randomLength = random.nextDouble();
        double randomWidth = random.nextDouble();

        Rectangle rectangle = new Rectangle(randomLength,randomWidth);

        return rectangle;
    }

    public static void printRectangleInfo(Rectangle rectangle){
        System.out.printf("Length: %f, Width: %f, area: %f, perimeter: %f, square? %b",
                rectangle.getLength(), rectangle.getWidth(), rectangle.area(), rectangle.perimeter(), rectangle.isSquare());
    }
}
