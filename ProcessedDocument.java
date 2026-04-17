public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        PdfDocument pdf1 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();

        TextDocument text1 = registry.createTextDocument("meeting_notes.txt", 250);
        text1.open();

        SpreadsheetDocument sheet1 = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        sheet1.open();

        PdfDocument pdf2 = registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        System.out.println("Opening PDF Document: " + pdf2.getFileName() + " by " + pdf2.getAuthor() + " (" + pdf2.getPageCount() + " pages)");
    }
}