import java.util.*;

class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Salary : "+salary);
    }
}

class Manager extends Employee{
    private int teamsize;

    public Manager(String name, int id, double salary, int teamsize) {
        super(name, id, salary);
        this.teamsize=teamsize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("TeamSize : "+teamsize);
    }
}

class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }
}

class Intern extends Employee{
    private String CollegeName;

    public Intern(String name, int id, double salary, String collegeName) {
        super(name, id, salary);
        CollegeName = collegeName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("College Name : "+CollegeName);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee1=new Employee("Surya",123,25000);
        Manager manager1= new Manager("Vardhan",111,50000,4);
        Developer developer1=new Developer("Srikaran",112,50000,"Java");
        Intern intern1=new Intern("Arpit",1,15000,"SRM University");

        employee1.displayDetails();
        System.out.println();
        manager1.displayDetails();
        System.out.println();
        developer1.displayDetails();
        System.out.println();
        intern1.displayDetails();

    }
}
