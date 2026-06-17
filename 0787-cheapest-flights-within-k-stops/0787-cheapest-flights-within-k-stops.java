class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //bfs
        // ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     adj.add(new ArrayList<>());
        // }
        // for(int[] f:flights){
        //     int u=f[0];
        //     int v=f[1];
        //     int price=f[2];
        //     adj.get(u).add(new int[]{v,price}); //dst,price
        // }
        // int[] dist=new int[n];
        // Arrays.fill(dist,Integer.MAX_VALUE);
        // dist[src]=0;
        // Queue<int[]> q=new LinkedList<>();
        // q.add(new int[]{src,0,0});//node, cost, stop
        // while(!q.isEmpty()){
        //     int[] cur=q.poll();
        //     int node=cur[0];
        //     int cost=cur[1];
        //     int stop=cur[2];
        //     if(stop>k) continue;
        //     for(int[] e:adj.get(node)){
        //         int next=e[0];
        //         int nextPr=e[1];
        //         int newCost=nextPr+cost;
        //         if(newCost<dist[next]){
        //             dist[next]=newCost;
        //             q.add(new int[]{next,newCost,stop+1});
        //         }
        //     }}
        // return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];


        //dijkstra
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
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        int[][] dist=new int[n][k+2];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        //cost,node,stop
        pq.add(new int[]{0,src,0});
        dist[src][0]=0;
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int cost=cur[0];
            int node=cur[1];
            int stop=cur[2];
            if(node==dst) return cost;
            if(stop>k) continue;
            for(int[] e:adj.get(node)){
                int next=e[0];
                int pri=e[1];
                int newCost=pri+cost;
                if(newCost<dist[next][stop+1]){
                    dist[next][stop+1]=newCost;
                    pq.add(new int[]{newCost,next,stop+1});
                }
            }
        }
        return -1;
    }
}