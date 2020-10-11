package com.capgemini.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyQueueTest {

	@Test
	public void CreateSimpleQueue() {
		MyQueue myQueue =new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printQueue();
		assertEquals((int)myThirdNode.getKey(), 70);
	}
	@Test
	public void dequeueFromTheBeginnig() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.dequeue();
		assertEquals((int)myFirstNode.getKey(), 56);
	}
}
