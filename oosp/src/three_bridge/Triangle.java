package three_bridge;

public class Triangle extends Shape {
    private double x, y, base, height;

    public Triangle(double x, double y, double base, double height, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        drawingAPI.drawTriangle(x, y, base, height);
    }
}
