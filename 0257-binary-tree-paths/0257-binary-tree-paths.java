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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root==null) return res;
        dfs(root,"",res);
        return res;
    }
    public void dfs(TreeNode root,String op,List<String> res){
        op+=root.val;
        if(root.left==null && root.right==null){
            res.add(op);
            return;
        }
        if(root.left!=null){
            dfs(root.left,op+"->",res);
        }
        if(root.right!=null){
            dfs(root.right,op+"->",res);
        }
    }
}