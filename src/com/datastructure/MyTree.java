package com.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSInput;

public class MyTree {

	public TreeNode root;

	public void insert(int val) {
		TreeNode node = new TreeNode(val);
		TreeNode current = root;
		TreeNode parent;
		if (root == null) {
			root = node;
			return;
		} else {
			while (true) {
				parent = current;
				if (current.val > val) {
					current = current.left;
					if (current == null) {
						parent.left = node;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = node;
						return;
					}
				}
			}
		}

	}

	public TreeNode find(long val) {
		TreeNode current = root;
		while (current.val != val) {
			if (current.val > val)
				current = current.left;
			else {
				current = current.right;
			}
			if (current == null)
				return null;
		}
		return current;
	}

	public void delete(long val) {

	}

	/**
	 * 前序遍历
	 * 
	 * @param localNode
	 */

	public static void frontOrder(TreeNode localNode) {

		if (localNode == null) {
			System.out.println("[]");
		} else {
			System.out.print(localNode.val + " ");
			if (localNode.left != null) {
				frontOrder(localNode.left);
			}
			if (localNode.right != null) {
				frontOrder(localNode.right);
			}
		}
	}

	int deep = -1;

	public static int treeDeep(TreeNode node) {
		if (node == null)
			return 0;
		else {
			int leftdeep = 1;
			leftdeep += treeDeep(node.left);

			int rightdeep = 1;
			rightdeep += treeDeep(node.right);
			return leftdeep > rightdeep ? leftdeep : rightdeep;
		}
	}

	/**
	 * 最大深度遍历
	 */
	static int maxdeep = 0;

	public static int maxTreeDeep(TreeNode node) {
		deep(node, 1);
		return maxdeep;
	}

	public static void deep(TreeNode node, int level) {
		if (node != null) {
			if (node.left == null && node.right == null) {
				if (level > maxdeep)
					maxdeep = level;
			}
			deep(node.left, level + 1);
			deep(node.right, level + 1);
		}
	}

	/**
	 * 最小深度
	 * 
	 * @param root
	 */
	static int mindeep = Integer.MAX_VALUE;

	public static int minTreeDeep(TreeNode node) {
		mindeep(node, 1);
		return mindeep;
	}

	public static void mindeep(TreeNode node, int level) {
		if (node != null) {
			if (node.left == null && node.right == null) {
				if (level < mindeep) {
					mindeep = level;
				}
			}
			mindeep(node.left, level + 1);
			mindeep(node.right, level + 1);
		}
	}

	/**
	 * 前序遍历模板
	 * 
	 * @param root
	 */
	public static void PrintNodeLevel(TreeNode root) {
		PrintNode(root, 1);
	}

	public static void PrintNode(TreeNode node, int level) {
		if (node != null) {
			System.out.println(node.val + " " + level);
			PrintNode(node.left, level + 1);
			PrintNode(node.right, level + 1);
		}
	}
/*
 * 中序
 */
	public static void inOrder(TreeNode node){
		if(node!=null){
			inOrder(node.left);
			System.out.print(node.val +"  ");
			inOrder(node.right);
		}
	}
	/**
	 * 层序遍历
	 * 
	 * @param root
	 */
	
	public static void getRight(TreeNode node) {
		if(node==null)
			return;
		List< TreeNode> list=new ArrayList<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(node);
		System.out.println(node.val+" "+1);
		int level=1;
		while (!queue.isEmpty()) {
			int num = 0;
			int count = queue.size();
			while (num < count) {
				TreeNode tmpNode = queue.poll();
				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
					list.add(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
					list.add(tmpNode.right);
				}
				num++;
			}
			level++;
			for(TreeNode n:list){
				System.out.println(n.val+"  "+level);
			}
			list.clear();
		}
	}

	public static void levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList();
		queue.offer(root);// 根节点压入队尾
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll(); // 对头压出
			System.out.print(node.val + "  ");
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
	}

	static int num = 0;

	public static void countNode(TreeNode root) {
		if (root != null) {
			num++;
			countNode(root.left);
			countNode(root.right);
		}
	}

	public static void main(String[] args) {
		Integer[] tmp = { 1, 2,5, 4, 3,2 , 1 };
		TreeNode node = CreateBinaryTree.arrayToBinaryTree(tmp);
//		getRight(node);
		// levelOrder(tree.root);
		
		// countNode(tree.root);// 先序遍历计算节点个数
		// System.out.println(num);

		//
		// PrintNodeLevel(node);

//		 frontOrder(node);
		 inOrder(node);
		// System.out.println( maxTreeDeep(node));

		// System.out.println(minTreeDeep(node));

		// leveldeep(node);
	}
}
