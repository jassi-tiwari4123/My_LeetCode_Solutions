class Solution {
    class Pair{
        int row;
        int col;
        int dist;
        Pair(int r,int c,int d){
            this.row=r;
            this.col=c;
            this.dist=d;
        }
    }
    public int minimumObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        int[][] dist=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.dist,b.dist));
        pq.add(new Pair(0,0,0));
        dist[0][0]=0;
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int i=cur.row;
            int j=cur.col;
            int d=cur.dist;
            if(i==m-1 && j==n-1) return d;
            if(d>dist[i][j]) continue;
            for(int k=0;k<4;k++){
                int nr=dr[k]+i;
                int nc=dc[k]+j;
                if(nr>=0 && nr<m && nc>=0 && nc<n){
                    int newDis=d+grid[nr][nc];
                    if(newDis<dist[nr][nc]){
                        dist[nr][nc]=newDis;
                        pq.add(new Pair(nr,nc,newDis));
                    }
                }
            }
        }
        return -1;
    }
}