package homework_array_groupnames;

public class Array_Iterates2 {
    public static void main(String[] args) {
        // Create four arrays of strings to hold the group member names
        String[] postman = {"Kirtan", "Minesh", "Maulik", "Sheetal"};
        String[] java = {"Anupama", "Krunal", "Riddhi"};
        String[] selenium = {"Urvi", "Sonia", "Kuldip", "Umangi"};
        String[] restAssured = {"Jigar", "Akshit", "Shivam", "Arpita"};

        // Iterate through each array and search for "Kirtan" in each group array
        for (String name : postman) {
            if (name.equals("Kirtan")) {
                System.out.println("Found Kirtan in the postman group");
            }
        }
        for (String name : java) {
            if (name.equals("Kirtan")) {
                System.out.println("Found Kirtan in the java group");
            }
        }
        for (String name : selenium) {
            if (name.equals("Kirtan")) {
                System.out.println("Found Kirtan in the selenium group");
            }
        }
        for (String name : restAssured) {
            if (name.equals("Kirtan")) {
                System.out.println("Found Kirtan in the restAssured group");
            }
        }
    }
}
