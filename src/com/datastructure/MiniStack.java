package com.datastructure;

public class MiniStack<T> {

	private int size;
	Object[] array=new Object[4];
	public boolean isEmpty(){
		if(size==0)
			return true;
		else {
			return false;
		}
	}
	public void expandCapacity(){
		Object []newarray=new Object[size*2];
		System.arraycopy(array, 0, newarray, 0, size);
		array=newarray ;
	}
	public void push(T t){
		array[size]=t;
		size++;
		if(size==array.length){
			expandCapacity();
		}
	}
	public T peek(){
		if(isEmpty())
			return null;
		return (T) array[size-1];
	}
	public T pop(){
		if(isEmpty())
			return null;
		T t=peek();
		array[size-1]=null;// java 引用计数器的原因，可能会引起内存泄漏
		size--;
		return t;
					
	}
	public int size(){
		return size;
	}
	public static void main(String [] args){
		MiniStack<Integer> stack=new MiniStack<Integer>();
		
	}
}
