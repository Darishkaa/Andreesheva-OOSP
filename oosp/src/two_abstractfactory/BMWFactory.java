package two_abstractfactory;

public class BMWFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public Wheel createWheel() {
        return new BMWWheel();
    }

    @Override
    public Body createBody() {
        return new BMWBody();
    }
}
