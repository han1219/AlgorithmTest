package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
	 public static int[] singleNumber(int[] nums) { 
		 	int A = 0;  
		    int B = 0;  
		    int AXORB = 0;  
		    for(int i = 0; i<nums.length; i++){  
		        AXORB ^= nums[i];  
		    }  
		    System.out.println(AXORB+"  " +(AXORB & (AXORB - 1)));
		    AXORB = (AXORB & (AXORB - 1)) ^ AXORB; //find the different bit  in A and B
		    System.out.println(AXORB);
		    for(int i = 0; i<nums.length; i++){  
		        if((AXORB & nums[i]) == 0)  
		            A ^= nums[i];  
		        else  
		            B ^= nums[i];  
		    }  
		    return new int[]{A, B};  
	 }
	 
	  public static String convertToTitle(int n) {
		  String asc="";
	        while(n>0){
	            asc=(char)(((n%26==0)?26:(n%26))+64)+asc;
	            if(n%26==0)
	            	n-=26;
	            	n=(n)/26;
	        }
	        return asc;
	    
	    
	    }
	 public static void main(String[] args){
//		 int []nums = {1, 2, 1, 31, 2, 5,5,12};
//		 boolean flag= list.remove(1);
//		 System.out.println(list);
//		 System.out.println(Arrays.toString( singleNumber(nums)));
		 System.out.println(convertToTitle(27));
	 }
}
