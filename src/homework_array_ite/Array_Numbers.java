package homework_array_ite;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Numbers {
    public static void main(String[] args) {
        // Create a new ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        // Get an Iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate through the list using the Iterator
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        // Can use for loop too
        /*
        for (int number : numbers) {
            System.out.println(number);
        }
        */
    }
}
