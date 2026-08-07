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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy= new ListNode(0, head);
        ListNode grpPrev=dummy;

        while(true){
            ListNode kth=grpPrev;
            int val=k;
            while(kth!=null && val-->0){
                kth=kth.next;
            }
            if(kth==null){
                break;
            }
            ListNode grpNext= kth.next;
            ListNode prev= grpNext;
            ListNode curr=grpPrev.next;
            while(curr!=grpNext){
                ListNode temp= curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;

            }
        ListNode temp= grpPrev.next;
        grpPrev.next=kth;
        grpPrev=temp;
        

        }
        return dummy.next;
        
    }
}