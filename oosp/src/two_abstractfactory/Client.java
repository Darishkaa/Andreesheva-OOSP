package two_abstractfactory;

public class Client {
    private Engine engine;
    private Wheel wheel;
    private Body body;

    public Client(CarFactory factory) {
        engine = factory.createEngine();
        wheel = factory.createWheel();
        body = factory.createBody();
    }

    public void assembleCar() {
        engine.assemble();
        wheel.assemble();
        body.assemble();
    }

    public static void main(String[] args) {
        CarFactory bmwFactory = new BMWFactory();
        Client bmwClient = new Client(bmwFactory);
        bmwClient.assembleCar();

        CarFactory audiFactory = new AudiFactory();
        Client audiClient = new Client(audiFactory);
        audiClient.assembleCar();
    }
}
