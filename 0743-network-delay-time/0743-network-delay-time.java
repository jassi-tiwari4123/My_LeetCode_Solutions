class Solution {
    class Pair{
        int node;
        int weight;
        Pair(int node,int weight){
            this.node=node;
            this.weight=weight;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] t:times){
            int u=t[0];
            int v=t[1];
            int w=t[2];
            adj.get(u).add(new Pair(v,w));
        }
        int src=k;
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.weight, b.weight));
        dist[src]=0;
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int node=cur.node;
            int d=cur.weight;
            if(d>dist[node]) continue;
            for(Pair x:adj.get(node)){
                int newNode=x.node;
                int newDis=x.weight;
                if(dist[newNode]>dist[node]+newDis){
                    dist[newNode]=dist[node]+newDis;
                    pq.add(new Pair(newNode,dist[newNode]));
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,dist[i]);
        }
        return max;
    }
}