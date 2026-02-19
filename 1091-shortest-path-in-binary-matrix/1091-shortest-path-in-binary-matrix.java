class Solution {
    class Pair{
        int r;
        int c;
        int dist;
        Pair(int row,int col,int d){
            this.r=row;
            this.c=col;
            this.dist=d;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=1;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.dist,b.dist));
        int[] dr={0,0,1,-1,-1,1,-1,1};
        int[] dc={1,-1,0,0,1,1,-1,-1};
        pq.add(new Pair(0,0,1));
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int i=cur.r;
            int j=cur.c;
            int d=cur.dist;
            if(i==n-1 && j==n-1){
                return d;
            }
            if(d>dist[i][j]) continue;
            for(int k=0;k<8;k++) {
                int nr=i+dr[k];
                int nc=j+dc[k];
                if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0){
                    int newDist=d+1;
                    if(newDist<dist[nr][nc]) {
                        dist[nr][nc]=newDist;
                        pq.add(new Pair(nr,nc,newDist));
                    }
                }
            }
        }
        return -1;
    }
}