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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> isNodeCreated=new HashMap<>();
        HashSet<Integer> isChild=new HashSet<>();
        for(int[] d:descriptions){
            int parent=d[0];
            int child=d[1];
            int isLeft=d[2];
            isNodeCreated.putIfAbsent(parent,new TreeNode(parent));
            isNodeCreated.putIfAbsent(child,new TreeNode(child));
            TreeNode parentN=isNodeCreated.get(parent);
            TreeNode childN=isNodeCreated.get(child);
            if(isLeft==1){
                parentN.left=childN;
            }
            else{
                parentN.right=childN;
            }
            isChild.add(child);
        }
        for(int[] d:descriptions){
            if(!isChild.contains(d[0])){
                return isNodeCreated.get(d[0]);
            }
        }
        return null;
    }
}