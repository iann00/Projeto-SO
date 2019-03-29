package jrx;

public interface Observer<T> {
    void onEvent(T data);
}
