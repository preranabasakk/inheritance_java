package devices;

public class SmartPhone extends Device {
    public SmartPhone(int batteryLevel) {
        super(batteryLevel);
    }

    public int checkBattery(){
        System.out.println(this.batteryLevel);
        return batteryLevel;
    }
}
