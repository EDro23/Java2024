package ca.nl.cna.ethan.drover.Test01;

/**
 * Rectangle class with two attributes. Length and Width
 */
public class Rectangle {

    private Double Length;
    private Double Width;

    /**
     * Rectangle constructor which takes 2 params
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     */
    public Rectangle(Double length, Double width) {
        Length = length;
        Width = width;
    }

    /**
     * Get the length of the rectangle
     * @return The length of given rectangle
     */
    public Double getLength() {
        return Length;
    }

    /**
     * Set the length of the rectangle
     * @param length Takes in one param of length
     */
    public void setLength(Double length) {
        if (length > 0) {
            Length = length;
        }
    }

    /**
     * Get the width of the rectangle
     * @return Return the width of the rectangle
     */
    public Double getWidth() {
        return Width;
    }

    /**
     * Set the width of the rectangle
     * @param width Takes one param of width
     */
    public void setWidth(Double width) {
        if (width > 0) {
            Width = width;
        }

    }

    /**
     * A method to determine the length of the rectangle
     * @return Returns the area of the rectangle with the given width and length.
     */
    public double area() {
        double result = 0;
        if (Length > 0 || Width > 0) {
            result = Length * Width;
        }
        return result;
    }

    /**
     * A method to determine the perimeter of a given rectangle
     * @return Returns the perimeter of the given dimensions
     */
    public double perimeter() {
        double result = 0;
        if (Length > 0 || Width > 0) {
            result = (Length * 2) + (2 * Width);
        }
        return result;
    }

    /**
     * Determines whether a rectangle is a square or not, Checks to see if the length and width are equal
     * @return Returns true for false whether the rectangle is a square
     */
    public String isSquare() {
        String result = "";
        if (Length == Width) {
            result = "True";
        } else {
            result = "False";
        }
        return result;
    }
}
