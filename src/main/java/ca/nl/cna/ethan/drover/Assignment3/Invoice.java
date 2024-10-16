package ca.nl.cna.ethan.drover.Assignment3;

/**
 * A simple class for representing an invoice containing a single invoice item.
 * Gets and sets invoice item, gets total.
 * @author Ethan.Drover
 */
public class Invoice {
    private InvoiceItem invoiceItem;

    /**
     * Creates an invoice object with the specified InvoiceItem.
     * @param invoiceItem the InvoiceItem associated with this invoice.
     */
    public Invoice(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    /**
     * Get the invoice item.
     * @return invoiceItem.
     */
    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    /**
     * Set the invoice item.
     * @param invoiceItem invoiceItem.
     */
    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    /**
     * Get the invoice total.
     * @return Item total from specified invoice item.
     */
    public double getInvoiceTotal() {
        return invoiceItem.getItemTotal();
    }
}

// TODO
// Create a class call Invoice that has a single instance variables of type InvoiceItem.
// Add methods to set and get the invoice item.
// Add a method to get the invoice total
// (note: it should be the same as the InvoiceItem total).
// Add these tests to the InvoiceTester class.
