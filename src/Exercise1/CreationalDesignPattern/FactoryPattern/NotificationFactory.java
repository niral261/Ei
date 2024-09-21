package Exercise1.CreationalDesignPattern.FactoryPattern;

public class NotificationFactory {
    public Notification createNotification(String notificationType) {
        if(notificationType==null)
            return null;

        if(notificationType.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if(notificationType.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if(notificationType.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        return null;
    }
}
