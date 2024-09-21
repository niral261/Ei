package Exercise1.StructuralDesignPattern.AdaptorPattern;

public class ImageDocumentViewer extends DocumentViewer {
    private String fileName;

    public ImageDocumentViewer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Document createDocument() {
        return new ImageAdapter(new ImageViewer(), fileName);
    }
}