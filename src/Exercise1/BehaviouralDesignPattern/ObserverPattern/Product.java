package Exercise1.BehaviouralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productId;
    private String productName;
    private boolean available;
    private List<Observer> observers;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        this.available = false; // Initially unavailable
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(productId, productName + " is now available!");
        }
    }

    // Method to change product availability
    public void setAvailability(boolean available) {
        this.available = available;
        if (available) {
            notifyObservers();
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}