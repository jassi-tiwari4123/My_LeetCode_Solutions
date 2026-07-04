class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] r:roads){
            int u=r[0];
            int v=r[1];
            int w=r[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        
        boolean[] vis=new boolean[n+1];
        return dfs(1,adj,vis);
    }
    public int dfs(int src,ArrayList<ArrayList<int[]>> adj,boolean[] vis){
        vis[src]=true;
        int ans=Integer.MAX_VALUE;
        for(int[] a:adj.get(src)){
            int node=a[0];
            int dist=a[1];
            ans=Math.min(ans,dist);
            if(!vis[node]){
                ans=Math.min(ans,dfs(node,adj,vis));
            }
        }
        return ans;
    }
}