package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program {
	public static void sort(float [] t,int start,int end){
		float key=t[start];
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
	public static int[] Puzzle(float[] a) {
		int [] result=new int[a.length];
		Map<Integer,Float> map=new HashMap<Integer,Float>();
		for(int i=0;i<a.length;i++){
			map.put(i, a[i]);
		}
		sort(a, 0,a.length-1);
		Iterator<Entry<Integer, Float> >in= map.entrySet().iterator();
		while(in.hasNext()){
			Entry<Integer, Float> entry= in.next();
			for (int i=0;i<a.length;i++)
				if(entry.getValue()==a[i])
					result[entry.getKey()]=i;
		}
		Set<Integer> set=new HashSet<Integer>();
		boolean flag;
//		for(int i=0;i<result.length;i++){
//			 flag= set.add(result[i]);
//			 if(flag==false){
//				 int t=result[i];
//				 result[i]=0;
//				 for(int j=0;j<result.length;j++)
//					 if(t==result[j])
//						 result[j]=0;
//						 
//			 }
//		}
		return result;
    }
	public static void main(String[] args){
		float[] t={(float) -85.3422, (float) -86.3422, 1};
		float[] t1={(float) -6.5, (float) -8.9, (float) 10.3, (float) -8.9};
//		sort(t, 0, t.length-1);
//		System.out.println(Arrays.toString(t));
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	System.out.println(Arrays.toString(	Puzzle(t1)));
		
	}
	class Te{
		
	}
}
