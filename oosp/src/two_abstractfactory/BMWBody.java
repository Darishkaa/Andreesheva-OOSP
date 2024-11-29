package two_abstractfactory;

public class BMWBody implements Body {
    @Override
    public void assemble() {
        System.out.println("Сборка кузова для BMW.");
    }
}
