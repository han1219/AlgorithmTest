package com.lintcode;

import java.awt.HeadlessException;

public class NQueens {
	static class   ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	 public static ListNode insertionSortList(ListNode head) {
	        // write your code here
		 
		 ListNode fakeNode=new ListNode(-1);  
	        fakeNode.next=head;  
	        if(head==null)  
	            return null;  
	        ListNode cur=head.next;//从第二个节点开始遍历  
	        ListNode pre=head;//排好序的最后一个节点  
	        while(cur!=null)  
	        {  
	            if(cur.val<pre.val)  
	            {  
	                ListNode nextNode=cur.next;//保存下一个需要遍历的节点  
	                  
	                //寻找插入的合适位置  
	                ListNode cur2=fakeNode.next;  
	                ListNode temp=fakeNode;//记录cur2前面一个节点  
	                while(cur.val>cur2.val&&cur2!=pre)  
	                {  
	                    temp=cur2;  
	                cur2=cur2.next;  
	                }  
	                //进行插入  
	                temp.next=cur;  
	                cur.next=cur2;  
	                pre.next=nextNode;  
	                //继续遍历下一个节点  
	                cur=nextNode;  
	            }  
	            else {  
	                pre=cur;  
	                cur=cur.next;  
	            }  
	              
	        }     
	        return fakeNode.next;  
	  }
	 public static void desplay(ListNode node){
		 ListNode p=node;
		 System.out.print("[");
		 while(true){
			 System.out.print(p.val);
			 if(p.next!=null)
			 {	
				 p=p.next;
				 System.out.print(",");
			 }
			 else {
				 System.out.print("]");
				break;
			}
		 }
	 }
	 public static void main(String[] args){
		 ListNode node=new ListNode(1);
		 ListNode node2=new ListNode(3);
		 ListNode node3=new ListNode(2);
		 ListNode node4=new ListNode(0);
		 
		 node.next=node2;
		 node2.next=node3;
		 node3.next=node4;
		 desplay(node);
		ListNode result= insertionSortList(node);
		desplay(result);
	 }
}
