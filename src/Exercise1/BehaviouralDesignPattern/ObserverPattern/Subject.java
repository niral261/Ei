package Exercise1.BehaviouralDesignPattern.ObserverPattern;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
