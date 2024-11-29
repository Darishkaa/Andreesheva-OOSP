package two_abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Wheel createWheel();
    Body createBody();
}
