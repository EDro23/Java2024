package ca.nl.cna.ethan.drover.Help.Random;

import java.util.Scanner;

public class FunwithDice {
    public static void main(String[] args) {
        System.out.println("Fun with Dice!");

        System.out.println("Testing the dice before starting...");
        rollOneDice();

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many dice do you want to roll? ");

        Integer diceRoll = scanner.nextInt();
        rollRequestedTimes(diceRoll);
    }

    public static void rollOneDice(){
        Dice dice = new Dice();

        for (int i = 0; i < 1; i++) {
            int rollResult = dice.roll();
            System.out.printf("Roll %d: %d%n",i + 1,rollResult);
        }
    }
    
    public static void rollRequestedTimes(int numberOfRolls){
        Dice dice = new Dice();

        for (int i = 0; i < numberOfRolls; i++) {
            int rollResult = dice.roll();
            System.out.printf("Roll %d: %d%n",i + 1,rollResult);
        }
    }
}
