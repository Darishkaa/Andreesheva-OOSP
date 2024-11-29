package six_templatemethod;

public class GraphReport extends ReportGenerator {
    @Override
    protected void collectData() {
        System.out.println("Collecting data for graph report.");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for graph report.");
    }

    @Override
    protected void formatReport() {
        System.out.println("Formatting graph report.");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing graph report.");
    }
}
