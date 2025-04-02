import java.util.*;

class Person1{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

interface Worker{
    void performDuties();
}

class Chef extends Person1 implements Worker{
    public Chef(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties to be performed");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

    }
}

class Waiter extends Person1 implements Worker{
    public Waiter(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter duties to be performed");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Person1 person1=new Person1("Surya",21);
        Chef chef1=new Chef("Jackson",40);
        Waiter waiter1=new Waiter("Babu",35);

        person1.displayDetails();
        System.out.println();;
        chef1.displayDetails();
        chef1.performDuties();
        System.out.println();
        waiter1.displayDetails();
        waiter1.performDuties();


    }
}
