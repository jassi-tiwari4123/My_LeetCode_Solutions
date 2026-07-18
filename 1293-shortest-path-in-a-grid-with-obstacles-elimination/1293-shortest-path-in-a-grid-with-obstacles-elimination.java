class Solution {
    class Pair{
        int row;
        int col;
        int obs;
        Pair(int r,int c,int o){
            this.row=r;
            this.col=c;
            this.obs=o;
        }
    }
    public int shortestPath(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[] dirR={0,0,1,-1};
        int[] dirC={-1,1,0,0};
        boolean[][][] vis=new boolean[n][m][k+1];
        Queue<Pair> pq=new LinkedList<>();
        vis[0][0][0]=true;
        pq.add(new Pair(0,0,0)); //row,col,obstacle
        int step=0;
        while(!pq.isEmpty()){
            int size=pq.size();
            while(size-->0){
                Pair cur=pq.poll();
                int r=cur.row;
                int c=cur.col;
                int o=cur.obs;
                if(r==n-1 && c==m-1) return step;
                for(int i=0;i<4;i++){
                    int nr=r+dirR[i];
                    int nc=c+dirC[i];
                    if(nr>=0 && nr<n && nc>=0 && nc<m){
                        int newObs=o+grid[nr][nc];
                        if (newObs>k)continue;
                        if(!vis[nr][nc][newObs]){
                            vis[nr][nc][newObs]=true;
                            pq.add(new Pair(nr,nc,newObs));
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}


