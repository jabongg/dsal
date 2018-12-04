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
        Tree.treeLeftView(root, 1, 1);
        
        System.out.println("\nPrinting right view of a tree");
        Tree.treeRightView(root, 1, 1);
        
        System.out.println("\n BFS traversal of the tree");
        Tree.bfsTraversal(root);
        }

}
