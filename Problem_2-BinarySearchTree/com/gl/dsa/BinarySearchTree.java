package com.gl.dsa;

import java.util.HashSet;
import java.util.Set;

public class BinarySearchTree {
	
	private static class Node{
		int val;
		Node left;
		Node right;
		
		public Node (int val) {
			this.val = val;
			this.left=null;
			this.right=null;
		}
	}
	
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int val) {
		root = insert(root,val);
	}
	
	public Node insert(Node node, int val) {
		if(node == null) {
			node = new Node(val);
		} 
		if (node.val < val){
			node.left = insert(node.left,val);
		}
		if (node.val > val){
			node.right = insert(node.right,val);
		}
		return node;
	}
	
	public boolean findPairWithSum(int sum) {
		Set<Integer> set = new HashSet<>();
		return findPairWithSum(root,sum,set);
	}

	private boolean findPairWithSum(Node node, int sum, Set<Integer> set) {
		// TODO Auto-generated method stub
		if(node == null) {
			return false;
		}
		if(findPairWithSum(node.left,sum,set)) {
			return true;
		}
		if(set.contains(sum-node.val)) {
			System.out.println("Pair found :: "+(sum - node.val)+" , "+node.val);
			return true;
		}
		set.add(node.val);
		return findPairWithSum(node.right,sum,set);
		
	}
	
	
}
