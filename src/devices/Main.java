package devices;

public class Main {
    public static void main(String[] args) {
        Device d = new SmartPhone(78);

        System.out.println(d.charge(9));

        SmartPhone s = new SmartPhone(20);
        System.out.println(" battary is at"+ s.checkBattery());
    }
}