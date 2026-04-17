public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    private TextDocument(TextDocument other) {
        this.filePath = other.filePath;
        this.encoding = other.encoding;
        this.wordCount = other.wordCount;
    }

    public void setFilePath(String filePath) { this.filePath = filePath; }
    public void setWordCount(int wordCount) { this.wordCount = wordCount; }
    public String getFilePath() { return filePath; }
    public String getEncoding() { return encoding; }
    public int getWordCount() { return wordCount; }

    @Override
    public Document clone() {
        return new TextDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
        System.out.println();
    }

    @Override
    public String getType() {
        return "Text";
    }
}