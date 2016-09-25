package com.leetcode;

import java.util.Arrays;

public class CountingBits {

	 public static int[] countBits(int num) {
	        int [] t=new int[num+1];
	        for(int i=0;i<=num;i++)
	        {
	        	int in= i;
	        	int count=0;
	        	while(in!=0){
	        	    if((in&1)==1){
	        	    	count++;
	        	    }
	        	    in= (in>>>1);
	        	    System.out.println(String.valueOf( in));
	        	}
	        	t[i]=count;
	        }
	        return t;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( Arrays.toString( countBits(5)));
		
	}

}
