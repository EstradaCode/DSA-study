package DataStructures.List;

public class Node<T> {
    private T element;
    private Node next;

    public Node(){
        this(null,null);
    }
    public Node(T elem, Node n){
        this.element= elem;
        this.next= n;
    }
    public T getElement(){
        return element;
    }
    public Node getNext(){
        return next;
    }
    public void setElement(T element){
        this.element= element;
    }
    public void setNext(Node next){
        this.next= next;
    }
}
