package homework_array_groupnames;

import java.util.ArrayList;

public class Array_Iterates {
    public static void main(String[] args) {
        // Create an array of strings representing group names
        ArrayList<String> groups = new ArrayList<>();

        //add each group to the empty array. remove via object and index
        groups.add("Postman");
        groups.add("Rest Assured");
        groups.add("Java");
        groups.add("Selenium");
        groups.add("Selenium123");
        groups.add("Java789");
        groups.remove("java789");
        groups.remove(4);



        // Iterate through the array using a for-each loop
        for (String group : groups) {
            System.out.println(group);
        }
    }
}
