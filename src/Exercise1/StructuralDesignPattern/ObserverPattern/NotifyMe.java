package Exercise1.StructuralDesignPattern.ObserverPattern;

public class NotifyMe {
    public static void main(String[] args) {
        // Create product
        Product product = new Product("P1001", "Smartphone");

        User user1 = new User("U001", "user1@example.com");
        User user2 = new User("U002", "user2@example.com");

        product.registerObserver(user1);
        product.registerObserver(user2);

        System.out.println("Product initially unavailable.");
        System.out.println("Updating product availability...");
        product.setAvailability(true);
    }
}
