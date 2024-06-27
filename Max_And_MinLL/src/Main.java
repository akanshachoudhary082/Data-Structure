
public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(5);
		list.insert(15);
		list.insert(25);
		list.insert(25);
		list.insert(30);
		//list.display();
		
		
		int sumEven = list.sumOfEvenNumbers();
        System.out.println("Sum of even numbers in the linked list: " + sumEven);

        
        int max = list.findMax();
       System.out.println("maxium value in the linked list:"+max);
       
       int min  = list.findMin();
       System.out.println("min value in linked list :"+min);
	}
}
