package ca.nl.cna.ethan.drover.Assignment3;

/**
 * A simple class for creating a product object.
 * @author Ethan.Drover
 */
public class Product {

    private int id;
    private String description;
    private double price;

    /**
     * Product class that takes the following params.
     *
     * @param id          ID of the product.
     * @param description Description of the product.
     * @param price       Price of the product.
     */
    public Product(int id, String description, double price) {

        this.id = Math.max(id, 0);
        this.description = description;
        this.price = Math.max(price, 0);
    }

    /**
     * Gets the ID.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID.
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = Math.max(id, 0);
    }

    /**
     * Gets the description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description
     *
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the price
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price
     *
     * @param price price
     */
    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }

    /**
     * Returns a string representation of a Product object.
     * The string includes Product ID, Description, Price
     * @return a formatted string representing the product's ID, description, and price.
     */
    @Override
    public String toString() {
        return "Product ID: " + id + ", Description: " + description + ", Price: $" + price;

    }
}

// TODO
// Create a class called Product which has three attributes:
// id (int), description (String) and price (double).
// Create a constructor that takes in all three
// attributes and create a getting and setter for each.
// Don’t let the id attribute or the price be negative.
// (Note: I completed this class during course lectures
// – feel free to check the recordings on D2L)