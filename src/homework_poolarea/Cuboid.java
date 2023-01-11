package homework_poolarea;
public class Cuboid extends Rectangle {
    // instance variable
    private double height;

    // constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
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

    // method to calculate and return the volume of the cuboid
    public double getVolume() {
        return getArea() * height;
    }
}
