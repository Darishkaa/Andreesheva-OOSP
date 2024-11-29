package three_bridge;

public class Square extends Shape {
    private double x, y, sideLength;

    public Square(double x, double y, double sideLength, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        drawingAPI.drawSquare(x, y, sideLength);
    }
}
