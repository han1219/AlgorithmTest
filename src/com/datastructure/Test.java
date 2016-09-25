package com.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Father {
	static int i;
	static {
		System.out.println(i);
	}
	static {
		System.out.println("Father static block" + i);
	}
	{
		System.out.println("father bolck");
	}

	public Father() {
		System.out.println("this is father");
	}
}

class Child extends Father {
	static {
		System.out.println("child static block");
	}
	{
		System.out.println("child block");
	}

	public Child() {
		System.out.println("不带参数构造");
	}

	public Child(String s) {

		System.out.println("带参数构造" + s);
	}
}

public class Test {
	public static void main(String[] args) {
		// Child child=new Child();
		Test ts = new Test();
		TreeNode root = CreateBinaryTree.arrayToBinaryTree(new Integer[] {  });
		ts.rightSideView(root);
	}

	List<Integer> list;

	public List<Integer> rightSideView(TreeNode root) {
		list = new ArrayList<Integer>();
		getRight(root);
		return list;
	}

	public void getRight(TreeNode node) {
		if(node==null)
			return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(node);

		while (!queue.isEmpty()) {
			int num = 0;
			int count = queue.size();
			while (num < count) {
				TreeNode tmpNode = queue.poll();
				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
				num++;
			}
			if(!queue.isEmpty())
				list.add(queue.peek().val);
		}

	}
}
