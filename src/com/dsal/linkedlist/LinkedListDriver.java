package com.dsal.linkedlist;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedNode root = null;
		root = LinkedList.insert(root, 10);
		root = LinkedList.insert(root, 15);
		root = LinkedList.insert(root, 12);
		root = LinkedList.insert(root, 13);
		root = LinkedList.insert(root, 20);
		root = LinkedList.insert(root, 14);
		root = LinkedList.insert(root, 19);
		
		System.out.println("\nLinked list elements");

		// print the list
		LinkedList.printLinkedList(root);
		
		root = LinkedList.swapNodes(root, 12, 13);
		System.out.println("\nswapped nodes list");
		LinkedList.printLinkedList(root);

	}
}
