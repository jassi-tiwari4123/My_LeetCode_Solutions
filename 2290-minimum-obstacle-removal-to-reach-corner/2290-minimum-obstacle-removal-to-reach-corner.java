// We use 0-1 BFS because each move has a weight of either 0 (empty cell)
// or 1 (obstacle). A normal BFS works only for unweighted graphs and
// finds the shortest path in terms of steps, not the minimum obstacle removals.

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
        int n=grid.length;
        int m=grid[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        dist[0][0]=0;
        pq.add(new Pair(0,0,0));
        int[] dirR={0,0,-1,1};
        int[] dirC={-1,1,0,0};
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int x=cur.row;
            int y=cur.col;
            int cost=cur.dist;
            if(x==n-1 && y==m-1) return dist[n-1][m-1];
            for(int i=0;i<4;i++){
                int nx=x+dirR[i];
                int ny=y+dirC[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    int newCost=cost+grid[nx][ny];
                    if(newCost<dist[nx][ny]){
                        dist[nx][ny]=newCost;
                        pq.add(new Pair(nx,ny,newCost));
                    }
                }
            }
        }
        return -1;
    }
}



//dijkstra
// class Solution {
//     class Pair{
//         int row;
//         int col;
//         int dist;
//         Pair(int r,int c,int d){
//             this.row=r;
//             this.col=c;
//             this.dist=d;
//         }
//     }
//     public int minimumObstacles(int[][] grid) {
//         int m=grid.length;
//         int n=grid[0].length;
//         int[] dr={0,1,0,-1};
//         int[] dc={1,0,-1,0};
//         int[][] dist=new int[m][n];
//         for(int i=0;i<m;i++){
//             Arrays.fill(dist[i],Integer.MAX_VALUE);
//         }
//         PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.dist,b.dist));
//         pq.add(new Pair(0,0,0));
//         dist[0][0]=0;
//         while(!pq.isEmpty()){
//             Pair cur=pq.poll();
//             int i=cur.row;
//             int j=cur.col;
//             int d=cur.dist;
//             if(i==m-1 && j==n-1) return d;
//             if(d>dist[i][j]) continue;
//             for(int k=0;k<4;k++){
//                 int nr=dr[k]+i;
//                 int nc=dc[k]+j;
//                 if(nr>=0 && nr<m && nc>=0 && nc<n){
//                     int newDis=d+grid[nr][nc];
//                     if(newDis<dist[nr][nc]){
//                         dist[nr][nc]=newDis;
//                         pq.add(new Pair(nr,nc,newDis));
//                     }
//                 }
//             }
//         }
//         return -1;
//     }
// }