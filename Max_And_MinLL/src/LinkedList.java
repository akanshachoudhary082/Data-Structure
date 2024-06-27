import java.util.NoSuchElementException;


public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}
	
	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return true;
		}
		
		Node temp = head;
		while(temp!=null) {
			if(temp.getData()==data) {
				return false;
			}
			if(temp.getNext()==null) {
				temp.setNext(newNode);
				return true;
			} 
			temp=temp.getNext();
		}
		return false;
	}
	
	 
	// Method to find the maximum value in the linked list
	public int findMax() {
        if (head == null) {
            throw new NoSuchElementException("Linked list is empty");
        }
	
	int max = head.getData();
	Node temp = head.getNext();
	while(temp!=null) {
		if(temp.getData() > max) {
			 max = temp.getData();
		}
		temp=temp.getNext();
	}
	return max;
}
	
	 public int findMin() {
	        if (head == null) {
	            throw new NoSuchElementException("Linked list is empty");
	        }
	
		int min = head.getData();
		Node temp = head.getNext();
		while(temp!=null) {
			if(temp.getData()<min) {
				min=temp.getData();
			}
			temp = temp.getNext();
		}
		return min;
		
	}
	
	public int sumOfEvenNumbers() {
		int sum = head.getData();
		Node temp = head.getNext();
		
		while(temp!=null) {
			if(temp.getData()%2==0) {
				sum +=temp.getData();
			}
			temp = temp.getNext();
		}
		return sum;
		
	}
	
	public void display() {
		
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}