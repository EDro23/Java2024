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
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    /**
     * Gets the product
     * @return the product item
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
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    /**
     * Get the item total
     * @return product price * quantity
     */
    public double getItemTotal() {
        return product.getPrice() * quantity;
    }
}