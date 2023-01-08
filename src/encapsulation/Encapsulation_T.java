package encapsulation;

public class Encapsulation_T {

    public static void main(String[] args) {
        Encapsulation_D ec = new Encapsulation_D();

        ec.setEmp_id(42069);
        ec.setEmp_name("Yeetus");
        ec.setSalary(96024);

        System.out.println(ec.getEmp_id());
        System.out.println(ec.getEmp_name());
        System.out.println(ec.getSalary());
        System.out.println("\n");

        ec.setEmp_id(429);
        ec.setEmp_name("Yeus");
        ec.setSalary(964);

        System.out.println(ec.getEmp_id());
        System.out.println(ec.getEmp_name());
        System.out.println(ec.getSalary());

    }
}
