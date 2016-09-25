package com.leetcode;

public class IntegerBreak {
	public static  int integerBreak(int n) {
		if(n==2)
			return 1;
		if(n==3)
			return 2;
		 int res=1;
		 while(n>4){
			 res*=3;
			 n-=3;
		 }
		 return res*n;
//		if (n == 2) return 1;
//	    if (n == 3) return 2;
//	    if (n % 3 == 0) return (int)Math.pow(3, n / 3);
//	    if (n % 3 == 1) return (int)Math.pow(3, (n - 4) / 3) * 4;// we cannot have a small number that is equal to 1. Then use 4 instead.
//	    return (int)Math.pow(3, (n - 2) / 3) * 2;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println(	integerBreak(9));
	}

}
