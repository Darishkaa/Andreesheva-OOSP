package one_factorymethod;

public class TriangleFactory extends ShapeFactory {
    @Override
    protected Shape create() {
        return new Triangle();
    }
}
