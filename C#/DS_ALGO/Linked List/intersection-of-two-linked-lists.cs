/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode GetIntersectionNode(ListNode headA, ListNode headB) {
        var hash = new Dictionary<ListNode, bool>();
        
        while(headA != null) {
            hash.Add(headA, true);
            headA = headA.next;
        }
        
        while(headB != null){
            if(hash.ContainsKey(headB)) {
                return headB;
            }
            headB = headB.next;
        }
               
        return null;
    }
}