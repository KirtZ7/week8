package homework_Cylinder;

public class Circle {
    // instance variable
    private double radius;

    // constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // getter for radius
    public double getRadius() {
        return radius;
    }

    // method to calculate and return the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}




