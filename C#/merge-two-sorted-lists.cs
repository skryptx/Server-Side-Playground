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
    public ListNode MergeTwoLists(ListNode list1, ListNode list2) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode head, remaining, temp;
        if(list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if(list1.val > list2.val) {
	        stack.Push(list2);
            list2 = list2.next;
        } else {
        	stack.Push(list1);
            list1 = list1.next;
        }
        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                stack.Push(list2);
                list2 = list2.next;
            } else {
                stack.Push(list1);
                list1 = list1.next;
            }	
        }
        if(list2 == null) {
            remaining=list1;
        } else {
            remaining=list2;
        }

        while(remaining!=null) {
            stack.Push(remaining);
            remaining=remaining.next; 
        }
        temp = stack.Pop();
        
        while(stack.Count !=0){
            head=temp;
            temp=stack.Pop();
            temp.next =head;
        }

        head=temp;
        return head;

    }

}