package two_abstractfactory;

public class AudiFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Wheel createWheel() {
        return new AudiWheel();
    }

    @Override
    public Body createBody() {
        return new AudiBody();
    }
}
