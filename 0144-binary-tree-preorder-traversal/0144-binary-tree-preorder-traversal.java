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
    public List<Integer> preorderTraversal(TreeNode root) {
        // List<Integer> ls=new ArrayList<>();
        // if(root==null){
        //     return ls;
        // }
        // ls.add(root.val);
        // ls.addAll(preorderTraversal(root.left));
        // ls.addAll(preorderTraversal(root.right));
        // return ls;

        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> st=new Stack<>();
        TreeNode cur=root;
        st.push(cur);
        while(!st.isEmpty()){
            cur=st.pop();
            res.add(cur.val);
            if(cur.right!=null) st.push(cur.right);
            if(cur.left!=null) st.push(cur.left);
        }
        return res;

    }
}