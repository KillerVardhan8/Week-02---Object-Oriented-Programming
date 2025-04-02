import java.util.*;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void displayRole(){
        System.out.println("Role : Teacher");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayRole();
    }
}

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public void displayRole(){
        System.out.println("Role : Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayRole();
    }
}

class Staff extends Person{
    public Staff(String name, int age) {
        super(name, age);
    }

    public void displayRole(){
        System.out.println("Role : Staff");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        displayRole();
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Person person1=new Person("Surya",21);
        Teacher teacher1=new Teacher("Aruna M",40);
        Student student1=new Student("Neeraj",21);
        Staff staff1=new Staff("Prabu",45);

        person1.displayDetails();
        System.out.println();
        teacher1.displayDetails();
        System.out.println();
        student1.displayDetails();
        System.out.println();
        staff1.displayDetails();
    }
}
