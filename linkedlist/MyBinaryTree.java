package com.capgemini.linkedlist;

public class MyBinaryTree <K extends Comparable<K>>{
	private MyBinaryNode<K> root;
	private MyBinaryNode<K> searchNode ;
	private MyBinaryNode<K> tempNode ;
	//adding given value
	public void add(K key) {
		this.root=this.addRecursively(root,key);
	}
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current==null)
				return new MyBinaryNode<>(key);
		int compareResult=key.compareTo(current.key);
		if(compareResult==0)
			return current;
		if(compareResult>0) 
			{
				current.left = addRecursively(current.left, key);
			} else {
				current.right = addRecursively(current.right, key);
			}
		return current;
	}
	private int getRecursiveSize(MyBinaryNode<K> current) {
		return current ==null?0:1+this.getRecursiveSize(current.left)+this.getRecursiveSize(current.right);
	}
	//printing size of a tree
	public int getSize() {
		return this.getRecursiveSize(root);
	}
	public MyBinaryNode<K> search(K key) {
		int compareResult = key.compareTo(tempNode.key);
		if(compareResult==0) {
			searchNode = tempNode;
			return searchNode;
		}
		if(compareResult>0) {
			tempNode = tempNode.right;
			searchNode = search(key);
		}
		if(compareResult<0) {
			tempNode = tempNode.left;
			searchNode = search(key);
		}
		return searchNode;
	}
	
	
}
