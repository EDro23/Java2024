package ca.nl.cna.ethan.drover.Assignment3;

/**
 * A simple class for playing with invoices.
 * This class assumes that each Invoice can only hold a single InvoiceItem.
 * @author Ethan.Drover
 */
public class InvoiceTester {
    public static void main(String[] args) {
        System.out.print("Fun with Invoices!");

        // Products
        System.out.printf("%n");
        Product invalidProduct = new Product(-1, "Invalid Product", -50);
        Product product1 = new Product(1, "Set For Life", 4);
        Product product2 = new Product(2, "Gatorade", 3.79);
        Product product3 = new Product(3, "Rip-Offs", 0.50);

        // Print products
        System.out.printf("%nProduct List:%n");
        System.out.printf("Product ID: %d, Description: %s, Price: $%.2f%n",
                invalidProduct.getId(), invalidProduct.getDescription(), invalidProduct.getPrice());
        System.out.printf("Product ID: %d, Description: %s, Price: $%.2f%n",
                product1.getId(), product1.getDescription(), product1.getPrice());
        System.out.printf("Product ID: %d, Description: %s, Price: $%.2f%n",
                product2.getId(), product2.getDescription(), product2.getPrice());
        System.out.printf("Product ID: %d, Description: %s, Price: $%.2f%n",
                product3.getId(), product3.getDescription(), product3.getPrice());

        // Create invoice items
        InvoiceItem invalidItem = new InvoiceItem(invalidProduct, -3);
        InvoiceItem item1 = new InvoiceItem(product1, 3);
        InvoiceItem item2 = new InvoiceItem(product2, 2);
        InvoiceItem item3 = new InvoiceItem(product3, 20);

        // Print invoice items
        System.out.printf("%nInvoice Items:%n");
        System.out.printf("Product: %s, Quantity: %d, Item Total: $%.2f%n",
                invalidItem.getProduct().getDescription(), invalidItem.getQuantity(), invalidItem.getItemTotal());
        System.out.printf("Product: %s, Quantity: %d, Item Total: $%.2f%n",
                item1.getProduct().getDescription(), item1.getQuantity(), item1.getItemTotal());
        System.out.printf("Product: %s, Quantity: %d, Item Total: $%.2f%n",
                item2.getProduct().getDescription(), item2.getQuantity(), item2.getItemTotal());
        System.out.printf("Product: %s, Quantity: %d, Item Total: $%.2f%n",
                item3.getProduct().getDescription(), item3.getQuantity(), item3.getItemTotal());

        System.out.printf("%nInvoices:%n");

        // Each invoice containing one InvoiceItem
        Invoice invoice1 = new Invoice(item1);
        Invoice invoice2 = new Invoice(item2);
        Invoice invoice3 = new Invoice(item3);

        // Print details of each invoice
        System.out.printf("Invoice 1: Product: %s, Quantity: %d, Total: $%.2f%n",
                invoice1.getInvoiceItem().getProduct().getDescription(),
                invoice1.getInvoiceItem().getQuantity(),
                invoice1.getInvoiceTotal());

        System.out.printf("Invoice 2: Product: %s, Quantity: %d, Total: $%.2f%n",
                invoice2.getInvoiceItem().getProduct().getDescription(),
                invoice2.getInvoiceItem().getQuantity(),
                invoice2.getInvoiceTotal());

        System.out.printf("Invoice 3: Product: %s, Quantity: %d, Total: $%.2f%n",
                invoice3.getInvoiceItem().getProduct().getDescription(),
                invoice3.getInvoiceItem().getQuantity(),
                invoice3.getInvoiceTotal());
    }
}