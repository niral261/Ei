package Exercise1.StructuralDesignPattern.AdaptorPattern;

public class ImageAdapter implements Document {
    private ImageViewer imageViewer;
    private String fileName;

    public ImageAdapter(ImageViewer imageViewer, String fileName) {
        this.imageViewer = imageViewer;
        this.fileName = fileName;
    }

    @Override
    public void open() {
        imageViewer.loadImage(fileName);
    }

    @Override
    public void close() {
        imageViewer.closeImage();
    }

    @Override
    public void save() {
        System.out.println("Save operation is not supported for images.");
    }
}

