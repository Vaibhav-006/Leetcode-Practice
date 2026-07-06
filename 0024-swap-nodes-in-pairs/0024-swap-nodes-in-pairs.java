/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode a=head;
        ListNode b= head.next;
        while(b.next!=null && b.next.next!=null){
            int num=a.val;
            a.val=b.val;
            b.val=num;
            a=a.next.next;
            b=b.next.next;
        }
        int num=a.val;
        a.val=b.val;
        b.val=num;
        return head;
        
    }
}