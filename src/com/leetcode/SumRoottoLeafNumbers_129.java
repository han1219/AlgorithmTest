package com.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.datastructure.CreateBinaryTree;
import com.datastructure.TreeNode;

public class SumRoottoLeafNumbers_129 {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] args){
		Integer[] array={1,2,3,null,4};
		TreeNode root=CreateBinaryTree.arrayToBinaryTree(array);
		System.out.println(sumNumbers(root));
	}
	    public static int sumNumbers(TreeNode root) {
	        List<Integer> list=new ArrayList<Integer>();
	        int [] t=new int [1];
	        t[0]=0;
	        preOrder(root,list,t);
	        return t[0];
	    }
	    public static void preOrder(TreeNode root,List<Integer>list,int[] t){
	        if(root!=null){
	        	list.add(root.val);//每个节点加入
	            if(root.left==null&&root.right==null){
	                    
//	                    list.add(root.val);//叶子节点加入
	                    int tmp=0;
	                    int len=list.size();
	                    
	                    for(int i:list){
	                        tmp+=i*Math.pow(10,(len-1));
	                        len-=1;
	                    }
	                    System.out.println(tmp);
	                    list.remove(list.size()-1);
	                    for(int i:list){
	                    	System.err.println(i);
	                    }
	                    t[0]+=tmp;
	            }   
	            
	            preOrder(root.left,list,t);
	            preOrder(root.right,list,t);
	            
	        }
	    }

}
