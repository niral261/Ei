package Exercise1.StructuralDesignPattern.AdaptorPattern;

public abstract class DocumentViewer {
    // Factory method
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }

    public void closeDocument() {
        Document doc = createDocument();
        doc.close();
    }

    public void saveDocument() {
        Document doc = createDocument();
        doc.save();
    }
}
