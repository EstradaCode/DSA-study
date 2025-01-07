package DataStructures.Queue;

import DataStructures.Stack.StackEmptyException;
import DataStructures.Stack.StackFullException;

public class ArrayQueue<T>  implements Queue<T>{
    private static final int  CAPACIDAD=1000;
    private int front;
    private int back;
    private T[] queue;
    private int maximaCapacidad;
    // posible expansión, resize()

    public ArrayQueue(){
        this(CAPACIDAD);
    }
    public ArrayQueue(int maximaCapacidad) {
        queue= (T[]) new Object [maximaCapacidad];
        this.maximaCapacidad = maximaCapacidad;
        this.front=0;
        this.back=0;

    }

    @Override
    public T front() throws QueueEmptyException {
        return null;
    }

    @Override
    public void enqueue(T elem) {
        if(back >= maximaCapacidad ){
            throw new QueueFullException("Error! cola llena!");
        }
        queue[back]=elem;
        back++;
    }

    @Override
    public T dequeue() throws QueueEmptyException {
        T elem;
        if(isEmpty()){
            throw new QueueEmptyException("Error! cola vacia!");
        }
        elem = queue[front];
        front++;
        return elem;
    }

    @Override
    public int size() {
        return back-front;
    }

    @Override
    public boolean isEmpty() {
        return front==back;
    }
}
