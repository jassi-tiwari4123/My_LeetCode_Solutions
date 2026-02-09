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
    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> ls=new ArrayList<>();
        // if(root==null){
        //     return ls;
        // }
        // ls.addAll(inorderTraversal(root.left));
        // ls.add(root.val);
        // ls.addAll(inorderTraversal(root.right));
        // return ls;

        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode cur=root;
        while(true){
            if(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            else{
                if(st.isEmpty()) break;
                cur=st.pop();
                res.add(cur.val);
                cur=cur.right;
            }
            
        }
        return res;
    }
}