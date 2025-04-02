import java.util.*;

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal makes this sound ");
    }
    public void displayDetails(){
        System.out.println("Animal Name : "+name);
        System.out.println("Animal age : "+age);
    }
}

class Dog extends Animal{
    public Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes bark sound ");
    }
}

class Cat extends Animal{
    public Cat(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat makes Meow Sound ");
    }
}

class Bird extends Animal{
    public Bird(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes Chirp Sound ");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal1=new Animal("Horse",15);
        animal1.makeSound();

        Dog dog1=new Dog("Dog",20);
        dog1.makeSound();

        Cat cat1=new Cat("Cat",15);
        cat1.makeSound();

        Bird bird1=new Bird("Bird",30);
        bird1.makeSound();
    }
}
