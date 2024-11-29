package ten_facade;

public class HomeFacade {
    private Light light;
    private Thermostat thermostat;
    private AudioSystem audioSystem;

    public HomeFacade() {
        this.light = new Light();
        this.thermostat = new Thermostat();
        this.audioSystem = new AudioSystem();
    }

    public void startEveningMode() {
        System.out.println("Starting Evening Mode...");
        light.turnOn();
        thermostat.setTemperature(22);
        audioSystem.playMusic();
    }

    public void stopEveningMode() {
        System.out.println("Stopping Evening Mode...");
        audioSystem.stopMusic();
        light.turnOff();
    }
}
