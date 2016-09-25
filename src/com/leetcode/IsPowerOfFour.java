package com.leetcode;

public class IsPowerOfFour {

	public static boolean  isPowerOfFour(int num){
		 double d=Math.log10(num)/Math.log10(4.0);
		 if(d-Math.floor(d)==0){
			 return true;
		 }
		 else {
			return false;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour(6));
	}

}
