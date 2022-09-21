package linkedlist;
import java.util.*;

/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author rkelley/njohnson/JPThomas
 * Programming Project 1 Start Project
 * CS131ON
 */

public class GenericLinkedList<T> implements Queue<T> {


	private GenericNode<T> head; //node to represent the head of the list
	private GenericNode<T> tail;  //node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		return (head==null) && (tail == null);
		
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return
	 */
	
	public GenericNode<T> getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param GenericNode<T> aNode
	 */
	
	
	public void addNode(GenericNode<T> aNode){
		
		if (isEmpty() ) {
			
			head = aNode;
			tail=head;
			
		}
		
		
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode

	@Override
	public String toString() {
	return "GenericLinkedList [head="+ head.getData() + ", tail=" + tail.getData() + ", length=" + length + "]";
	}//end toString

	
	@Override
	public void enqueue(T newEntry) {
		
		GenericNode<T> newNode = new GenericNode<T>(newEntry, null);
		newNode.setNextNode(head);
		
		if (isEmpty())
			head = newNode;
		
		else
			tail.setNextNode(newNode);
		tail = newNode;
		
	addNode(newNode);
	
	}//end enqueue

	@Override
	public T dequeue() {
		
	 T front = getFront(); 
		head.setData(null);
		head = head.getNextNode();
		
		if (head == null)
			tail = null;
		length--;
		return (T) front;
	}//end dequeue

	@Override
	public T getFront() {
		if (isEmpty())
			throw new EmptyStackException();
		else 
			return head.getData();
	}//end getFront


}//end class
