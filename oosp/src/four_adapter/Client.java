package four_adapter;

public class Client {
    public static void main(String[] args) {
        SmartDevice smartSocket = new SmartSocket();
        smartSocket.turnOn();
        smartSocket.turnOff();

        OldDevice oldDevice = new OldDevice();
        SmartDevice adaptedDevice = new DeviceAdapter(oldDevice);
        adaptedDevice.turnOn();
        adaptedDevice.turnOff();
    }
}
