class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(n==1) return true;
        for(int i=0;i<n;i++){
            res.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            res.get(u).add(v);
            res.get(v).add(u);
        }
        boolean[] vis=new boolean[n];
        return dfs(source,destination,vis,res);
        
    }
    public boolean dfs(int s,int d,boolean[]vis,ArrayList<ArrayList<Integer>> res){
        if(s==d) return true;
        vis[s]=true;
        for(int x:res.get(s)){
            if(!vis[x]){
                if(dfs(x,d,vis,res)){
                    return true;
                }
            }
        }
        return false;
    }
}