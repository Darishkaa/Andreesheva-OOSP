package one_factorymethod;

public abstract class ShapeFactory {
    public Shape createShape() {
        Shape shape = create();
        return shape;
    }

    protected abstract Shape create();
}
