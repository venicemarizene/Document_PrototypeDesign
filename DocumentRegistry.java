public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("default.pdf", "Unknown", 0, "Default PDF");

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument("default.txt", "UTF-8", 0);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("default.xlsx", 0, 0);

        System.out.println();
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setAuthor(author);
        doc.setPageCount(pageCount);
        return doc;
    }

    public TextDocument createTextDocument(String filePath, int wordCount) {
        TextDocument doc = (TextDocument) textDocumentPrototype.clone();
        doc.setFilePath(filePath);
        doc.setWordCount(wordCount);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int columns) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setSpreadsheetName(name);
        doc.setRowCount(rows);
        doc.setColumnCount(columns);
        return doc;
    }
}