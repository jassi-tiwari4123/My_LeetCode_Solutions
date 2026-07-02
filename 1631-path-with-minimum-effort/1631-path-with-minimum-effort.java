class Solution {
    class Pair{
        int cost;
        int r;
        int c;
        Pair(int r,int c,int cst){
            this.cost=cst;
            this.r=r;
            this.c=c;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new Pair(0,0,0));
        dist[0][0]=0;
        int[] dirR={-1,1,0,0};
        int[] dirC={0,0,-1,1};
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int row=cur.r;
            int col=cur.c;
            int cos=cur.cost;
            if(row==n-1 && col==m-1) return cos;
            for(int i=0;i<4;i++){
                int nr=row+dirR[i];
                int nc=col+dirC[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int newCost=Math.max(cos,Math.abs(heights[row][col]-heights[nr][nc]));
                    if(newCost<dist[nr][nc]){
                        dist[nr][nc]=newCost;
                        pq.add(new Pair(nr,nc,newCost));
                    }
                }
            }
        }
        return 0;
    }
}