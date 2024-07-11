package com.examples.collections;
class TreeNode{
	int data;
	TreeNode left,right;
	public TreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	@Override
	public String toString() {
		return "[" +this.left + " " + this.data + " " + this.right + "]";
	}
	
}

public class BinaryTreeDemo {
	TreeNode root;
	public BinaryTreeDemo() {
		root=null;
	}
	
	public void insert(int data) {
		root=insertNode(root,data);
	}
	public TreeNode insertNode(TreeNode root,int data) {
		TreeNode newNode=new TreeNode(data);
		if(root==null) {
			root=newNode;
		}
		else if(data<root.data) {
			root.left=insertNode(root.left,data);
		}
		else if(data>root.data) {
			root.right=insertNode(root.right,data);
		}
		return root;
	}
	public void inOrderTraversal(TreeNode root) {
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
	}
	public void preOrderTraversal(TreeNode root) {
		if(root!=null) {
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	public void postOrderTraversal(TreeNode root) {
		if(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data);
		}
	}
	public int height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		else {
			int leftHeight=height(root.left);
			int rightHeight=height(root.right);
			if(leftHeight>rightHeight)
				return leftHeight+1;
			else
				return rightHeight+1;
		}
	}
	public TreeNode mirror(TreeNode root) {
		if(root==null)
			return null;
		TreeNode mirrorRoot=new TreeNode(root.data);
		mirrorRoot.left=mirror(root.right);
		mirrorRoot.right=mirror(root.left);
		return mirrorRoot;
	}
	public static void main(String[] args) {
		BinaryTreeDemo binaryTree=new BinaryTreeDemo();
		binaryTree.insert( 75);
		System.out.println(binaryTree.root);
		binaryTree.insert( 60);
		System.out.println(binaryTree.root);
		binaryTree.insert( 90);
		System.out.println(binaryTree.root);
		binaryTree.insert( 55);
		System.out.println(binaryTree.root);
		binaryTree.insert( 67);
		System.out.println(binaryTree.root);
		binaryTree.insert( 80);
		System.out.println(binaryTree.root);
		binaryTree.insert( 95);
		System.out.println(binaryTree.root);
		binaryTree.inOrderTraversal(binaryTree.root);
		System.out.println("Preorder traversal");
		binaryTree.preOrderTraversal(binaryTree.root);
		System.out.println("PostOrder Traversal");
		binaryTree.postOrderTraversal(binaryTree.root);
		System.out.println("Height" + binaryTree.height(binaryTree.root));
		BinaryTreeDemo binaryTree1=new BinaryTreeDemo();
		binaryTree1.insert(18);
		binaryTree1.insert(15);
		binaryTree1.insert(20);
		binaryTree1.insert(6);
		binaryTree1.insert(16);
		binaryTree1.insert(5);
		binaryTree1.insert(17);
		binaryTree1.insert(19);
		binaryTree1.insert(21);
		System.out.println(binaryTree1.root);
		binaryTree.inOrderTraversal(binaryTree1.root);
		System.out.println("Preorder traversal");
		binaryTree.preOrderTraversal(binaryTree1.root);
		System.out.println("PostOrder Traversal");
		binaryTree.postOrderTraversal(binaryTree1.root);
		System.out.println("Height " + binaryTree1.height(binaryTree1.root));
		binaryTree1.root=binaryTree1.mirror(binaryTree1.root);
		System.out.println(binaryTree1.root);
		
	}

}
