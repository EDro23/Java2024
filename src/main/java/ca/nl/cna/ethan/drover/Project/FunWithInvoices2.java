package ca.nl.cna.ethan.drover.Project;

import java.time.LocalDate;

/**
 * Fun with invoices 2 for the 2nd invoice
 */
public class FunWithInvoices2 {

    /**
     *  Demo invoice class to demo a second invoice
     */
    public static void demoInvoice2(){
        BillableItemsDatabase database = new BillableItemsDatabase();

        // Retrieve products and services from the database
        Product product1 = (Product) database.findById(102); // Engine Oil
        Product product2 = (Product) database.findById(105); // Tire
        Product product3 = (Product) database.findById(103); // Air Filter
        Service service1 = (Service) database.findById(203); // Brake inspect
        Service service2 = (Service) database.findById(204); // Engine diagnostic

        // Customer
        Customer customer = new Customer("John Doe", "john.doe@example.com", "123 Main Street, Springfield");

        // Items
        InvoiceItem[] invoiceItems = new InvoiceItem[10]; // Assuming a maximum of 10 items

        invoiceItems[0] = new InvoiceItem(product1, 5); // 5 Engine Oil
        invoiceItems[1] = new InvoiceItem(product2, 2); // 2 Tires
        invoiceItems[2] = new InvoiceItem(product3, 1); // 1 Air Filter
        invoiceItems[3] = new InvoiceItem(service1, 2); // 2 Hour brake
        invoiceItems[4] = new InvoiceItem(service2, 1); // Engine diagnostic

        // Invoice details
        LocalDate date = LocalDate.now();
        String paymentTerms = "Net 30";
        String notes = "Thank you for your business!";
        double salesTaxRate = 0.13;
        int itemCount = 5; // Number of items added to the invoice

        // Creating invoice
        Invoice invoice = new Invoice(customer, invoiceItems, itemCount, date, paymentTerms, notes, salesTaxRate);

        // Print the invoice
        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice(invoice);
    }
}
