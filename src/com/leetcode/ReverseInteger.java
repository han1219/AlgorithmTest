package com.leetcode;

public class ReverseInteger {
	public static int reverse(int x) {
		int result=0;
		boolean flag=false;
		if(x<0)
			flag=true;
	    char [] tmp=String.valueOf(Math.abs(x)).toCharArray();
	    int len=tmp.length;
	    
	    for(int i=0;i<len/2;i++){
	    	tmp[i]=(char) (tmp[i]^tmp[len-i-1]);
	    	tmp[len-i-1]=(char) (tmp[i]^tmp[len-i-1]);
	    	tmp[i]=(char) (tmp[i]^tmp[len-i-1]);
	    }
	   result= Integer.parseInt(String.valueOf(tmp));
		return (flag?(result*-1):result);
	}
	/**
	 * @param args
	 */
	   public static  int myAtoi(String str) {
	        if(str==null||str.equals(""))
	            return 0;
	 
	        try {
	        	return Integer.valueOf(str.trim());
			} catch (Exception e) {
				return 0;
			}
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println( reverse(646324351));
		System.out.println(myAtoi("+1"));
	}

}
