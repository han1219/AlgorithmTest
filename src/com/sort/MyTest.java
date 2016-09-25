package com.sort;

import java.util.Arrays;

public class MyTest {
	public static void main(String [] args){
		int [] tmp={10,11,6,15,21,14,5,14};
//		QuickSort(tmp, 0, tmp.length-1);
		InsertSort(tmp);
		System.out.println(Arrays.toString(tmp));
	}
	public static void QuickSort(int [] t,int left,int right){
		int key=t[left];
		int start=left,end=right;
		while(start<end){
			while(t[end]>=key&&start<end){
				end--;
			}
			t[start]=t[end];
			while(t[start]<=key&&start<end){
				start++;
			}
			t[end]=t[start];
		}
		t[start]=key;
		if(left<start-1)
			QuickSort(t, left, start-1);
		if(start+1<right){
			QuickSort(t, start+1, right);
		}
	}

	public static void InsertSort(int []t){
		for(int i=0;i<t.length;i++){
			int key=t[i];
			for(int j=i-1;j>=0&&t[j]>key;j--){	
					t[j+1]=t[j];
			t[j]=key;
			}
		}
	}

	
}
