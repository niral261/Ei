package Exercise1.StructuralDesignPattern.AdaptorPattern;

public class DocumentViewerFactory {
    public static DocumentViewer getDocumentViewer(String type, String fileName) {
        switch (type.toLowerCase()) {
            case "image":
                return new ImageDocumentViewer(fileName);
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
