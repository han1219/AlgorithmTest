package com.leetcode;

import java.util.Arrays;

public class Medianof_Two_Sorted_Arrays_4 {
		public static void main(String[] args){
			int[] nums1={1};
			int [] nums2={};
			System.err.println(reverseWords("123 hsd  s a"));
//			long start=System.currentTimeMillis();
//			System.out.println(findMedian(nums1, nums2));
//			long end=System.currentTimeMillis();
//			System.out.println(end-start);
		}
		 public static String reverseWords(String s) {
		        String[] str=s.split(" +");
		        String result=new String();
		        int len=str.length;
		        for(int i=0;i<len/2;i++){
		            String tmp=str[i];
		            str[i]=str[len-i-1];
		            str[len-i-1]=tmp;
		        }
		        for(String i:str){
		            result+=i+" ";
		        }
		        
		        return result;
		    }
		public static double findMedian(int []nums1,int[] nums2){
			int len1=nums1.length;
			int len2=nums2.length;
			int len=len1+len2;
			int[] nums=new int[len];
			System.arraycopy(nums1, 0, nums, 0, len1);
			System.arraycopy(nums2, 0, nums, len1, len2);
			Arrays.sort(nums);
			int mid=len/2;
			if(len%2==0){
				
				return (double)(nums[mid]+nums[mid-1])/2;
			}else {
				return (nums[mid]);
			}
		}
		public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        int m=nums1.length;
	        int n=nums2.length;
	        if(m==0){
	            return n%2==0?(nums2[n/2]+nums2[n/2-1])/2:nums2[n/2];
	        }
	         if(n==0){
	            return m%2==0?(nums1[m/2]+nums1[m/2-1])/2:nums1[m/2];
	        }
	        int start1=0;
	        int start2=0;
	        int count=2;
	        int target;
	        if((m+n)%2==0){
	            target=(m+n)/2;
	        }else{
	            target=(m+n)/2+1;
	        }
	        int flag=-1;
	        while(count<=target){
	            if(nums1[start1]>nums2[start2]&&start2<n){
	                start2++;
	                flag=2;
	            }else if(nums1[start1]<nums2[start2]&&start1<m){
	                start1++;
	                flag=1;
	            }else {
	                if(start2<n){
	                    start2++;
	                    flag=2;
	                }
	                if(start1<m){
	                    start1++;
	                    flag=1;
	                }
	            }
	            count++;
	        }
	        double result=0;
	        if(flag%2==0){
	            if((m+n)%2==0){
	            	if(start1>=m){
	            		 result=((double)(nums2[start2]+nums2[start2+1])/2);
	            		 return result;
	            	}
	            	 if(start2>=n){
	            		 result=((double)(nums1[start1]+nums1[start1+1])/2);
	            		 return result;
	            	 }
	            	else{
	            		 result=((double)(nums2[start2]+nums1[start1]))/2;
	            		 
	            		 return result;
	            	}
	            }else{
	                result=nums2[start2-1];
	            }
	        }else{
	             if((m+n)%2==0){
	            	 if(start1>=m){
	            		 result=((double)(nums2[start2]+nums2[start2-1])/2);
	            		 
	            		 return result;
	            	 }
	            	 if(start2>=n){
	            		 result=((double)(nums1[start1]+nums1[start1+1])/2);
	            		 return result;
	            	 }
	            	 else
	            		 result=((double)(nums2[start2]+nums1[start1]))/2;
	            }else{
	                result=nums1[start1-1];
	            }
	        }
	        return result;
	        
	        
	    }
}
