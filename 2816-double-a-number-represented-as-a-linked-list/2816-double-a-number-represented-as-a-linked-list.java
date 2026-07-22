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
    public ListNode doubleIt(ListNode head) {
        boolean flag=false;
        ListNode newNode= new ListNode(1);
        if(head.val>=5){
            newNode.next=head;
            flag=true;
        }
        ListNode temp=head;
        while(temp!=null){
            temp.val= (temp.val*2)%10;
            if(temp.next!=null && temp.next.val>=5){
                temp.val+=1;
            }
            temp=temp.next;
        }
        if(flag){
            return newNode;
        }
        return head;
    }
}