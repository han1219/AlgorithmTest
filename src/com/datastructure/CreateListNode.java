package com.datastructure;


public class CreateListNode {
	public static void main(String[] args){
		int [] tmp={1,4,3,5};
		ListNode node=arrayToListNode(tmp);
		
	}
	public static void NodetoString(ListNode node){
		for(;node!=null;){
			System.out.print(node.val+" ");
			node=node.next;
		}
	}
	public static class ListNode {
		int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public static ListNode arrayToListNode(int[] array){
		ListNode node=new ListNode(array[0]);
		ListNode head=node;
		for(int i=1;i<array.length;i++){
			ListNode tmp=new ListNode(array[i]);
			node.next=tmp;
			node=node.next;
		}
		return head;
	}
}
