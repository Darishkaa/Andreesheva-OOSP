package twelve_composite;

public class Client {
    public static void main(String[] args) {
        Graphic circle = new Circle();
        Graphic square = new Square();
        Graphic triangle = new Triangle();

        CompositeGraphic composite1 = new CompositeGraphic();
        composite1.add(circle);
        composite1.add(square);

        CompositeGraphic composite2 = new CompositeGraphic();
        composite2.add(triangle);
        composite2.add(composite1);

        System.out.println("Drawing composite2:");
        composite2.draw();
    }
}
