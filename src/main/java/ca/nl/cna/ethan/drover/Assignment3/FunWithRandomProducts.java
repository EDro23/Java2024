package ca.nl.cna.ethan.drover.Assignment3;

import java.util.Random;

public class FunWithRandomProducts {
    public static void main(String[] args) {
        System.out.println("Fun with random products");

        for (int i = 0; i < 10; i++) {
            Product randomProduct = generateRandomProduct();
            printProductInfo(randomProduct);
        }
    }

    public static Product generateRandomProduct() {
        Random random = new Random();
        int randomId = random.nextInt(1000) + 1;
        String randomDescription = "RandProduct_" + randomId;
        double randomPrice = random.nextDouble() * (random.nextInt(1000) + 1);
        return new Product(randomId, randomDescription, randomPrice);
    }

    public static void printProductInfo(Product product) {
        System.out.printf("\nId: %d, Description: %s, Price: $%.2f%n", product.getId(), product.getDescription(), product.getPrice());
    }
}