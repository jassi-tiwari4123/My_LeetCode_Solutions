class Solution {
    class Pair{
        int row;
        int col;
        int cost;
        Pair(int r,int c,int  cost){
            this.row=r;
            this.col=c;
            this.cost=cost;
        }
    }
    public int minCost(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] dirR={0,0,1,-1};
        int[] dirC={1,-1,0,0};
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        dist[0][0]=0;
        pq.add(new Pair(0,0,0));
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int r=cur.row;
            int c=cur.col;
            int d=cur.cost;
            if(r==n-1 && c==m-1) return d;
            if(d>dist[r][c]) continue;
            for(int i=1;i<=4;i++){
                int nr=r+dirR[i-1];
                int nc=c+dirC[i-1];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int newD=d+(grid[r][c]==i?0:1);
                    if(newD<dist[nr][nc]){
                        dist[nr][nc]=newD;
                        pq.add(new Pair(nr,nc,newD));
                    }
                }
            }
        }
        return -1;
    }
}




//brute
// class Solution {
//     int[] dirR={0,0,1,-1};
//     int[] dirC={1,-1,0,0};
//     int res=Integer.MAX_VALUE;
//     public int minCost(int[][] grid) {
//         // naive approach : try all possible paths then find minimum among them so applying dfs
//         int n=grid.length;
//         int m=grid[0].length;
//         boolean[][] vis=new boolean[n][m];
//         dfs(0,0,vis,grid,0); //row,col,vis,grid,cost
//         return res;
//     }
//     public void dfs(int r,int c,boolean[][] vis,int[][] grid,int cost){
//         if(cost>=res) return;
//         if(r==grid.length-1 && c==grid[0].length-1){
//             res=Math.min(res,cost);
//             return;
//         }
//         vis[r][c]=true;
//         for(int i=1;i<=4;i++){
//             int nr=r+dirR[i-1];
//             int nc=c+dirC[i-1];
//             if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && !vis[nr][nc]){
//                 int newCost=(grid[r][c]==i?0:1);
//                 dfs(nr,nc,vis,grid,cost+newCost);
//             }
//         }
//         vis[r][c]=false;
//     }
// }