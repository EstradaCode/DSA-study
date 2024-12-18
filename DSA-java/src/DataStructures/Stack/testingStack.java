package DataStructures.Stack;

public class testingStack {
    public static void main(String[] args) {
        ArrayStack<Integer> pila = new ArrayStack<>(2);
        System.out.println(pila.isEmpty());
        pila.push(10);
        pila.push(3);
        pila.push(5);
    }
}
