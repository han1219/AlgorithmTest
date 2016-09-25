package com.leetcode;

import java.math.BigInteger;
import java.util.*;

import com.datastructure.CreateBinaryTree;
import com.datastructure.TreeNode;

public class SameTree {
	 List<Integer> list;
	    List<Integer> list2;
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        list=new ArrayList<Integer>();
	        list2=new ArrayList<Integer>();
	        preOrder(p,list);
	        preOrder(q,list2);
//	        return list.contains(list2);
	        for(int i=0;i<list.size();i++){
	        	Integer l1=list.get(i);
	            Integer l2=list2.get(i);
//	        	System.out.println((list.get(i)==list2.get(i))+" " +list.get(i)+"  "+list2.get(i));
	            System.out.println(l1+" "+l2);
	            if(l1==null||l2==null)
	            	 if(l1!=l2)
	            		 return false;
	            	else {
						 continue;
					}
	            if(!l1.equals(l2))
	                return false;
	        }
	        return true;
	    }
	    public void preOrder(TreeNode node,List<Integer> list){
	        if(node!=null){
	        	list.add(node.val);
	            if(node.left==null){
	                list.add(null);
	            }
	            preOrder(node.left,list);
	             if(node.right==null){
	                list.add(null);
	            }
	            preOrder(node.left,list);
	            preOrder(node.right,list);
	        }
	    }
	    public String addBinary(String a, String b) {
	        int m=  Integer.parseInt(a);
	        int n=Integer.parseInt(b);
	        int t=m+n;
	        System.err.println(t);
	        StringBuilder sb=new StringBuilder(); 
	        while(t/2!=0){
	            sb.append(t%2);
	            System.out.println(sb.toString());
	            t=t/2;
	        }
	        return sb.toString();
	    }
	    public static void main(String [] args){
	    	Integer [] tmp={1,2,4,2};
	    	Integer [] in= {5,-685,2970,-755,-462,2770,3620,null,-714,-649,434,
	    			373,2913,3337,4201,null,null,null,-497,-400,-95,313,1620,2838,null,3228,3574,3874,4262,-589,-484,null,-225,-183,null,240,null,1357,2342,null,null,2988,3262,3434,null,3658,3885,null,null,-622,null,null,null,-381,null,null,null,150,null,1237,1538,2235,2593,null,3072,null,null,3349,3490,null,3760,null,4187,null,null,null,-325,74,null,701,1246,1439,1583,2136,2249,2553,2661,3053,3174,null,3384,3465,null,3686,3855,3971,null,null,null,null,null,527,913,null,1283,null,null,null,null,1945,2219,null,null,2370,null,null,2694,3007,null,3109,null,null,null,null,null,null,null,null,null,null,4058,519,624,712,972,null,null,1736,1954,null,null,null,2467,2692,null,null,null,null,3115,null,4100,-203,null,null,null,null,725,null,1227,1670,1745,1952,2030,2427,null,null,null,null,null,null,null,null,null,null,817,1056,null,null,null,null,1852,
	    			null,null,null,2098,null,null,null,null,null,1133,1834,1929
	    	};
	    	SameTree sTree=new SameTree();
	    	TreeNode p=CreateBinaryTree.arrayToBinaryTree(in);
	    	TreeNode q=CreateBinaryTree.arrayToBinaryTree(in);
//	    System.out.println(sTree.isSameTree(p, q));
	    	
//	    	Integer str=null;
//	    	System.out.println(str.equals(null));
	    	
	    	System.out.println(sTree.addBinary("11", "1"));
	    }
}
