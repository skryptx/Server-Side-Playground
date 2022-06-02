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
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode head = l1;
        while(l1.next != null && l2.next != null) {
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            l1.val = sum % 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        sum = l1.val + l2.val + carry;
        carry = sum / 10;
        l1.val = sum % 10;
        if(l1.next == null && l2.next == null) {
            if(carry > 0) {
                var newNode = new ListNode(carry);
                l1.next = newNode;
            }
        } else if(l1.next == null) {
            l1.next = l2.next;
            FinishRemainingList(l1.next, carry);
        } else {
            FinishRemainingList(l1.next, carry);
        }
        
        return head;
    }
    public void FinishRemainingList(ListNode l1, int carry) {
        while(l1.next != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            l1.val = sum % 10;
            l1 = l1.next;
        }
        int finalSum = l1.val + carry;
        carry = finalSum / 10;
        l1.val = finalSum % 10;
        if(carry > 0) {
            var newNode = new ListNode(carry);
            l1.next = newNode;
        }
    }
}