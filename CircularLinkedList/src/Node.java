// Definition of the Node class
public class Node {
    // Data stored in the node
    private int data;
    // Reference to the next node in the list
    private Node next;

    // Constructor to initialize the node with data and set next to null
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Getter method to return the data in the node
    public int getData() {
        return data;
    }

    // Setter method to set the data in the node
    public void setData(int data) {
        this.data = data;
    }

    // Getter method to return the next node in the list
    public Node getNext() {
        return next;
    }

    // Setter method to set the next node in the list
    public void setNext(Node next) {
        this.next = next;
    }
}