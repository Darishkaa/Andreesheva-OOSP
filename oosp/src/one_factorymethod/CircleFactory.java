package one_factorymethod;

public class CircleFactory extends ShapeFactory {
    @Override
    protected Shape create() {
        return new Circle();
    }
}
