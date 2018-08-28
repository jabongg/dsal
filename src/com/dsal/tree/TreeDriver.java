package com.dsal.tree;

public class TreeDriver {

	static int maxLevel = 0;
	public static void main(String[] args) {
        BSTNode root = null;
        root = Tree.insert(root, 28);
        root = Tree.insert(root, 45);
        root = Tree.insert(root, 20);
        root = Tree.insert(root, 25);
        root = Tree.insert(root, 30);
        root = Tree.insert(root, 13);
        root = Tree.insert(root, 93);
        root = Tree.insert(root, 50);
        root = Tree.insert(root, 27);

        System.out.println("Inorder Traversal:");
        Tree.inorder(root); // prints tree elements
        System.out.println("\nPrinting left view of a tree:");
        treeLeftView(root, 1);
        
        System.out.println("\n Printing right view of a tree");
        treeRightView(root, 1);
	}
	
	public static void treeLeftView(BSTNode root, int level) {
		// if root is null, then set the level as 1
		if (root == null) {
			return;
		} 
		
		if (level > maxLevel) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		treeLeftView(root.left, level + 1);
		treeLeftView(root.right, level + 1);
	}
	
	
	public static void treeRightView(BSTNode root, int level) {
		// if root is null, then set the level as 1
		if (root == null) {
			return;
		} 
		
		if (level > maxLevel) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}

		treeRightView(root.right, level + 1);
		treeRightView(root.left, level + 1);
	}
}
