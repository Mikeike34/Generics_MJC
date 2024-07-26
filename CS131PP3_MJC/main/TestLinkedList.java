package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>(new GenericNode(20, null),new GenericNode(30, null), 2);
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>(new GenericNode(2.2,null), new GenericNode(5.5,null), 2);
		GenericLinkedList<String> stringList = new GenericLinkedList<String>(new GenericNode("Head", null), new GenericNode("Tail", null), 2);
		
		
		System.out.println("\n==============Testing Generic intList=============="+"\n"+intList.isEmpty());
		System.out.println(intList.getList().getData());
		
		
		System.out.println("\n==============Testing Generic doubleList=============="+"\n"+doubleList.isEmpty());
		System.out.println(doubleList.getList().getData());
		
		System.out.println("\n==============Testing Generic stringList=============="+"\n"+stringList.isEmpty());
		System.out.println(stringList.getList().getData());
		
		
		
	}//end main

}//end class
