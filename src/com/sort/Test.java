package com.sort;

public class Test {

	   public static int Puzzle(int[][] p, int x) {
	        // The input p represents a polynomial
	        // Example: {{1,3},{3,2},{2,1},{4,0}} = x^3+3x^2+2x+4
	        int tmp=0;
	        int len=p.length;
	        for(int i=0;i<len;i++){
	                tmp+=p[i][0]*(int)(Math.pow (x,p[i][1]));
	        }
	        return tmp;
	    }
	   public static void main(String [] args){
		   int [][]p=	{{-70, 5}};
		 System.out.println(  Puzzle(p, -37));
		 System.out.println(Integer.MAX_VALUE);
	   }
}
