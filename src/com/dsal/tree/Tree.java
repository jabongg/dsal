package com.dsal.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	/**
	 * printing tree nodes using inorder traversal.
	 * 
	 * @param root
	 */
	public static void inorder(BSTNode root) {
		if (root == null) {
			return;
		} else {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	/**
	 * method to insert a node in the tree.
	 * 
	 * @param root
	 * @return
	 */
	public static BSTNode insert(BSTNode root, int data) {
		if (root == null) {
			root = new BSTNode(data);
			return root;
		} else {
			if (root.data >= data) {
				root.left = insert(root.left, data);
			}
			if (root.data < data) {
				root.right = insert(root.right, data);
			}
			return root;
		}
	}

	public static void treeLeftView(BSTNode root, int level, int maxLevel) {
		// if root is null, then set the level as 1
		if (root == null) {
			return;
		} 
		
		if (level > maxLevel) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		treeLeftView(root.left, level + 1, maxLevel);
		treeLeftView(root.right, level + 1, maxLevel);
	}
	
	

	
	public static void treeRightView(BSTNode root, int level, int maxLevel) {
		// if root is null, then set the level as 1
		if (root == null) {
			return;
		} 
		
		if (level > maxLevel) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}

		treeRightView(root.right, level + 1, maxLevel);
		treeRightView(root.left, level + 1, maxLevel);
	}
	
	/**
	 * BFS Traversal of the tree
	 * @param root
	 */
	public static void bfsTraversal(BSTNode root) {
		        // base condition
		        if (root == null) {
		            return;
		        }
		        // let's have a queue to maintain nodes
		        Queue<BSTNode> q = new LinkedList<>();
		        if (root != null) {
		            q.add(root);
		        }
		        
		        while (!q.isEmpty()) {
		            BSTNode curr = q.poll();
		            if (curr != null) {
			            q.add(curr.left);
			            q.add(curr.right);
			            
			            System.out.print(curr.data + " ");
		            }
		        }
		        
	}
}
