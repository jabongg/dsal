package com.dsal.tree;

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
}
