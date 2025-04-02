import java.util.*;

class Vehicle{
    private double maxSpeed;
    private String fueltype;

    public Vehicle(String fueltype, double maxSpeed) {
        this.fueltype = fueltype;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo(){
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("Fuel Type : "+fueltype);
    }
}

class Car extends Vehicle{
    private int seatCapacity;

    public Car(String fueltype, double maxSpeed, int seatCapacity) {
        super(fueltype, maxSpeed);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
    }
}

class Truck extends Vehicle{
    private int seatCapacity;

    public Truck(String fueltype, double maxSpeed, int seatCapacity) {
        super(fueltype, maxSpeed);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
    }
}

class Motorcycle extends Vehicle{
    private int seatCapacity;

    public Motorcycle(String fueltype, double maxSpeed, int seatCapacity) {
        super(fueltype, maxSpeed);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
    }
}
public class VehicleandTransport {
    public static void main(String[] args) {
        List<Vehicle>vehiclelist=new ArrayList<>();
        Vehicle vehicle1=new Vehicle("Petrol",100);
        Car car1=new Car("Diesel",150,4);
        Truck truck1=new Truck("Diesel",130,2);
        Motorcycle motorcycle1=new Motorcycle("Petrol",100,1);

        vehiclelist.add(vehicle1);
        vehiclelist.add(car1);
        vehiclelist.add(truck1);
        vehiclelist.add(motorcycle1);

        for (Vehicle vehicle:vehiclelist) {
            vehicle.displayInfo();
            System.out.println();
        }

    }
}
