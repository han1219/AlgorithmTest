package com.leetcode;

public class PalindromeNumber_9 {
	 public static boolean isPalindrome(int x) {
	        if(x<0)
	            return false;
	        int count=0;
	        int tmp=x;
	        while(tmp>0){
	            tmp=tmp/10;
	            count++;
	        }
	        int left=(int) Math.pow(10,count-1);
	        int right=1;
	        while(left>=right){
	        	System.out.println(x/left%10+" " +x/right%10);
	           if(x/left%10!=x/right%10)
	        	   return false;
	           left/=10;
	           right*=10;
	        }
	        return true;
	    }
	 public static void main(String[] args){
		System.out.println( isPalindrome(100021));
	 }
}
