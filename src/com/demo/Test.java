package com.demo;

import java.util.Scanner;

public class Test {
	 public static void main(String[] args){
	        Scanner scanner=new Scanner(System.in);
	        String str=	scanner.nextLine();
	        str=str.toLowerCase();
	        System.out.println(str);
	        String aim= scanner.nextLine();
	        aim=aim.toLowerCase();
	        int count=0;
	        for(int i=0;i<str.length();i++){
	        	if(aim.equals(String.valueOf( str.charAt(i))))
	        		count++;
	        }
	        System.out.println(count);
	    }
}
