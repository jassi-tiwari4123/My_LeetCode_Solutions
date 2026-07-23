class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        boolean[] vis=new boolean[n];
        boolean[] check=new boolean[n];
        boolean[] pathVis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,pathVis,check,graph);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(check[i]){
                res.add(i);
            }
        }
        return res;
    }
    public boolean dfs(int src,boolean[] vis,boolean[] path,boolean[] check,int[][] graph){
        vis[src]=true;
        path[src]=true;
        check[src]=false;
        for(int x:graph[src]){
            if(!vis[x]){
                if(dfs(x,vis,path,check,graph)==true){
                    check[src]=false;
                    return true;
                }
            }
            else if(path[x]==true){
                check[src]=false;
                return true;
            }
        }
        path[src]=false;
        check[src]=true; 
        return false;
    }
}