package com.datastructure;

public class MyLinkedList<T> {
	class Node{
		public T element;
		public Node next;
		public Node(T item) {
			this.element=item;
			next=null;
		}
		public void display(){
			System.out.println(this.element+"");
		}
	}
	
	
	private Node head;
	public MyLinkedList(){
		this.head=new Node(null);
	}
	public void insertHead(T value){
		Node node=new Node(value);
		node.next=head;
		head=node;
	}
	public Node deleteHead(){
		Node node=this.head;
		this.head=node.next;
		
		return node ;
	}
	public void Display(){
		StringBuilder sb=new StringBuilder("[");
		for(Node pNode=this.head;pNode.next!=null;pNode=pNode.next){
			sb.append(pNode.element);
			if(pNode.next.next!=null)
				sb.append(",");
		}
		sb.append("]");
		System.out.println(sb.toString()); 
	}
	public Node find(T val){
		Node pre;
		for(Node pNode=this.head;pNode!=null;pNode=pNode.next){
			pre=pNode;
			if(pNode.element.equals(val)){
				return pre;
			}
		}
		return null;
	}
	public Node delete(T val){
		Node pre=head;Node pNode;
		for(pNode=this.head;pNode!=null;pNode=pNode.next){
			if(pNode.element.equals(val)){
				pre.next=pNode.next;
				break;
			}
			if(pNode.next==null)
				return null;
			pre=pNode;
		}
//		head=pre;
		return pNode;
	}
	
	public static void main(String [] args){
		MyLinkedList<Integer> linkList=new MyLinkedList<Integer>();
		linkList.insertHead(34);
		linkList.insertHead(23);
		linkList.insertHead(12);
		linkList.insertHead(0);
		linkList.insertHead(-1);
		linkList.Display();
		System.out.println(linkList.deleteHead().element);
		linkList.Display();
		
		 linkList.delete(12).display();
		 linkList.Display();
	}
}
