package Exercise1.CreationalDesignPattern.FactoryPattern;

public class NotificationSystem {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Send an Email Notification
        Notification emailNotification = factory.createNotification("Email");
        emailNotification.notifyUser();  // Output: Sending an Email Notification

        // Send an SMS Notification
        Notification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();  // Output: Sending an SMS Notification

        // Send a Push Notification
        Notification pushNotification = factory.createNotification("Push");
        pushNotification.notifyUser();  // Output: Sending a Push Notification
    }
}
