public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    private SpreadsheetDocument(SpreadsheetDocument other) {
        this.spreadsheetName = other.spreadsheetName;
        this.rowCount = other.rowCount;
        this.columnCount = other.columnCount;
    }

    public void setSpreadsheetName(String spreadsheetName) { this.spreadsheetName = spreadsheetName; }
    public void setRowCount(int rowCount) { this.rowCount = rowCount; }
    public void setColumnCount(int columnCount) { this.columnCount = columnCount; }
    public String getSpreadsheetName() { return spreadsheetName; }
    public int getRowCount() { return rowCount; }
    public int getColumnCount() { return columnCount; }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
        System.out.println();
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
}