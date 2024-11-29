package six_templatemethod;

public class TextReport extends ReportGenerator {
    @Override
    protected void collectData() {
        System.out.println("Collecting data for text report.");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for text report.");
    }

    @Override
    protected void formatReport() {
        System.out.println("Formatting text report.");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing text report.");
    }
}
