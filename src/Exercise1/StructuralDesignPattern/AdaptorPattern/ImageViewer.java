package Exercise1.StructuralDesignPattern.AdaptorPattern;

public class ImageViewer {
    public void loadImage(String fileName) {
        System.out.println("Loading image: " + fileName);
    }

    public void closeImage() {
        System.out.println("Closing image.");
    }
}
