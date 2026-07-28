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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ol= new ArrayList<>();
        if(root==null){
            return ol;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> il= new ArrayList<>();
            for(int i=0; i<n; i++){
                TreeNode temp= q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                il.add(temp.val);
            }
            if(level%2!=0){
                Collections.reverse(il);
            }
            ol.add(il);
            level++;
        }
        return ol;
        
    }
}