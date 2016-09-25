package com.datastructure;

import java.util.Arrays;
/**
 * ����ʵ���б�
 *
 */
public class MyArray {
	public long[] array;
	private int len;
	public MyArray(){
		array=new long[50];
		len=0;
	}
	/**
	 * ����
	 * @param data
	 */
	public  void Insert(long data){
		if(len>=50){
			long [] arr=new long[len];
			System.arraycopy(array, 0, arr, 0, len);
			array=new long[len*2];
			System.arraycopy(arr, 0, array, 0, len);
		}
		array[len]=data;
		len++;
	}
	/**
	 * ��ʾ
	 */
	public void Display(){
		System.out.print("[");
		for(int i=0;i<len;i++){
			System.out.print(array[i]);
			if(i==len-1){
				System.out.print("]");
				break;
			}
			System.out.print(",");
		}
		System.out.println("");
	}
	/**
	 * ��ֵ����
	 * @param value
	 * @return
	 */
	public int search(long value){
		for(int i=0;i<len;i++){
			if(array[i]==value){
				return i;
			}
		}
		return -1;
	}
	/**
	 * ����������
	 */
	public long get(int index){
		if(index>=len||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}else {
			return array[index];
		}
	}
	/**
	 * ɾ������
	 * @throws Exception 
	 */
	public void delete(int index) {
		if(index>=len||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i=index;i<len;i++){
			array[i]=array[i+1];
		}
		len--;
	}
	/**
	 * ��������
	 */
	public void update(int index,long value){
		if(index>=len||index<0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			array[index]=value;
		}
	}
}
