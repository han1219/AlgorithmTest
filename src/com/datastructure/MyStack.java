package com.datastructure;

import java.util.LinkedList;

public class MyStack<T> {
	class Node<T>{
		T data;
		Node<T> next;
		public Node(T item) {
			data=item;
			next=null;
		}
		public Node(T item,Node<T>next) {
			this.data=item;
			this.next=next;
		}
	}
	LinkedList<T> mylist=new LinkedList<T>();
	public T push(T item){
		//Node node=new Node<T>(item);
		mylist.addFirst(item);
		return item;
	}
	
	public void pop(){
		mylist.remove(0); 
	}
	public boolean isEmpty(){
		return mylist.size()==0;
	}
	public int search(T item){
		return mylist.indexOf(item);
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<mylist.size();i++){
			sb.append(mylist.get(i));
			if(i!=mylist.size()-1){
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	public static void main(String[] args){
//		MyStack<String> stack=new MyStack<String>();
//		stack.push("abc");
//		stack.push("def");
//		stack.push("ghi");
//		System.out.println(stack.toString());
//		
//		stack.pop();
//		System.out.println(stack.toString());
		MyStackUsingArray<String> stack=new MyStackUsingArray<String>();
		stack.push("abc");
		stack.push("def");
		stack.push("ghi");
		for(int i=0;i<10;i++)
			stack.push("i:"+i);
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
	}
}

class MyStackUsingArray<T>{
	Object[] element=new Object[10];
	int len=0;
	public void push(T item){
		if(len==element.length){
			Object[] objects=new Object[element.length];
			objects=element;
			element=new Object[element.length+10];
			System.arraycopy(objects, 0, element, 0, len);
		}
		element[len++]=item;
	}
	public T pop(){
		return (T) element[len--];
	}
	public String toString(){
		StringBuilder sb=new StringBuilder("[");
		for(int i=len-1;i>=0;i--){
			sb.append(element[i]);
			if(i!=0)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}
}
