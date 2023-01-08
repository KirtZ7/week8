package exceptionhandling;

public class Throws {
    void t1 () throws Exception {
        System.out.println(10/0);
    }

    void t2 () throws  Exception {
        t1();
    }

    void handle (){
        try {
            t2();
        } catch (Exception e){
            System.out.println("Doomed");
        }
    }

    public static void main(String[] args) {
        Throws Throws = new Throws();
        Throws.handle();
    }
}
