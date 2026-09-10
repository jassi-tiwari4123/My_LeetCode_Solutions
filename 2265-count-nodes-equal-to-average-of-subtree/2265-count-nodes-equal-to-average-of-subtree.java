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
        int res=0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return res;
    }
    public int[] dfs(TreeNode root){
        if(root==null) return new int[]{0,0};
        int[] lSub=dfs(root.left);
        int[] rSub=dfs(root.right);
        int sum=root.val+lSub[0]+rSub[0];
        int cnt=1+lSub[1]+rSub[1];
        if(sum/cnt==root.val) res++;
        return new int[]{sum,cnt};
    }
}