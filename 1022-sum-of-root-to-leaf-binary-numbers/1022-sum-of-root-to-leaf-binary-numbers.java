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
    public int sumRootToLeaf(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode root,int Cursum){
        if(root==null) return 0;
        Cursum=Cursum*2+root.val;
        if(root.left==null && root.right==null) return Cursum;
        return sum(root.left,Cursum)+sum(root.right,Cursum);
    }
}