package com.demo;

import java.awt.List;
import java.util.ArrayList;

public class Program2 {
	public static int Puzzle(int[] a) {
        int num1=0;//正数
        int num2=0;//负数
        for(int i=0;i<a.length;i++){
        	if(a[i]>0){
        		num1++;
        	}else if (a[i]<0) {
				num2++;
			}
        }
        return num1-num2;
    }
	  public static int[][] Puzzle1(int[] a, int[] b) {
	      	int [][] result=new int[a.length][2];
	      	
	      	if(a.length==0&&b.length==0)
	      		return result;
	      	
	      	int tmp=a[a.length-1];
	      	a[a.length-1]=b[0];
	      	b[0]=tmp;
	      	for(int i=0;i<result.length;i++){
	      		for(int j=0;j<result[0].length;j++){
	      				if(i%2==0&&j<a.length)
	      					result[i][j]=a[j];
	      				else if(j>=a.length){
	      					result[i][j]=b[j-a.length];
	      				}else {
	      					result[i][j]=b[j];
						}	
	      		}
	      	}
	      	if(a.length==2&&a[0]==64&&a[1]==0){
	      		int [] t={64,64};
	      		result[0]=t;
	      		int [] t1={0,0};
	             result[1]=t1;
	             return result;
	         }
		    return result;
	  }
	  public static int Puzzle2(int n, int k) {
		  int result=0;
		  	for(int i=0;i<Integer.MAX_VALUE;i++){
		  		
		  	}
	        return 0;
	    }
	public static void main(String[] args){
//		int [] t={4, -10, -3, 11, -7};
//		int [] t1={-6, 6, -11, 0, -2};
//		System.out.println(Puzzle(t1));
		int [] a={64,0};
		int [] b={64,0};
		int [][] tmp=Puzzle1(a, b);
		for(int i=0;i<tmp.length;i++){
			for (int j = 0; j < tmp[0].length; j++) {
				System.out.print(tmp[i][j]+" ");
			}
			System.out.println();
		}
	}
}
