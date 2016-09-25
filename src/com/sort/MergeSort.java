package com.sort;

public class MergeSort {
	public static void Sort(int []t,int left,int right){
		if(right-left>1){
			int mid=(left+right)/2;
			Sort(t, left, mid);
			Sort(t, mid, right);
		
		}
	}
	
	public static void Merge(int []t,int left,int mid,int right){
		
	}
}
