package two_abstractfactory;

public class BMWWheel implements Wheel {
    @Override
    public void assemble() {
        System.out.println("Сборка колеса для BMW.");
    }
}
