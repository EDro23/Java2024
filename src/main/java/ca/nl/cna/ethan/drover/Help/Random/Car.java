package ca.nl.cna.ethan.drover.Help.Random;

public class Car {

    private String Make;
    private String Model;
    private String Color;
    private Integer Year;
    private Double Price;

    public Car(String make, String model, String color, Integer year, Double price) {
        Make = make;
        Model = model;
        Color = color;
        Year = year;
        Price = price;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        if (year >= 1930) {
            Year = year;
        }
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        if (price >= 0) {
            Price = price;
        }

    }
}