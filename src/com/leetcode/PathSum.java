package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.datastructure.CreateBinaryTree;
import com.datastructure.TreeNode;

public class PathSum {
	public static void main(String []args){
		PathSum path=new PathSum();
		Integer [] tmp={1,-2,-3,1,3,-2,null,-1};
		String string;
		TreeNode root=CreateBinaryTree.arrayToBinaryTree(tmp);
		System.out.println(path.hasPathSum(root, -3));
	}
	int num=0;
	
    int sum;
    boolean flag=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        this.sum=sum;
        preOrder(root);
        return flag;
            
    }
    public void preOrder(TreeNode noot){
        if(noot!=null){
            num-=noot.val;
            System.err.println(num+" "+noot.val);
            if(noot.left==null&&noot.right==null){
                if(num==sum){
                    flag=true;
                    return;
                }
               
            }
            preOrder(noot.left);
            preOrder(noot.right);
            num-=noot.val;
        }
    }
}
