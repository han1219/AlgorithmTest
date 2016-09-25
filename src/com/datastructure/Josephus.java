package com.datastructure;

public class Josephus {

	static class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val=val;
		}
	}
	public static Node createLink(int n){
		Node head=new Node(1);
		Node pNode=head;
		for(int i=1;i<n;){
			pNode.next=new Node(++i);
			pNode=pNode.next;
		}
		pNode.next=head;
		return head;
	}
	public static void solution(int n,int m){
		Node headNode=createLink(n);
		Node pNode=headNode;
		while(headNode!=headNode.next){
			for(int i=1;i<m-1;i++){//始终使head指向要删除节点的上一个节点，
				headNode=headNode.next;
			}
			System.out.println(headNode.next.val);
			pNode=headNode.next;
			headNode.next=pNode.next; //跳过要删除的节点
			headNode=headNode.next;// 移动head，使head指向已删除节点的下一个节点
		}
		System.out.println(headNode.val);
	}
	static int[] A;
	public static int solution2(int n,int m){
		A[0]=1;
		for(int i=2;i<=n;i++)  
	    {  
	        A[i]=(A[i-1]+m)%i;  
	    }  
		return A[n]+1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		solution(5, 3);
		int n=41;
		A=new int[n+1];
		for(int i=1;i<n;i++){
			A[i]=i+1;
		}
		A[n]=1;
		System.out.println(solution2(n, 3));
	}

}
