package ca.nl.cna.ethan.drover.controlstructures.loops;

import java.util.Scanner;
/**
 * Java class for working with for loops.
 *
 * @author Ethan.Drover
 */
public class FunWithForLoops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Whaddayats do you want?");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Whadda yat?");

        }
    }
}
