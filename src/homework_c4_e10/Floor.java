package homework_c4_e10;


// Generate two instance variables for width and length
public class Floor {
    private double width;
    private double length;

    //constructor that takes width and length values as parameters and sets the instance variables to these values.
    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    //getArea method that returns the area of the floor as a double
    public double getArea() {
        return width * length;
    }
}