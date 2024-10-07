/**
 * A java package for creating a car object.
 */
package ca.nl.cna.ethan.drover.Assignment1;

/**
 * A simple class for creating car object.
 * @author Ethan.Drover
 */
public class Car {

    private String Make;
    private String Model;
    private Integer Year;
    private Float Value;

    public Car(String make, String model, Integer year, Float value) {
        Make = make;
        Model = model;
        Year = year;
        Value = value;
    }

    /**
     * Get the make of a car
     * @return make
     */
    public String getMake() {
        return Make;
    }

    /**
     * Set the make of a car
     * @param make make
     */
    public void setMake(String make) {
        Make = make;
    }

    /**
     * Get model of a car
     * @return model
     */
    public String getModel() {
        return Model;
    }

    /**
     * Get the model of the car
     * @param model model
     */
    public void setModel(String model) {
        Model = model;
    }

    /**
     * Returns the year of the car
     * @return year
     */
    public Integer getYear() {
        return Year;
    }

    /**
     * Set the year of a car
     * @param year year
     */
    public void setYear(Integer year) {
        Year = year;
    }

    /**
     * Get the value of a car
     * @return value
     */
    public Float getValue() {
        return Value;
    }

    /**
     * Set the value of a car
     * @param value value
     */
    public void setValue(Float value) {
        Value = value;
    }

}
