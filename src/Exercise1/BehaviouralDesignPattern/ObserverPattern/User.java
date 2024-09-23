package Exercise1.BehaviouralDesignPattern.ObserverPattern;

public class User implements Observer {
    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    @Override
    public void update(String productId, String message) {
        // Notify user by email (simulated here by a print statement)
        System.out.println("Sending email to " + email + ": " + message);
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }
}

