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
    public int rob(TreeNode root) {
        int[] res=fxn(root);
        return Math.max(res[0],res[1]);
    }
    public int[] fxn(TreeNode root){
        if(root==null) return new int[]{0,0};
        int[] left=fxn(root.left);
        int[] right=fxn(root.right);
        int[] res=new int[2]; //zero for rob & one for not rob
        res[0]=root.val+left[1]+right[1];
        res[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return res;
    }
}