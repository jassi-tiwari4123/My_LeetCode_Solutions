class Solution {
    class Pair{
        int row;
        int col;
        int used;
        Pair(int r,int c,int u){
            this.row=r;
            this.col=c;
            this.used=u;
        }
    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n=grid.size();
        int m=grid.get(0).size();
        int[][] dist=new int[n][m];
        int[] dirR={0,0,-1,1};
        int[] dirC={-1,1,0,0};
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.used-b.used);
        dist[0][0]=grid.get(0).get(0);
        pq.add(new Pair(0,0,grid.get(0).get(0)));
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            int r=cur.row;
            int c=cur.col;
            int u=cur.used;
            if(r==n-1 && c==m-1) return u<health;
            if(u>dist[r][c]) continue;
            for(int i=0;i<4;i++){
                int nr=r+dirR[i];
                int nc=c+dirC[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int nUsed=u+grid.get(nr).get(nc);
                    if(nUsed>=health) continue;
                    if(nUsed<dist[nr][nc]){
                        dist[nr][nc]=nUsed;
                        pq.add(new Pair(nr,nc,nUsed));
                    }
                }
            }
        }
        return false;
    }
}