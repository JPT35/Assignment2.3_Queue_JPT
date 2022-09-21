package linkedlist;

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/JPThomas
 * Programming Project 1 Start Project
 * CS131ON
 */

public class GenericNode<T> {

	
	protected T data;  //data that the object stores
	protected GenericNode<T> next; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	protected GenericNode(T dataPortion) {
		this(dataPortion, null);
		
	}//end constructor
	
	protected GenericNode(T dataPortion, GenericNode<T> nextNode){
		
		next = nextNode;
		data=dataPortion;
	}//end empty-argument constructor

	/**
	 * This method sets the data of the object.
	 * @param T data
	 */
	public void setData(T newData) {
		data=newData;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	
	public GenericNode<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode<T> nextNode)
	{
		next=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer 
	 * @return Node object
	 */
	
	public GenericNode <T>getNextNode() {
		return next;
	}//end getNextNode

	
}//end class
