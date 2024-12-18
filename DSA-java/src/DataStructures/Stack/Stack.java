package DataStructures.Stack;

public interface Stack<T> {
    T top();
    void push(T item);
    T pop();
    int size();
    boolean isEmpty();

}
