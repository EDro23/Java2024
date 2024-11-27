package ca.nl.cna.ethan.drover.Project;

/**
 * Service class that is a child to the billable class, uses the billable attributes, returns a service as a
 * billable item, charges per hour and updates the billable class
 */
public class Service extends Billable{

    private int hours;
    private double ratePerHour;

    /**
     * Billable constructor for the following params
     *
     * @param id          ID of the billable object
     * @param description Description of billable object
     * @param price       Price of billable object
     */
    public Service(int id, String description, double price) {
        super(id, description, price);

        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    /**
     * Get the hours to effect the cost
     * @return hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Set the hours, changes the price in the billable depending on hours
     * @param hours Amount of hours
     */
    public void setHours(int hours) {
        this.hours = hours;
        setPrice(ratePerHour * hours);
    }

    /**
     * Get the rate per hour
     * @return rate per hour
     */
    public double getRatePerHour() {
        return ratePerHour;
    }

    /**
     * Set te rate per hour, update the price in the billable
     * @param ratePerHour Rate per hour to charge
     */
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
        setPrice(ratePerHour * hours);
    }

    /**
     * Method to get the billing details with the hours and rate per hour
     * @return Returns a string with the service, hours, rate per hour and the total for the service
     */
    public String getBillingDetails() {
        return "Service: " + getDescription() + ", Hours: " + hours +
                ", Rate/Hour: $" + ratePerHour + ", Total: $" + getPrice();
    }
}
