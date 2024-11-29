package eleven_prototype;

public class Client {
    public static void main(String[] args) {
        Circle originalCircle = new Circle("Red", 10);
        Rectangle originalRectangle = new Rectangle("Blue", 20, 30);

        Circle clonedCircle = originalCircle.clone();
        Rectangle clonedRectangle = originalRectangle.clone();

        System.out.println("Круг:");
        originalCircle.draw();

        System.out.println("Круг-копия:");
        clonedCircle.setColor("Green");
        clonedCircle.setRadius(15);
        clonedCircle.draw();

        System.out.println("\n");
        System.out.println("Квадрат:");
        originalRectangle.draw();

        System.out.println("Квадрат-копия:");
        clonedRectangle.setColor("Yellow");
        clonedRectangle.setWidth(25);
        clonedRectangle.setHeight(35);
        clonedRectangle.draw();
    }
}
