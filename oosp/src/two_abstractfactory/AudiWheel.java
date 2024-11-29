package two_abstractfactory;

public class AudiWheel implements Wheel {
    @Override
    public void assemble() {
        System.out.println("Сборка колеса для Audi.");
    }
}
