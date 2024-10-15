package ca.nl.cna.ethan.drover.Assignment3;

/**
 * A simple class for creating an invoice item.
 * @author Ethan.Drover
 */
public class InvoiceItem {

    private Product product;
    private int quantity;

    /**
     * InvoiceItem class that takes the following params.
     *
     * @param product  Product from product class.
     * @param quantity Quantity.
     */
    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = Math.max(quantity, 0);  // Default to 0 if quantity is negative
    }

    /**
     * Gets the product
     * @return product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Set the product
     * @param product product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Get the quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity
     * @param quantity quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    /**
     * Returns a string representation of an invoiceItem object.
     * The string includes Product, Quantity, Item total
     * @return a formatted string representing the product's ID, quantity, and item total.
     */
    @Override
    public String toString() {
        return "Product: " + product + ", Quantity: " + quantity + ", Item Total: $" + getItemTotal();
    }

    /**
     * Get the item total
     * @return product price * quantity
     */
    public double getItemTotal() {
        return product.getPrice() * quantity;
    }
}

// TODO
// Create a class called InvoiceItem that has two attributes:
// product (Product class above) and quantity(int).
// Great getter and setters and a constructor.
// Create a method called getItemTotal() which calculates
// the total based on product price and quantity.
// Don’t let quantity be negative.