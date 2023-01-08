package homework_c4_e1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0; //set counter to 0
        int sum = 0; //sum is 0

        while (counter < 10) { //tell program to run 10 times
            int order = counter + 1;
            System.out.print("Enter number #" + order + ": "); //tell user to input a number 10 times
            boolean hasNextInt = scanner.hasNextInt(); //checks to ensure it is a valid number

            if (hasNextInt) { // if valid number entered, do the math below
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else { //if invalid number is entered
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close(); //good practice
    }
}