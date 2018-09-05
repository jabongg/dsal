package com.dsal.linkedlist;

public class LinkedList {

	/**
	 * this method creates linkedlist by apppending new data at the end of the list.
	 * @param root
	 * @param data
	 * @return
	 */
	public static LinkedNode insert(LinkedNode root, int data) {
		// inserting at the end 
		LinkedNode curr = root;
		
		if (root == null) {
			return new LinkedNode(data);
		} else {
			while (curr.next != null) {
				curr = curr.next;
			}
			LinkedNode temp = new LinkedNode(data);
			curr.next = temp;			
		}
		
		return root;
	}
	
	/**
	 * print linked list data
	 * @param root
	 */
	public static void printLinkedList(LinkedNode root) {
		while (root != null) {
			System.out.print(root.data + " ");
			root = root.next;
		}
	}
	
	/**
	 * swap the two nodes without swapping their data,
	 * as data may be much larger, so swapping data may be costlier.
	 * so swap links only.
	 * @param root
	 * @param data1
	 * @param data2
	 * @return
	 */
	public static LinkedNode swapNodes(LinkedNode root, int data1, int data2) {
		// this handles only general condition
		// not the end and base conditions
		LinkedNode p = root;
		LinkedNode q = root;
		LinkedNode r = null;
		LinkedNode s = root;
		LinkedNode pHead = null;
		LinkedNode qHead = null;
		
		while (s.next != null) {
			if (s.next.data == data1) {
				pHead = s;
				p = pHead.next;
				break;
			}
				s = s.next;
		}
		
		s = root; // reassign s to root
		while (s.next != null) {
			if (s.next.data == data2) {
				qHead = s;
				q = qHead.next;
				break;
			}
			
			s = s.next;
		}
		
		pHead.next = q;
		r = q.next;
		q.next = qHead;
		qHead.next = p;
		p.next = r;
		
		
		return root;
	}
}
