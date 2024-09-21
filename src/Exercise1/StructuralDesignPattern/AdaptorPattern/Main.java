package Exercise1.StructuralDesignPattern.AdaptorPattern;

public class Main {
    public static void main(String[] args) {
        // Example usage of the factory


        DocumentViewer imageViewer = DocumentViewerFactory.getDocumentViewer("image", "photo.jpg");
        imageViewer.openDocument();
        imageViewer.saveDocument();
        imageViewer.closeDocument();
    }
}
