class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] f:flights){
            int u=f[0];
            int v=f[1];
            int price=f[2];
            adj.get(u).add(new int[]{v,price});
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{src,0,0});
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int node=cur[0];
            int cost=cur[1];
            int stop=cur[2];
            if(stop>k) continue;
            for(int[] e:adj.get(node)){
                int next=e[0];
                int nextPr=e[1];
                int newCost=nextPr+cost;
                if(newCost<dist[next]){
                    dist[next]=newCost;
                    q.add(new int[]{next,newCost,stop+1});
                }
            }
        }
        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }
}