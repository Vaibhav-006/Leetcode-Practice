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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st= new Stack<>();
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }


        int[] arr= new int[size];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        int[] newarr= new int[size];
        for(i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
            st.pop();
            }
            if(st.isEmpty()){
                newarr[i]=0;
            }
            else{
                newarr[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return newarr;
    }
}