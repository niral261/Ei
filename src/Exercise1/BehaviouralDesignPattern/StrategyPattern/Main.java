package Exercise1.BehaviouralDesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe"));
        cart.checkout(100.00);

        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        cart.checkout(250.00);

        cart.setPaymentStrategy(new GooglePayPayment("+1234567890"));
        cart.checkout(75.50);
    }
}
