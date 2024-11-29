package two_abstractfactory;

public class AudiEngine implements Engine {
    @Override
    public void assemble() {
        System.out.println("Сборка двигателя для Audi.");
    }
}
