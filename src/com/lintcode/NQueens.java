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
	        ListNode cur=head.next;//�ӵڶ����ڵ㿪ʼ����  
	        ListNode pre=head;//�ź�������һ���ڵ�  
	        while(cur!=null)  
	        {  
	            if(cur.val<pre.val)  
	            {  
	                ListNode nextNode=cur.next;//������һ����Ҫ�����Ľڵ�  
	                  
	                //Ѱ�Ҳ���ĺ���λ��  
	                ListNode cur2=fakeNode.next;  
	                ListNode temp=fakeNode;//��¼cur2ǰ��һ���ڵ�  
	                while(cur.val>cur2.val&&cur2!=pre)  
	                {  
	                    temp=cur2;  
	                cur2=cur2.next;  
	                }  
	                //���в���  
	                temp.next=cur;  
	                cur.next=cur2;  
	                pre.next=nextNode;  
	                //����������һ���ڵ�  
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
