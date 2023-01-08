package homework_hashset;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        // Create a new HashSet of Integer objects
        Set<Integer> set = new HashSet<>();

        // Add some numbers to the set
        set.add(4);
        set.add(7);
        set.add(8);

        // Use a for loop and an if-else statement to show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}
