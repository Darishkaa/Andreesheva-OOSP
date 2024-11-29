package one_factorymethod;

public class RectangleFactory extends ShapeFactory {
    @Override
    protected Shape create() {
        return new Rectangle();
    }
}
