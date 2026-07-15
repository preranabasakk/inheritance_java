package devices;

public class Device {
    protected int batteryLevel;

    public Device(int batteryLevel){
        this.batteryLevel=batteryLevel;
    }
    public int charge(int amount ){
        return batteryLevel+amount;
    }
}
