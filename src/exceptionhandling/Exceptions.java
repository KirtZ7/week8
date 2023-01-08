package exceptionhandling;

public class Exceptions {

    // Exceptions
    // 1. Checked at compile time
    //Try and Catch method

    public static void m1() {

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
        finally {
            System.out.println("Always runs");
        }
    }

    // 2. Unchecked at run time
    //



    public static void main(String[] args) {
        m1();
    }

}


