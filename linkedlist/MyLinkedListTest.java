package com.capgemini.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	public void givenThreeNumbersShouldBeAddedOnTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
	}
	@Test
	public void givenThreeNumbersShouldAppendFromLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
	}
	@Test
	public void insertSecondNumberBetweenFirstAndThird() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
	}
	@Test
	public void delFirstElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		MyNode<Integer> pop = (MyNode<Integer>) myLinkedList.pop();
		assertEquals(mySecondNode, pop);
		myLinkedList.printMyNodes();
	}
	@Test
	public void DelLastElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> popLast = (MyNode<Integer>) myLinkedList.popLast();
		assertEquals(myThirdNode, popLast);
		myLinkedList.printMyNodes();
	}
	@Test
	public void searchForThirtyKeyValue() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> search = (MyNode<Integer>) myLinkedList.search(30);
		assertEquals(mySecondNode, search);
		myLinkedList.printMyNodes();
	}
	@Test
	public void searchAndInsertForty() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(40);
		MyNode<Integer> searchAndInsert = (MyNode<Integer>) myLinkedList.searchAndInsert(30,myFourthNode);
		assertEquals(mySecondNode, searchAndInsert);
		myLinkedList.printMyNodes();
	}
	@Test 
	public void delTheFortyAndShowTheSizeOfTheLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		MyNode<Integer> searchAndDelete = (MyNode<Integer>) myLinkedList.searchAndDelete(40);
		assertEquals(mySecondNode, searchAndDelete);
		System.out.println("Size of Linked List is:"+myLinkedList.size());
		myLinkedList.printMyNodes();
	}
	@Test
	public void PrintOrderedLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(100);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(5);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addSorted(myFirstNode);
		myLinkedList.addSorted(mySecondNode);
		myLinkedList.addSorted(myThirdNode);
		myLinkedList.addSorted(myFourthNode);
		myLinkedList.printMyNodes();
		System.out.print("Sorted Nodes :");
		boolean result = myLinkedList.head.equals(myFourthNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.head.getNext().getNext().equals(myFirstNode)
				&& myLinkedList.head.getNext().getNext().getNext().equals(myThirdNode);
		assertEquals(true, result);

	}

}
