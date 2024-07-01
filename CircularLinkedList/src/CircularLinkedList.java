// Definition of the CircularLinkedList class
public class CircularLinkedList {
    // Pointer to the head node of the list
    private Node head;

    // Constructor to initialize an empty list
    public CircularLinkedList() {
        head = null;
    }
    
    
    

    // Method to insert a new node at the end of the list
    public boolean insert(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);
        // If newNode creation fails (out of memory), return false
        if (newNode == null) {
            return false;
        }

        // If the list is empty, set head to the new node and make it circular
        if (head == null) {
            head = newNode;
            head.setNext(head);
            return true;
        }

        // Find the last node in the list
        Node last = head;
        while (last.getNext() != head) {
            last = last.getNext();
        }

        // Insert the new node at the end and update the links
        last.setNext(newNode);
        newNode.setNext(head);
        return true;
    }

    
    
    
    // Method to insert a new node at a specific position
    public boolean insert(int data, int position) {
        // Validate the position
        if ((head == null && position > 1) || position <= 0) {
            return false;
        }

        // Create a new node with the given data
        Node newNode = new Node(data);

        // If inserting at the first position
        if (position == 1) {
            // If the list is empty, initialize it with the new node
            if (head == null) {
                head = newNode;
                head.setNext(head);
                return true;
            }

            // Find the last node to update its next pointer
            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }

            // Insert the new node at the beginning and update the links
            newNode.setNext(head);
            head = newNode;
            last.setNext(newNode);
            return true;
        }

        // Traverse to the position before the desired position
        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            // If position is out of bounds, return false
            if (prev == head) {
                return false;
            }
        }

        // Insert the new node and update the links
        newNode.setNext(prev.getNext());
        prev.setNext(newNode);
        return true;
    }

    
    
    
    // Method to delete a node by its value
    public boolean deleteByVal(int data) {
        // If the list is empty, return false
        if (head == null) {
            return false;
        }

        // If the node to delete is the head node
        if (head.getData() == data) {
            // If there's only one node, remove it
            if (head.getNext() == head) {
                head = null;
                return true;
            }

            // Find the last node to update its next pointer
            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }
            // Remove the head node and update the links
            head = head.getNext();
            last.setNext(head);
            return true;
        }

        // Traverse the list to find the node to delete
        Node prev = head, del = head;
        while (del.getData() != data) {
            prev = del;
            del = del.getNext();
            // If the node is not found, return false
            if (del == head) {
                return false;
            }
        }

        // Delete the node and update the links
        prev.setNext(del.getNext());
        return true;
    }

    
    
    
    
    // Method to delete a node by its position
    public boolean deleteByPosition(int position) {
        // If the list is empty or position is invalid, return false
        if (head == null || position <= 0) {
            return false;
        }

        // If deleting the first node
        if (position == 1) {
            // If there's only one node, remove it
            if (head.getNext() == head) {
                head = null;
                return true;
            }
            // Find the last node to update its next pointer
            Node last = head;
            while (last.getNext() != head) {
                last = last.getNext();
            }
            // Remove the head node and update the links
            head = head.getNext();
            last.setNext(head);
            return true;
        }

        // Traverse to the position before the node to delete
        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            // If position is out of bounds, reprivate turn false
            if (prev.getNext() == head) {
                return false;
            }
        }

        // Delete the node and update the links
        Node del = prev.getNext();
        prev.setNext(del.getNext());
        return true;
    }
    
    
    

    // Method to display the elements of the list
    public void display() {
        // If the list is empty, return
        if (head == null) {
            return;
        }
        // Traverse and print each node's data
        Node temp = head;
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        } while (temp != head);
        System.out.println();
    }

}
