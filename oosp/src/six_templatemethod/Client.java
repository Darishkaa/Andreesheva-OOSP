package six_templatemethod;

public class Client {
    public static void main(String[] args) {
        ReportGenerator graphReport = new GraphReport();
        ReportGenerator textReport = new TextReport();
        ReportGenerator tableReport = new TableReport();

        System.out.println("Generating Graph Report:");
        graphReport.generateReport();

        System.out.println("\nGenerating Text Report:");
        textReport.generateReport();

        System.out.println("\nGenerating Table Report:");
        tableReport.generateReport();
    }
}
