package com.datastructure;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateBinaryTree {

	public static TreeNode arrayToBinaryTree(Integer[] array){
		if(array==null||array.length==0)
			return null;
		ArrayList<TreeNode> list=new ArrayList<TreeNode>();
		TreeNode root=new TreeNode(array[0]);
		list.add(root);//只存放一个层的数据
		int index=1;
		while(list.size()>0&&index<array.length){
			ArrayList<TreeNode> tmpList=new ArrayList<TreeNode>();
			for(TreeNode node:list){
				if(index==array.length){
					break;
				}
				if(array[index]!=null){
					node.left=new TreeNode(array[index]);
					tmpList.add(node.left);
					
				}
				++index;
				if(index==array.length){
					break;
				}
				if(array[index]!=null){
					node.right=new TreeNode(array[index]);
					tmpList.add(node.right);
				}
				++index;
			}
			list.clear();
			list.addAll(tmpList);
		}
		return root;

	}
	
	
	public static void main(String [] args){
		Integer [] tmp={1,2,3,4,5,null,6,null,null,null,7,8};
		TreeNode node= arrayToBinaryTree(tmp);
//		System.out.println(node.val);
//		System.out.println(node.left.val);
		MyTree.PrintNodeLevel(node);
	}
}
