package abstraction;

public class Child_Abstract extends Parent_Abstract{

    @Override
    void addition(){
        System.out.println("Method from Parent_Abstract class");
    }

    @Override
    void printName(){
        System.out.println("Print name Method from Parent_Abstract class");
    }

    @Override
    void balance(){
        System.out.println("balance check Method from Parent_Abstract class");
    }

    @Override
    void withdraw(){
        System.out.println("withdraw money Method from Parent_Abstract class");
    }

    public static void main(String[] args) {
        Child_Abstract c = new Child_Abstract();
        c.addition();
        c.printName();
        c.balance();
        c.withdraw();
        c.m1();
    }
}
