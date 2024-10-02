package ca.nl.cna.ethan.drover.controlstructures.ifelse;

import java.util.Scanner;

/**
 * Simple application to demonstrate IF statements
 * @author ethan.drover
 */
public class FunWithIfStatements {

    public static void main(String[] args) {
        System.out.println("Fun with ... IF Statements!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        if(x % 2 == 0){
            System.out.println("The number is EVEN!");
        }

        if(x % 2 != 0 ){
            System.out.println("The number is ODD!");
        }
    }

}
