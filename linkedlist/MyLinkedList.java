package com.capgemini.linkedlist;

public class MyLinkedList<K> {
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
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
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

	public void insert(INode myNode,INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public void append(INode newNode) {
		if(this.tail == null)
			this.tail = newNode;
		if(this.head == null)
			this.head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	public INode pop() {
		INode tempNode =head.getNext();
		this.head=head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode =head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode=tempNode.getNext();
		}
		this.tail=tempNode;
		tempNode=tempNode.getNext();
		return tempNode;
	}

	public INode search(K key) {
		INode tempNode = head;
		while(tempNode!=null&&tempNode.getNext()!=null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			else 
				tempNode = tempNode.getNext();	
		}
		return null;
	}

	public INode searchAndInsert(K key, INode newNode) {
		INode tempNode = head;
		while(tempNode!=null&&tempNode.getNext()!=null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			else 
				tempNode = tempNode.getNext();	
		}
		INode tempNode2 =tempNode.getNext();
		tempNode.setNext(newNode);
		newNode.setNext(tempNode2);
		return tempNode;
	}
	
}
