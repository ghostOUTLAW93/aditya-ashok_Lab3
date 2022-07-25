package com.aditya.treesum.service;
import java.util.HashSet;
import com.aditya.treesum.main.Node;

public class FindSumPair {

	Node root;

	public Node insert(Node root, int ele) {

		if(root == null)
			return new Node(ele);

		else if(ele < root.data)
			root.left = insert(root.left, ele);

		else
			root.right = insert(root.right, ele);

		return (root);
	}

	public boolean findPair(Node root, int sum, HashSet<Integer> set) {

		if(root == null)
			return false;

		if(findPair(root.left, sum, set))
			return true;

		if(set.contains(sum - root.data)) {
			System.out.println("Pair is found (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		}
		else
			set.add(root.data);

		return findPair(root.right, sum, set);
	}

	public void findPairForSum(Node root, int sum) {

		HashSet<Integer> set = new HashSet<Integer>();

		if(!findPair(root, sum, set))
			System.out.println("Pair do not exist"
					+ "\n");
	}

}
