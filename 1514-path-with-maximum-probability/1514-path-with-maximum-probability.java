class Solution {
    class Pair{
        int node;
        double prob;
        Pair(int node,double prob){
            this.node=node;
            this.prob=prob;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double w=succProb[i];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        double[] dist=new double[n];
        Arrays.fill(dist,0.0);
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Double.compare(b.prob,a.prob));
        dist[start]=1.0;
        pq.add(new Pair(start,dist[start]));
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int node=cur.node;
            double prob=cur.prob;
            if(prob<dist[node]) continue;
            for(Pair x:adj.get(node)){
                int newNode=x.node;
                double newProb=x.prob;
                if(dist[newNode]<dist[node]*newProb){
                    dist[newNode]=dist[node]*newProb;
                    pq.add(new Pair(newNode,dist[newNode]));
                }
            }
        }
        return dist[end];

    }
}