package homework_c4_e10;

/*
* The Carpet class has one instance variable cost of type double, and a constructor that takes a cost value as a parameter and
* sets the instance variable to this value.
* */

public class Carpet {
    private double cost;

    //It also includes a getCost method that returns the cost of the carpet as a double.
    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}