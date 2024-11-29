package six_templatemethod;

public class TableReport extends ReportGenerator {
    @Override
    protected void collectData() {
        System.out.println("Collecting data for table report.");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for table report.");
    }

    @Override
    protected void formatReport() {
        System.out.println("Formatting table report.");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing table report.");
    }
}
