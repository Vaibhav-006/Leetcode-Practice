/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        Integer min1= null;
        Integer min2= null;
        while(!q.isEmpty()){
            TreeNode temp= q.poll();
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(min1!=null && temp.val==min1){
                continue;
            }
            if(min1==null || temp.val<min1){
                min2=min1;
                min1=temp.val;

            }
            else if(min2==null || (temp.val<min2 && temp.val!=min1)){
                min2=temp.val;
            }
            
        }
        return (min2==null) ? -1 : min2;
    }
}