package com.leetcode;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.omg.CORBA.IRObject;

public class PowerOfThree {

	 public static boolean isPowerOfThree(int n) {
		 double d=Math.log10(n)/Math.log10(3.0);
		 if(d-Math.floor(d)==0){
			 return true;
		 }
		 else {
			return false;
		}
	 }
	  public static void setZeroes(int[][] matrix) {
		  int column=matrix.length;
		  int row=matrix[0].length;
	
	       for(int i=0;i<column;i++){
	    	   for(int j=0;j<row;j++){
	    		   if(matrix[i][j]==0){
	    			   for(int t=0;t<row;t++){
	    				   matrix[i][t]=Integer.MIN_VALUE;
	    			   }
	    			   for(int t=0;t<column;t++){
	    				   matrix[t][j]=Integer.MIN_VALUE;
	    			   }
	    		   }
	    	   }
	       }
//	       for(int i=0;i<column;i++){
//	    	   for(int j=0;j<row;j++){
//	    		   if(matrix[i][j]==Integer.MIN_VALUE)
//	    				   matrix[i][j]=0;
//	    	   }
//	       }
//		  int col = 1;
//		    int row = 1;
//		    for (int j = 0; j < matrix[0].length; j++) {
//		            if (matrix[0][j] == 0) {
//		                row = 0;
//		            }
//		        }
//		    for (int i = 0; i < matrix.length; i++) {
//		        if (matrix[i][0] == 0) {
//		            col = 0;
//		        }
//		    }
//		    for (int i = 0; i < matrix.length; i++) {
//
//		        for (int j = 0; j < matrix[0].length; j++) {
//		            if (matrix[i][j] == 0) {
//		                matrix[i][0] = 0;
//		                matrix[0][j] = 0;
//		            }
//		        }
//		    }
//		 
//		    for (int i = matrix.length - 1; i > 0; i--) {
//		        for (int j = matrix[0].length - 1; j > 0; j--) {
//		            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//		                matrix[i][j] = 0;
//		            }
//		        }
//		    }
//		    if (col == 0) {
//		        for (int i = 0; i < matrix.length; i++) {
//		                matrix[i][0] = 0; 
//		            }
//		    }
//		    if (row == 0) {
//		        for (int i = 0; i < matrix[0].length; i++) {
//		                matrix[0][i] = 0; 
//		            }
//		    }
	    }

	 public static void main(String[] args){
		//System.out.println(isPowerOfThree(0));
		 
		 int [][] max=new int[][]{{2,3,4},{3,0,4},{3,1,1}};
		 for(int i=0;i<max.length;i++)
			 System.out.println(Arrays.toString( max[i]));
		 System.out.println("-----------");
		 setZeroes(max);

		 for(int i=0;i<max.length;i++)
			 System.out.println(Arrays.toString( max[i]));
	 }
}
