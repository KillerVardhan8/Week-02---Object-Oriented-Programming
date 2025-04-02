import java.util.*;

class Device{
    private int devideID;
    private String Status;

    public Device(int devideID, String status) {
        this.devideID = devideID;
        Status = status;
    }

    public void displayStatus(){
        System.out.println("Device ID : "+devideID);
        System.out.println("Status : "+Status);
    }
}

class Thermostat extends Device{
    private String TemperatureSetting;

    public Thermostat(int devideID, String status, String temperatureSetting) {
        super(devideID, status);
        TemperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : "+TemperatureSetting);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        List<Device> deviceList=new ArrayList<>();

        Device device1=new Device(12,"Delivered");
        Thermostat thermostat1=new Thermostat(13,"Out for Delivery","Hot");

        deviceList.add(device1);
        deviceList.add(thermostat1);

        for (Device device:deviceList){
            device.displayStatus();
            System.out.println();
        }
    }
}
