package com.greatlearning.assignment;


class Node{
	
	int item;
	Node left,right;
	
	Node(int data)
	{
		item =data;
		left=right=null;
	}
}


public class skewTree {

	public static Node node;
	static Node headnode = null;
	static Node prevnode = null;
	
	static void rightskew(Node root)
	{
		if(root == null) 
		{
			return;
		}
		else
		{
			rightskew(root.left);
		}
		
		Node rightnode = root.right;
		
		if (headnode == null) 
		{
			headnode = root;
			root.left =null;
			prevnode = root;
		}
		else
		{
			prevnode.right =root;
			root.left =null;
			prevnode =root;
		}
		rightskew(rightnode);
	}
	
	static void traverseRight(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.item + " ");
		traverseRight(root.right);
	}
	
	public static void main(String [] args)
	{
		skewTree tree = new skewTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		rightskew(node);
		traverseRight(headnode);
		
	}
}
