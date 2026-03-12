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
    TreeMap<Integer,TreeMap<Integer,List<Integer>>> tm=new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(root,0,0);
        for(TreeMap<Integer,List<Integer>> map:tm.values()){
            List<Integer> part=new ArrayList<>();
            for(List<Integer> arr:map.values()){
                Collections.sort(arr);
                part.addAll(arr);
               
            }
            res.add(part);
        }
        return res;
    }
    public void dfs(TreeNode root,int row,int col){
        if(root==null) return;
        tm.putIfAbsent(col,new TreeMap<>());
        tm.get(col).putIfAbsent(row,new ArrayList<>());
        tm.get(col).get(row).add(root.val);
        dfs(root.left,row+1,col-1);
        dfs(root.right,row+1,col+1);
    }
}





















 

// class Solution {

//     TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> tm = new TreeMap<>();

//     public List<List<Integer>> verticalTraversal(TreeNode root) {
        
//         List<List<Integer>> res = new ArrayList<>();

//         dfs(root,0,0);

//         for(TreeMap<Integer,ArrayList<Integer>> rows : tm.values()){
//             List<Integer> list = new ArrayList<>();

//             for(ArrayList<Integer> arr : rows.values()){
//                 Collections.sort(arr);   // sort if same row and column
//                 list.addAll(arr);
//             }

//             res.add(list);
//         }

//         return res;
//     }

//     public void dfs(TreeNode node,int row,int col){
//         if(node == null) return;

//         tm.putIfAbsent(col,new TreeMap<>());
//         tm.get(col).putIfAbsent(row,new ArrayList<>());
//         tm.get(col).get(row).add(node.val);

//         dfs(node.left,row+1,col-1);
//         dfs(node.right,row+1,col+1);
//     }
// }