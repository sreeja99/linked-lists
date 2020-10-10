package com.capgemini.linkedlist;

public interface INode<E> {
	E getKey();
	void setKey(E key);
	void setNext(INode next);
	INode getNext();
}
