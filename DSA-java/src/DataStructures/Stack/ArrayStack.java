package DataStructures.Stack;

public class ArrayStack<T> implements Stack<T> {
    private static final int  CAPACIDAD=1000;
    private int tope=-1;
    private T[] stack;
    private int maximaCapacidad;
    // posible expansión, resize()

    public ArrayStack(){
        this(CAPACIDAD);
    }
    public ArrayStack(int maximaCapacidad) {
        stack= (T[]) new Object [maximaCapacidad];
        this.maximaCapacidad = maximaCapacidad;

    }

    @Override
    // puede causar una excepcion
    public T top() throws StackEmptyException{
        if(isEmpty())
            throw new StackEmptyException("Error con el tope! Pila vacia");
        return stack[tope];
    }

    @Override
    public void push (T item) throws StackFullException{
        if(tope+1>=maximaCapacidad)
            throw new StackFullException("ERROR! PILA llena, imposible añadir el  elemento " + item.toString());
        stack[++tope]=item;
    }

    @Override
    // puede causar excepcion
    public T pop() throws StackEmptyException{
        if(isEmpty())
            throw new StackEmptyException("Error en el pop! Pila vacia");
        T elemento= stack[tope];
        stack[tope--]=null;
        return elemento;
    }

    @Override
    public int size() {
        return tope+1;
    }

    @Override
    public boolean isEmpty() {
        return (tope<0);
    }
}
