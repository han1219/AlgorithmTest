package com.datastructure;

public class Binary_search {
	public int search(int [] t,int value){
		int left=0,right=t.length-1;
		int mid;
		while (left <=right) {
			mid=left+((right-left)>>1);
			if (t[mid] > value) {
				right=mid-1;
			}else if(t[mid]<value){
				left=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int []tmp={1,2,3,4,5,6,7,8,9,10};
		Binary_search binary=new Binary_search();
		System.out.println( binary.search(tmp, 10));
	}
}
