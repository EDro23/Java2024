package ca.nl.cna.ethan.drover.Help.Random;

import java.util.Random;
import java.util.Scanner;

public class FunWithRandomPlayers {
    public static void main(String[] args) {
        System.out.println("Fun with Random players");

        for (int i = 0; i < 5; i++) {
            printPlayerInfo(generateRandomPlayer());
        }
    }

    public static Player generateRandomPlayer(){
        Random random = new Random();
        double randomPlayerId = random.nextInt((100)+1);
        int randomPlayerLevel = random.nextInt((50)+5);

        Player player = new Player(randomPlayerId,randomPlayerLevel,"");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter player name: ");
        String name = scanner.nextLine();

        player.setName(name);
        return player;
    }

    public static void printPlayerInfo(Player player) {
        System.out.printf("Player ID: %.0f \nLevel: %d \nName: %s",player.getID(),player.getLevel(),player.getName());
    }
}
