package DataStructures.Queue;

public interface Queue <T> {
    int size();
    boolean isEmpty();
    T front() throws QueueEmptyException;
    void enqueue(T elem);
    T dequeue() throws QueueEmptyException;

}
