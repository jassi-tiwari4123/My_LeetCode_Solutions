class Solution {
    ArrayList<ArrayList<Integer>>adj;
    int[] res;
    int[] sub;
    int[] dp;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dp=new int[n];
        sub=new int[n];
        res=new int[n];
        dfs1(0,-1);
        res[0]=dp[0];
        dfs2(0,-1,n);
        return res;
    }
    public void dfs1(int node,int par){
        sub[node]=1;
        for(int x:adj.get(node)){
            if(x!=par){
                dfs1(x,node);
                sub[node]+=sub[x];
                dp[node]+=dp[x]+sub[x];
            }
        }
    }
    public void dfs2(int node,int par,int n){
        for(int x:adj.get(node)){
            if(x!=par){
                res[x]=res[node]-sub[x]+(n-sub[x]);
                dfs2(x,node,n);
            }
        }
    }
}