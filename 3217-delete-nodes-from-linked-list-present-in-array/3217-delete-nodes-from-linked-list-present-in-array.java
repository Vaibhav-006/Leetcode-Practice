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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null){
            return null;
        }
        Set<Integer> map= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            map.add(nums[i]);
        }
        ListNode dummy= new ListNode(0);
        ListNode curr= dummy;
        ListNode temp=head;
        while(temp!=null){
            if(!map.contains(temp.val)){
                curr.next=new ListNode(temp.val);
                curr=curr.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}