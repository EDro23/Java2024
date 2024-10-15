package ca.nl.cna.ethan.drover.Assignment3;

/**
 * A simple class for playing with invoices.
 * @author Ethan.Drover
 */
public class InvoiceTester {
    public static void main(String[] args) {
        System.out.print("Fun with Invoices!");

        // Product List
        System.out.printf("%n");
        Product invalidProduct = new Product(-1, "Invalid Product", -50);
        Product product1 = new Product(1, "Set For Life", 4);
        Product product2 = new Product(2, "Gatorade", 3.79);
        Product product3 = new Product(3, "Rip-Offs", 0.50);

        // Print products
        System.out.printf("%n");
        System.out.println(invalidProduct);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        // Create invoice items
        System.out.printf("%n");
        InvoiceItem invalidItem = new InvoiceItem(invalidProduct, -3);
        InvoiceItem item1 = new InvoiceItem(product1, 3);
        InvoiceItem item2 = new InvoiceItem(product2, 2);
        InvoiceItem item3 = new InvoiceItem(product3, 20);

        // Print invoice items
        System.out.printf("%n");
        System.out.println(invalidItem);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

        // Create and print invoice
        System.out.printf("%n");
        Invoice invoice1 = new Invoice(item1);
        Invoice invoice2 = new Invoice(item2);
        Invoice invoice3 = new Invoice(item3);
        System.out.println(invoice1);
        System.out.println(invoice2);
        System.out.println(invoice3);
    }
}

// TODO
// Build three objects (Product, InvoiceItem and Invoice) to represent a simple invoice.
// Create an Invoice Tester application which can be used to play with invoices.
// In the test class create products and print out their values
// Test for edge cases with negative numbers.
// Create invoice items and an invoice and print out the details of each.