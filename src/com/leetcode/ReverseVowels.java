package com.leetcode;

import java.util.Arrays;

public class ReverseVowels {

	public static String reverseVowels(String s) {
		char[] array = s.toCharArray();
		char[] tmp = new char[array.length];
		int t = 0;
		for (int i = 0; i < array.length; i++)
			switch (array[i]) {
			case 'a':
			case 'A':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				tmp[t] = array[i];
				t++;
				array[i] = 0;
				
			}
		for (int i = 0; i < tmp.length; i++) {
			if (array[i] == 0) {
				array[i] = tmp[t - 1];
				t--;
			}
		}
		String string = String.valueOf(array);
		return string;
	}
	 public static String reverseString(String s) {
	        char[] ch= s.toCharArray();
	        for(int i=0;i<ch.length/2;i++){
	            ch[i]=(char) (ch[ch.length-i-1]^ch[i]);
	            ch[ch.length-i-1]=(char) (ch[i]^ch[ch.length-i-1]);
	            ch[i]=(char) (ch[ch.length-i-1]^ch[i]);
	        }
	        return new String(ch);
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "aA";
//	System.out.println(	reverseVowels(str));
		String str="abcde";
		System.out.println(reverseString(str));
	}

}
