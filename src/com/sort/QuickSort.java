package com.sort;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	
	public static void sort(int [] t,int start,int end){
		int key=t[start];
		int left=start;
		int right=end;
		while(left<right){
			while(right>left&&key<=t[right])
				right--;
			t[left]=t[right];
			while(left<right&&key>=t[left])
				left++;
			t[right]=t[left];
		}
		t[left]=key;
		if(start<left)
			sort(t, start, left-1);
		if(left<end)
			sort(t, left+1, end);
		
			
	}
	 public static int Puzzle(int[] a) {
		 sort(a,0,a.length-1);
		 int tmp=a.length/2;
		 if(a.length%2==0)
			 tmp-=1;
		 return a[tmp];
	    }
	public static void main(String[] args){
		int[] tmp={4,14,7};
//		sort(tmp,0,tmp.length-1);
//		System.out.println(Arrays.toString(tmp));
		Puzzle(tmp);
		
	}
}
