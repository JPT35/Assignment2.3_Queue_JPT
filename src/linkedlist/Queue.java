package linkedlist;

public interface Queue<T> {

	/**
	 *  Adds new entry to the tail node, or the back of the queue
	 *  
	 *  @param newEntry
	 */
	
	public void enqueue(T newEntry);
	
	
	/**
	 * Removes and returns the entry at the front of the queue
	 * @return object at front of queue
	 * @throws EmptyQueueException if queue is empty before the operation
	 * 
	 */
	public T dequeue();
	
	
	/**
	 * Retrieves the entry at the front of the queue
	 * @return object at front of queue
	 * @throws EmptyQueueException if queue is empty
	 * 
	 */
	public T getFront();
	
	
	/**
	 * Detects whether this queue is empty
	 * @return true if queue is empty, false if not
	 * 
	 */
	public boolean isEmpty();
	

}//end interface
