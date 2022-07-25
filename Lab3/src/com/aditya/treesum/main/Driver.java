package com.aditya.treesum.main;

import com.aditya.treesum.service.FindSumPair;

public class Driver {

	public static void main(String[] args) {
		
		Node root = null;
		
		FindSumPair findSP = new FindSumPair();
		
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 70);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 50);
		
		int sum = 130;
		findSP.findPairForSum(root, sum);

	}

}
