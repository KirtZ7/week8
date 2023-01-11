package homework_Cylinder;

public class Cylinder extends Circle {
    // instance variable
    private double height;

    // constructor
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getter for height
    public double getHeight() {
        return height;
    }

    // method to calculate and return the volume of the cylinder
    public double getVolume() {
        return getArea() * height;
    }
}