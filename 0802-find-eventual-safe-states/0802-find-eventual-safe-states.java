// using topological sort
//reverse the graph then
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int[] indegree=new int[n];
        ArrayList<ArrayList<Integer>> rev=new ArrayList<>();
        for(int i=0;i<n;i++){
            rev.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int x:graph[i]){
                rev.get(x).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int cur=q.poll();
            res.add(cur);
            for(int x:rev.get(cur)){
                indegree[x]--;
                if(indegree[x]==0) q.add(x);
            }
        }
        Collections.sort(res);
        return res;
    }
}



//using dfs cycle detection concept
// class Solution {
//     public List<Integer> eventualSafeNodes(int[][] graph) {
//         int n=graph.length;
//         boolean[] vis=new boolean[n];
//         boolean[] check=new boolean[n];
//         boolean[] pathVis=new boolean[n];
//         for(int i=0;i<n;i++){
//             if(!vis[i]){
//                 dfs(i,vis,pathVis,check,graph);
//             }
//         }
//         List<Integer> res=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             if(check[i]){
//                 res.add(i);
//             }
//         }
//         return res;
//     }
//     public boolean dfs(int src,boolean[] vis,boolean[] path,boolean[] check,int[][] graph){
//         vis[src]=true;
//         path[src]=true;
//         check[src]=false;
//         for(int x:graph[src]){
//             if(!vis[x]){
//                 if(dfs(x,vis,path,check,graph)==true){
//                     check[src]=false;
//                     return true;
//                 }
//             }
//             else if(path[x]==true){
//                 check[src]=false;
//                 return true;
//             }
//         }
//         path[src]=false;
//         check[src]=true; 
//         return false;
//     }
// }