package com.datastructure;

import java.util.Arrays;

public class MyQueue <T>{
	private int DEFAULT_SIZE=10;
	private int capacity;
	private Object[] elementData;
	private int front=0;
	private int rear=0;
	public MyQueue(){
		capacity=DEFAULT_SIZE;
		elementData=new Object[capacity];
	}
	public MyQueue(T item){
		this();
		elementData[0]=item;
		rear++;
	}
	public MyQueue(T item,int inisize){
		this.capacity=inisize;
		elementData=new Object[this.capacity];
		elementData[0]=item;
		rear++;
	}
	public int size(){
		return rear-front;
	}
	public void add(T element){
		if(rear>capacity-1)
			throw new IndexOutOfBoundsException();
		elementData[rear++]=element;
	}
	public T remove(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException("empty");
		}
	  T tmpT=(T) elementData[front];
	  elementData[front++]=null;
	  return tmpT;
	}
	public boolean isEmpty(){
		return rear==front;
	}
	public void clear(){
		if(isEmpty()){
			throw new IndexOutOfBoundsException();
		}
		Arrays.fill(elementData, null);
		rear=front=0;
	}
	public String toString(){
		if(isEmpty())
			return "[]";
		StringBuilder sb=new StringBuilder("[");
		for(int i=front;i<rear;i++){
			sb.append(elementData[i]);
			if(i!=rear-1){
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String [] args){
		MyQueue<String> queue=new MyQueue<String>();
		queue.add("ABC");
		queue.add("DEF");
		queue.add("GHI");
		queue.add("JKL");

	System.out.println(queue.toString());
	queue.remove();
	System.out.println(queue.toString());
	System.out.println(queue.size());
	queue.clear();
	System.out.println(queue.toString());
	}
}
