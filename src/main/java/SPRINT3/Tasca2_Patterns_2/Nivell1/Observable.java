package SPRINT3.Tasca2_Patterns_2.Nivell1;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void listObservers();
    void notifyAllObservers();
}
