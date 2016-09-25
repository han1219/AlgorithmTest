package com.datastructure;

import com.datastructure.MyLinkedList.Node;

public class DoubleLinkList <T>{
	class Node{
		T data;
		Node next;
		public Node previous;
		public Node(T item) {
			this.data=item;// TODO Auto-generated constructor stub
			next=null;
		}
		public void display(){
			System.out.println(this.data+"");
		}
	}
	
	private Node first;
	private Node last;
	public DoubleLinkList() {
		first=last=null;	// TODO Auto-generated constructor stub
	}
	public void insertFirst(T val){
		Node node=new Node(val);
		if(isEmpty()){
			last=node;
		}
		else {
			first.previous=node;
		}
		node.next=first;
		first=node;
	}
	public void insert(T from,T val){
		Node node= find(from);
		Node node2=new Node(val);
		if(node.next==null){
			insertLast(val);
		}else {
			node2.next=node.next;
			node.next.previous=node2;
			node.next=node2;
			node2.previous=node;
		}
		
	}
	public void insertLast(T val){
		Node node=new Node(val);
		if(isEmpty()){
			first=node;
		}
		else {
			last.next=node;
		}
	}
	public Node deleteFirst(){
		Node node=first;
		if(isEmpty()){
			first=null;
			return null;
		}
		else {
			first=node.next;
			return node;
		}
	}
	public Node deleteLast(){
		Node node=last;
		if(isEmpty()){
			return null;
		}
		else {
			node.previous.next=null;
		}
		last=node.previous;
		return node;
	}
	public void display(){
		StringBuilder sb=new StringBuilder("[");
		for(Node pNode=this.first;pNode!=null;pNode=pNode.next){
			sb.append(pNode.data);
			if(pNode.next!=null)
				sb.append(",");
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	public Node find(T val){
		Node current=first;
		for(;current!=null;current=current.next){
			if(current.data.equals(val))
				return current;
		}
		return null;
	}
	public Node delete(T val){
		Node current=first;
		Node pre=first;
		while(current.next!=null){
			if(current.data.equals(val)){
				pre.next=current.next;
				current.next.previous=pre;
				break;
			}
			pre=current;
			current=current.next;
		}
		return current;
	}
	public boolean isEmpty(){
		return first==null;
	}
	
	public static void main(String[] args){
		DoubleLinkList<String>  list=new DoubleLinkList<String>();
		list.insertFirst("abc");
		list.insertFirst("def");
		list.insertFirst("ghi");
		list.insertFirst("jkl");
//		
		list.display();
		
//		list.delete("def");
//		list.display();
		
//		list.deleteFirst();
//		list.display();
		
		list.insert("jkl","12");
		list.display();
	}
}
