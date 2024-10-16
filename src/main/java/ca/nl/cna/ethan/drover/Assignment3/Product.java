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
        if (id > 0) {
            this.id = id;
        }
        this.description = description;
        if (price > 0) {
            this.price = price;
        }
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
        if (id > 0) {
            this.id = id;
        }
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
        if (price > 0) {
            this.price = price;
        }
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