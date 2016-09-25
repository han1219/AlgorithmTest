package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args){
		int [] tmp={1,2,2,1};
		int [] tmp1={2,2};
		String string;
	
		List< Integer >list=new ArrayList<Integer>();
		int [] result=intersection(tmp, tmp1);
		System.out.println(Arrays.toString(result));
	}
	 public static  int[] intersection(int[] nums1, int[] nums2) {
	        List<Integer>list=new ArrayList<Integer>();
	        int [] tmp=new int[nums2.length];
	        int count=0;
	        String str=new String();
	        for(int i=0;i<nums2.length;i++)
	        	str+=nums2[i];
	        for(int i=0;i<nums1.length;i++){
	            if(str.indexOf(nums1[i]+"")!=-1){
	            	tmp[count++]=nums1[i];
	            }
	        }
	        return tmp;
	    }
}
