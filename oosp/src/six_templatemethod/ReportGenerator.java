package six_templatemethod;

public abstract class ReportGenerator {
    public final void generateReport() {
        collectData();
        processData();
        formatReport();
        printReport();
    }

    protected abstract void collectData();
    protected abstract void processData();
    protected abstract void formatReport();
    protected abstract void printReport();
}
