package com.sort;

import java.util.Arrays;

public class InsertSort {
	public int[] Sort(int [] t){
		int key;int j;
		for(int i=1;i<t.length;i++){
			key=t[i];
			for( j=i-1;j>=0&&t[j]<key;j--){
					t[j+1]=t[j];	
			}
			t[j+1]=key;
		}
		return t;
	}
	public static void main(String[] args){
		int [] tep={2,21,3,21,42,5,1};
		int[] t= new InsertSort().Sort(tep);
		System.err.println(Arrays.toString(t));
	}
}
