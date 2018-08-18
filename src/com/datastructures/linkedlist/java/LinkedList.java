package com.datastructures.linkedlist.java;


/**
 * preparing customized linked list 
 * with different operations
 * @author jang
 *
 */
public class LinkedList {


	/**
	 * this method creates a linked list
	 * @param root
	 * @param data
	 * @return 
	 */
	public static LinkedNode insert(LinkedNode root, int data) {

		// create a new node
		LinkedNode temp = new LinkedNode(null, data);
		
		if (null == root) {
			root = temp;
		} else {
			temp.next = root;
			root = temp; 
		}
		
		return root;
	}
	
	/**
	 * this method prints the linked list
	 * @param root
	 */
	public static void printLinkedList(LinkedNode root) {
		while (root != null) {
			
			System.out.print(root.data + " ");
			root = root.next;
		}
	}
	
	/**
	 * this method prints the linked list using recursion
	 * @param root
	 */
	public static void printLinkedListUsingRecursion(LinkedNode root) {
		if (root != null) {
			
			System.out.print(root.data + " ");
			printLinkedListUsingRecursion(root.next);
		}
	}
	
	/**
	 * this method prints the linked list using recursion in reverse order
	 * @param root
	 */
	public static void reversePrintLinkedListUsingRecursion(LinkedNode root) {
		if (root != null) {
			reversePrintLinkedListUsingRecursion(root.next);
			System.out.print(root.data + " ");
		}
	}
	
	/**
	 * this method deletes a node from the linked list when value of a particular
	 * node is given.
	 * 
	 * @param root
	 * @return
	 */
	public static LinkedNode delete(LinkedNode root, int data) {

		// check for boundary conditions
		// if list is empty
		if (root == null) {
			return root;
		}
		
		LinkedNode prev = root;
		LinkedNode curr = prev.next;

		if (curr == null) {
			root = curr; // if list contains single element
			return root;
		}

		// if list contains multiple elements
		while (curr != null) {
			if (curr.data == data) {
				prev.next = curr.next;
				curr = null; // make eligible for garbage collection
				break;
			}
			curr = curr.next;
			prev = prev.next;
		}

		return root;
	}
	
	/**
	 * this method reverses the linked list using iteration method
	 * 
	 * @param root
	 * @return
	 */
	public static LinkedNode reverseList(LinkedNode root) {
		
		LinkedNode curr = root;
		LinkedNode prev = null;
		LinkedNode temp = null;
		
		// check for boundary conditions
		
		// if list is empty or contains only one node, then return the list
		if (curr.next == null || curr == null) {
			return curr;
		}
		
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		root = prev;
		return root;
	}
	
	/**
	 * 	 reverse a linked list using recursion
	 * @param root
	 * @return
	 */
	public static void reverseLinkedListUsingRecursion(LinkedNode root) {
		
		LinkedNode head = null;
		
		// exit condition 
		if (root.next.next == null) {
			head = root.next;
			return;
		}
		reverseLinkedListUsingRecursion(root.next);
		LinkedNode temp = root.next;
		temp.next = root;
		root.next = null;
		
	}
	
	
	/**
	 * // Function to find middle element in a linked list
	 * odd case : return middle element
	 * even case : return the second mid element
	 * @param head
	 * @return
	 */
	public static int getMiddle(LinkedNode head) {
		// Your code here.
		LinkedNode p = head;
		LinkedNode q = head;

		while (q.next != null) {
			
			if (q.next.next == null) {
				return p.next.data;
			}
			
			p = p.next;
			q = q.next.next;
		}
		return p.data;
	}
	
	/**
	 * this method rotates a list
	 * @param head
	 * @return
	 */
	public static LinkedNode rotateList(LinkedNode head, int k) {
		
		LinkedNode p = head;
		
		if (k == 0) {
			return head;
		}
		// handle boundary conditions
		if (p.next == null) {
			return head;
		}
		
		for (int i = 1; i <= (k - 1); i++) {
			p = p.next;
		}
		
		// a new reference to hold new head;
		LinkedNode q = p.next;
		
		// to mark the end of the list and avoid infinite loop, assign p.next to null
		p.next = null;
		
		// to find the end of the list, lets declare another reference
		// which will merge with the starting head
		
		LinkedNode r = q;
		
		// to handle the condition, if k == size of the list
		// in such condition r will be null; and we'll get NullPointerException at r.next;
		
		if (r != null) {
			while (r.next != null) {
				r = r.next;
			}
			
			r.next = head;
			head = q;
		}
		
		
		return head;
	}
	
	/**
	 * This method gets Nth node from the last.
	 * 
	 * geeksforgeeks must do coding section of linkedlist
	 * @param head
	 * @param n
	 * @return
	 */
	public static int getNthFromLast(LinkedNode head, int n) {
		// Your code here
		LinkedNode p = head;
		LinkedNode q = null;

		for (int i = 1; i < n; i++) {
			if (p != null) {
				p = p.next;
			} else {
				return -1;
			}
		}

		q = head; // start iterating from head

		while (p.next != null) {
			p = p.next;
			q = q.next;
		}

		return q.data;
	}
}

