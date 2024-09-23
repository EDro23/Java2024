package ca.nl.cna.ethan.drover.Objects;

import java.util.Scanner;

/**
 * Class for creating an account and depositing
 */
public class FunWithAccounts {

    /**
     * A simple function for having fun with accounts.
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println("Fun with Accounts!");

        Account account = new Account("Ethan's Account", 1500.25);

        System.out.printf("\nAccount name: %s, Balance: $%.2f\n", account.getName(), account.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount to deposit: ");
        double amount = input.nextDouble();

        account.deposit(amount);

        System.out.printf("\nAccount name: %s, New balance: $%.2f\n", account.getName(), account.getBalance());

    }
}


