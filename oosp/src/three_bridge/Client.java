package three_bridge;

public class Client {
    public static void main(String[] args) {
        DrawingAPI monitorAPI = new MonitorDrawingAPI();
        DrawingAPI printerAPI = new PrinterDrawingAPI();

        Shape circle = new Circle(10, 10, 5, monitorAPI);
        circle.draw();

        Shape square = new Square(20, 20, 10, printerAPI);
        square.draw();

        Shape triangle = new Triangle(15, 15, 8, 6, monitorAPI);
        triangle.draw();
    }
}
