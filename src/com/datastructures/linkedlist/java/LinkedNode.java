package com.datastructures.linkedlist.java;

/**
 * This class will be used to create and initialize a LinkedNode
 * @author jang
 *
 */
public class LinkedNode {


	/**
	 * create a node
	 * 
	 * +----------+--------+                    
	 * |          |        | 
	 * |  data    | next   |   -------> null
	 * |          |        |
	 * +----------+--------+
	 */
	
	int data;
	LinkedNode next;
	
	/**
	 * constructor
	 * @param next
	 * @param data
	 */
	public LinkedNode(LinkedNode next, int data) {
		super();
		this.next = null;
		this.data = data;
	}
	
}
