package linkedlist;
/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/mcantone
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
	private T data;  //data that the object stores
	private GenericNode<T> nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * being any type of data.
	 */
	public GenericNode(T data, GenericNode<T> nextNode)
	{
		setNextNode(nextNode);
		this.data=data;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode<T> getNode() {
		return (GenericNode<T>) this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode<T> nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;
	}//end getNextNode


}
