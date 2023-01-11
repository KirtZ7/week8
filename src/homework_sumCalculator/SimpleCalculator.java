package homework_sumCalculator;

public class SimpleCalculator {
    // instance variables
    private double firstNumber;
    private double secondNumber;

    // getter for firstNumber
    public double getFirstNumber() {
        return firstNumber;
    }

    // getter for secondNumber
    public double getSecondNumber() {
        return secondNumber;
    }

    // setter for firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // setter for secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // method to get the result of adding firstNumber and secondNumber
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // method to get the result of subtracting secondNumber from firstNumber
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // method to get the result of multiplying firstNumber and secondNumber
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // method to get the result of dividing firstNumber by secondNumber
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    //Enter the numbers manually for results
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

}
