class Vehicle1{
    private double maxSpeed;
    private String model;

    public Vehicle1(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails(){
        System.out.println("MaxSpeed : "+maxSpeed);
        System.out.println("Model : "+model);
    }
}

interface Refuelable{
    void refuel();
}

class ElectricVehicle1 extends Vehicle1{
    public ElectricVehicle1(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge(){
        System.out.println("Electric Vehicle is charged");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}

class PetrolVehicle1 extends Vehicle1 implements Refuelable{
    public PetrolVehicle1(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle is Refueled");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}
public class Vehicle1ManagementSystem {
    public static void main(String[] args) {
        Vehicle1 vehicle1=new Vehicle1(100,"Auto");
        ElectricVehicle1 electricVehicle11=new ElectricVehicle1(200,"Tesla");
        PetrolVehicle1 petrolVehicle11=new PetrolVehicle1(150,"Baleno");

        vehicle1.displayDetails();
        System.out.println();
        electricVehicle11.displayDetails();
        electricVehicle11.charge();
        System.out.println();
        petrolVehicle11.displayDetails();
        petrolVehicle11.refuel();

    }
}
