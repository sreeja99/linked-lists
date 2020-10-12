package com.capgemini.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyBinaryTreeTest {

	@Test
	void whenAddedThreeNumbersItShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree=new 	MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size=myBinaryTree.getsize();
		Assert.assertEquals(3,size);
	}

}
