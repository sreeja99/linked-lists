package com.capgemini.linkedlist;

public class MyLinkedList {
	public INode head;
	public INode tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if(this.tail == null)
			this.tail = newNode;
		if(this.head == null)
			this.head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey());
			if(!(tempNode.equals(tail))) 
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
}
