package com.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyArray array=new MyArray();
//		for(int i=0;i<100;i++){
//			array.Insert(i);
//		}
//		array.Display();
//		array.delete(1);
//		array.Display();

		
//		Set<Integer> mySet=new HashSet<Integer>();
////		mySet.add(12);
//		for(int i=0;i<50;i++){
//			mySet.add(i);
//		}
////		mySet.add(24);
//		Iterator<Integer> ite=mySet.iterator();
//		while(ite.hasNext()){
//			System.out.println(ite.next());
//		}
		
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("1", "1");
		for(int i=0;i<50;i++){
			map.put(String.valueOf(i), String.valueOf(i));
		}
		
		for(String str:map.keySet()){
			System.out.print(map.get(str));
		}
		
		Iterator<Entry<String, String>>iter=map.entrySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().getKey());
		}
		
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println(entry.getValue());
		}
	}

}
