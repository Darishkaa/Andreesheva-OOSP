package two_abstractfactory;

public class BMWEngine implements Engine {
    @Override
    public void assemble() {
        System.out.println("Сборка двигателя для BMW.");
    }
}
