package four_adapter;

public class DeviceAdapter implements SmartDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void turnOn() {
        oldDevice.powerOn();
    }

    @Override
    public void turnOff() {
        oldDevice.powerOff();
    }
}
