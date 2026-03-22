/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // in tree we cant move up ,only down.
        // so we will try to make tree undirected graph and find parent node relation for each node
        // later we will apple bfs for left,right,parent(upward move)
        HashMap<TreeNode,TreeNode> par=new HashMap<>();
        findParent(root,null,par);
        HashSet<TreeNode> vis=new HashSet<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        vis.add(target);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(level==k) break;
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null && !vis.contains(cur.left)){
                    q.add(cur.left);
                    vis.add(cur.left);
                }
                if(cur.right!=null && !vis.contains(cur.right)){
                    q.add(cur.right);
                    vis.add(cur.right);
                }
                if(par.get(cur)!=null && !vis.contains(par.get(cur))){
                    q.add(par.get(cur));
                    vis.add(par.get(cur));
                }
            }
            level++;
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }
        return res;
    }
    public void findParent(TreeNode root,TreeNode parent,HashMap<TreeNode,TreeNode> par){
        if(root==null) return;
        par.put(root,parent);
        findParent(root.left,root,par);
        findParent(root.right,root,par);
    }
}