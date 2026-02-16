class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:dislikes){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] color=new int[n+1];
        Arrays.fill(color,-1);
        for(int i=1;i<=n;i++){
            if(color[i]!=-1) continue;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            color[i]=0;
            while(!q.isEmpty()) {
                int node=q.poll();
                for(int x:adj.get(node)) {
                    if(color[x]==-1) {
                        color[x]=1-color[node];
                        q.add(x);
                    }
                    else if(color[x]==color[node]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
