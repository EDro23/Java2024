package ca.nl.cna.ethan.drover;

/**
 * A simple application to play around with Strings
 * Demonstrating the newline ("\n"), Tab ("\t") and quote (\*) Special escape character in strings
 */
public class FunWithStrings {

    /**
     * Simple main method
     * @param args - none needed
     */

    public static void main(String[] args) {
        //Examples using the '/n' new line character
        System.out.println("This \nis \na \nMultiline \nMeSsAgE!");

        //Example using the '\t' tab character
        System.out.println("This is a tab ->\t<-----");
        System.out.println("\tTabbed in line 1");
        System.out.println("\tTabbed in line 2");

        //Example using the quote
        System.out.println("Someone said \"To be or not to be! That is the question\" but I cant remember who!");
    }
}
