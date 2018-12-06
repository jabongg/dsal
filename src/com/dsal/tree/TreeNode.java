package com.dsal.tree;

public class TreeNode {

	TreeNode left;
	int data;
	TreeNode right;
	
	public TreeNode(TreeNode left, int data, TreeNode right) {
		this.left = null;
		this.data = data;
		this.right = null;
	}
	
	public TreeNode(int data) {
		this.left = null;
		this.data = data;
		this.right = null;
	}
}
