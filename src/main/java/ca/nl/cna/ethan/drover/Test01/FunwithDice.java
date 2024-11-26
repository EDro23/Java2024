package ca.nl.cna.ethan.drover.Test01;

import java.util.Random;
import java.util.Scanner;

/**
 * Fun with dice class to roll a dice, either a 6 sided, 10 sided or 20 sided dice.
 */
public class FunwithDice {
    public static int main(String[] args) {
        System.out.println("Fun with Dice!");

        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("[A] Roll a 6 sided dice");
            System.out.println("[B] Roll a 10 sided die");
            System.out.println("[C] Roll a 20 sided die");
            System.out.println("[Q] quit");

            String choice = scanner.next();

            if (choice.equals("A")) {
                Random random = new Random();
                return random.nextInt(6) + 1;
            } else if (choice.equals("B")){
                Random random = new Random();
                return random.nextInt(10) + 1;
            } else if (choice.equals("C")) {
                Random random = new Random();
                return random.nextInt(20) + 1;
            }
                else {
                    if (!choice.equals("Q")) {
                        System.out.println("Not a valid choice, Try again!");
                        System.out.printf("Choice: %s",choice);
                        playAgain = false;
                    }
        scanner.close();
    }
}
        return 0;
    }
}
