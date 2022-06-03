/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode start = head;
        head = RecursiveReverse(head);
        start.next = null;
        return head;
    }
    
    public ListNode RecursiveReverse(ListNode head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) 
        {
            return head;
        }
        ListNode temp = RecursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
        
    public ListNode IterativeReverse(ListNode head) {
        ListNode first = head.next;
        ListNode start = head;
        ListNode temp;
        while(first.next != null) {
            temp = first.next;
            first.next = head;
            head = first;
            first = temp;
        }

        first.next = head;
        head = first;
        start.next = null;
        return head;
    }
}