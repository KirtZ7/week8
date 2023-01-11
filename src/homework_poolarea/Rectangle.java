package homework_poolarea;

public class Rectangle {
    // instance variables
    private double width;
    private double length;

    // constructor
    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // getter for width
    public double getWidth() {
        return width;
    }

    // getter for length
    public double getLength() {
        return length;
    }

    // method to calculate and return the area of the rectangle
    public double getArea() {
        return width * length;
    }
}




