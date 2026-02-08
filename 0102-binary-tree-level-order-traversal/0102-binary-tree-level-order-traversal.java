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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty()){
            int size=(q.size());
            ArrayList<Integer> op=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                op.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            res.add(op);
        }
        return res;
    }
}


// List<List<Integer>> result=new ArrayList<>();
        // if(root==null){
        //     return result;
        // }
        
        // Queue<TreeNode> queue=new LinkedList<>();
        // queue.add(root);
        // while(!queue.isEmpty()){
        //     int size=queue.size();
        //     List<Integer> level=new ArrayList<>();
        //     for(int i=0;i<size;i++){
        //         TreeNode t=queue.poll();
        //         level.add(t.val);
        //         if(t.left!=null) queue.add(t.left);
        //         if(t.right!=null) queue.add(t.right);
        //     }
        //     result.add(level);
        // }
        // return result;


        //without using queue
    //     List<List<Integer>> result=new ArrayList<>();
    //     level(root,0,result);
    //     return result;
    // }
    // public void level(TreeNode node,int x,List<List<Integer>> result){
    //     if(node==null) return;
    //     if(result.size()==x){
    //         result.add(new ArrayList<>());
    //     }
    //     result.get(x).add(node.val);
    //     level(node.left,x+1,result);
    //     level(node.right,x+1,result);
    // }