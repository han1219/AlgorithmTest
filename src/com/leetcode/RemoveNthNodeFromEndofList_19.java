package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.datastructure.CreateListNode;
import com.datastructure.CreateListNode.ListNode;
public class RemoveNthNodeFromEndofList_19 {
	public static void main(String[] args) {
		
		RemoveNthNodeFromEndofList_19 rEndofList = new RemoveNthNodeFromEndofList_19();
		ListNode head = CreateListNode.arrayToListNode(new int[] { 1 });
		CreateListNode.NodetoString(rEndofList.removeNthFromEnd(head, 1));
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pre = head;
		ListNode next = head;
		int len = 0;
		while (next != null) {
			len++;
			next = next.next;
		}
		int count = 0;
		next = head;
		while (next != null) {
			pre = next;
			if (count == (len - n)) {
				if (count == 0) {
					head = next.next;
				} else {
					pre.next = next.next;

				}
				return head;
			}
			count++;

			next = next.next;
		}
		return head;
	}
}
