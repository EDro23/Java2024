package ca.nl.cna.ethan.drover.Assignment3;

/**
 * A simple class for creating an invoice item.
 * @author Ethan.Drover
 */
public class InvoiceItem {

    private String Product;
    private int quantity;

    /**
     * InvoiceItem class that takes the following params.
     * @param product Product from product class.
     * @param quantity Quantity.
     */
    public InvoiceItem(String product, int quantity) {
        Product = product;
        this.quantity = quantity;
    }

    /**
     * Gets a product.
     * @return product
     */
    public String getProduct() {
        return Product;
    }

    /**
     * Set a product.
     * @param product product
     */
    public void setProduct(String product) {
        Product = product;
    }

    /**
     * Get  a quantity.
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set a quantity.
     * @param quantity quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getItemTotal() {

    }
}

// TODO
// Create a class called InvoiceItem that has two attributes:
// product (Product class above) and quantity(int).
// Great getter and setters and a constructor.
// Create a method called getItemTotal() which calculates
// the total based on product price and quantity.
// Don’t let quantity be negative.