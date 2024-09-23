package ca.nl.cna.ethan.drover.Objects;

/**
 * Account class modelled from chapter 3 notes.
 */
public class Account {

    private String name;
    private double balance;

    /**
     * A simple account constructor that will only set the balance if it is greater than 0
     * @param name name
     * @param balance balance
     */
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }
    }


    /**
     * Get the name from user
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Set the name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the balance
     * @return balance
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Deposit money into the account, number must be greater than zero
     * @param amount amount
     */
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}
