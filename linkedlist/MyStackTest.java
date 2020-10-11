package com.capgemini.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyStackTest {

	@Test
	public void givenThreeNumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		myStack.printStack();
		assertEquals(myThirdNode, myNode);
	}
	@Test
	public void popStackTillItsEmpty() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.pop();
		assertEquals(myThirdNode, myNode);
		System.out.print("Popped Node: "+myNode.getKey()+ " .New Stack -> ");
		myStack.printStack();
	}
	@Test
	public void PeekTillItsEmpty() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		assertEquals(myThirdNode, myNode);
		System.out.println("Peeking: "+myNode.getKey());
	}
}
