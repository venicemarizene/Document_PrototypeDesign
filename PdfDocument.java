public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument(String fileName, String author, int pageCount, String name) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        this.name = name;
    }

    private PdfDocument(PdfDocument other) {
        this.fileName = other.fileName;
        this.author = other.author;
        this.pageCount = other.pageCount;
        this.name = other.name;
    }

    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setAuthor(String author) { this.author = author; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    public String getFileName() { return fileName; }
    public String getAuthor() { return author; }
    public int getPageCount() { return pageCount; }
    public String getName() { return name; }

    @Override
    public Document clone() {
        return new PdfDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
        System.out.println();
    }

    @Override
    public String getType() {
        return "PDF";
    }
}