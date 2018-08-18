package com.datastructures.linkedlist.java;

public class LinkedListOperations {
	public static void main(String[] args) {
		
		LinkedNode root = null;
		
		root = LinkedList.insert(root, 25);
		root = LinkedList.insert(root, 15);
		root = LinkedList.insert(root, 54);
		root = LinkedList.insert(root, 98);
		root = LinkedList.insert(root, 23);
		root = LinkedList.insert(root, 67);
		
		LinkedList.printLinkedList(root);
		System.out.println();
		
		LinkedList.printLinkedListUsingRecursion(root);
		System.out.println();
		
		LinkedList.reversePrintLinkedListUsingRecursion(root);
		System.out.println();
		
		//root = LinkedList.delete(root, 98);
		//LinkedList.printLinkedList(root);
		//System.out.println();
		
		root = LinkedList.reverseList(root);
		LinkedList.printLinkedList(root);
		System.out.println();
		
		//root = LinkedList.reverseLinkedListUsingRecursion(root);
		
		/*LinkedList.reverseLinkedListUsingRecursion(root);
		LinkedList.printLinkedList(root);
		System.out.println();*/
		

		int middleElement = LinkedList.getMiddle(root);
		System.out.println(middleElement);
		
		root = LinkedList.rotateList(root, 6);
		LinkedList.printLinkedList(root);
		System.out.println();
	}

}
