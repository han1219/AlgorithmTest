package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzag {

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<Integer> LevelList = new ArrayList<Integer>();

		return null;
	}

	static List<Integer> LevelList = new ArrayList<Integer>();

	public static List<Integer> getTreeNode(TreeNode root) {

		TreeNode tmpNode = root;
		LevelList.add(tmpNode.val);
		if (root.left != null) {
			getTreeNode(root.left);
		}
		if (root.right != null) {
			getTreeNode(root.right);
		}

		return LevelList;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// level order
	public static List<List<Integer>> levelOrderStack(TreeNode p) {
		if (p == null)
			return null;
		int level = 1;
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		List<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(p);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.remove(0);
			System.out.println(temp.val + " ");
			level++;
			if (level % 2 != 0) {
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}else {
				if (temp.right != null) {
					queue.add(temp.right);
				}
				if (temp.left != null) {
					queue.add(temp.left);
				}
			}
			
		}
		System.out.println(level);
		return null;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(9);
		node.right = new TreeNode(20);
		node.right.left = new TreeNode(15);
		node.right.right = new TreeNode(7);
		levelOrderStack(node);
		// for(int i:getTreeNode(node)){
		// System.out.println(i);
		// }
	}
}
