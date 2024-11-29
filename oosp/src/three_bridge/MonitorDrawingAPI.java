package three_bridge;

public class MonitorDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing Circle on Monitor at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawSquare(double x, double y, double sideLength) {
        System.out.println("Drawing Square on Monitor at (" + x + ", " + y + ") with side length " + sideLength);
    }

    @Override
    public void drawTriangle(double x, double y, double base, double height) {
        System.out.println("Drawing Triangle on Monitor at (" + x + ", " + y + ") with base " + base + " and height " + height);
    }
}
