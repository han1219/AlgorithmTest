package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 */
 interface NestedInteger {

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
     // Return null if this NestedInteger holds a nested list
     public Integer getInteger();
 
    // @return the nested list that this NestedInteger holds, if it holds a nested list
     // Return null if this NestedInteger holds a single integer
     public List<NestedInteger> getList();
  }
 public class NestedIterator{
	 public static void main(String[]args){
		 List<NestedInteger> nestedList=new ArrayList<NestedInteger>();
		 NestedIterat i = new NestedIterat(nestedList);
		 while (i.hasNext()) 
			 System.out.println( i.next());
		 
//		 NestedIterat nestedIterat=new NestedIterat(list);
	 }
 }
 class NestedIterat implements Iterator<Integer> {
	List<Integer> element=new ArrayList<Integer>();
	public void add(List<NestedInteger>list){
		for(NestedInteger nestedInteger:list){
			if(nestedInteger.isInteger()){
				element.add(nestedInteger.getInteger());
			}else {
				add(nestedInteger.getList());
			}
		}
		
	}
	
    public NestedIterat(List<NestedInteger> nestedList) {
       add(nestedList);
    }

 
	public void remove() {
		// TODO Auto-generated method stub
		//nestedList.remove(num);
	}

	int num=0;
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(num!=(element.size())){
			return true;
		}
		else {
			return false;
		}
	}


	public Integer next() {
		// TODO Auto-generated method stub
		return element.get(num++);
	}
	
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
