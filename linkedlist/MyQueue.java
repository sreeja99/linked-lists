package com.capgemini.linkedlist;

public class MyQueue {
	private MyLinkedList myLinkedList;
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}
	public void printQueue() {
		myLinkedList.printMyNodes();
	}

}
