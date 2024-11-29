package eleven_prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Radius " + radius + " and color " + getColor());
    }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }
}
