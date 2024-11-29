package four_adapter;

public class SmartSocket implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Socket is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Socket is turned OFF.");
    }
}
