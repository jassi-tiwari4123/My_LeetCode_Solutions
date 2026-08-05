class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:invocations){
            int u=i[0];
            int v=i[1];
            adj.get(u).add(v);
        }
        boolean[] vis=new boolean[n];
        dfs(k,vis,adj);
        boolean canRemove=true;
        for(int[] i:invocations){
            int u=i[0];
            int v=i[1];
            if(!vis[u] && vis[v]) {
                canRemove=false;
                break;
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(canRemove){
                if(!vis[i]){
                    res.add(i);
                }
            }
            else{
                res.add(i);
            }
        }
        return res;
    }
    public void dfs(int src,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[src]=true;
        for(int x:adj.get(src)){
            if(!vis[x]){
                dfs(x,vis,adj);
            }
        }
    }
}