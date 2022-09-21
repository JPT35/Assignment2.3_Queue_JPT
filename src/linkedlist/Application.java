package linkedlist;

public class Application {

	public static void main(String[] args) {
	
		Queue<String> customerLine = new GenericLinkedList<String>();
	
	System.out.println("Bill is in line");	
		customerLine.enqueue("Bill");
	System.out.println("Alice is in line");
		customerLine.enqueue("Alice");
	System.out.println("Bob is in line");	
		customerLine.enqueue("Bob");
	System.out.println();
	System.out.println(customerLine);
	System.out.println();
	
	System.out.println("The front of the line is: "+customerLine.getFront());
	System.out.println(customerLine);
	System.out.println();
	
	System.out.println("A customer is served: "+customerLine.dequeue());
	System.out.println(customerLine);
		
	System.out.println("The front of the line is: "+customerLine.getFront());
	System.out.println();
	
	System.out.println("Jane has arrived");
		customerLine.enqueue("Jane");
		System.out.println(customerLine);
	System.out.println("Hamad arrives");
		customerLine.enqueue("Hamad");
		System.out.println(customerLine);
	System.out.println();
		
	System.out.println("Two cusomters are served: "+customerLine.dequeue()+", "+customerLine.getFront());
		customerLine.dequeue();
		System.out.println(customerLine);
		System.out.println();
	
	System.out.println("The front of the line is: "+customerLine.getFront());
		
	
	System.out.println(customerLine);
	
	
		
	}//end main method

}//end class
