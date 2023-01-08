package exceptionhandling;

public class Throws2 {

    public static void validate(int age){
        if(age <18) {
            throw new ArithmeticException("Person is too young to vote");
        }
        else {
            System.out.println("Person is over 18 to vote");
        }
    }
    public static void main(String[] args) {
        validate(16);

    }
}
