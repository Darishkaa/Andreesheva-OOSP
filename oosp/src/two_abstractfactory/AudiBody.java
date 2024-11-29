package two_abstractfactory;

public class AudiBody implements Body {
    @Override
    public void assemble() {
        System.out.println("Сборка кузова для Audi.");
    }
}
