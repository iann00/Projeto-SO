package jrx;

public interface Observable<T> {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers(T data);
}
