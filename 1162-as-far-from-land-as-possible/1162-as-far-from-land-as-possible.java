class Solution {
    public int maxDistance(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.size()==n*m || q.isEmpty()) return -1;
        int dist=0;
        int[] dirR={0,0,-1,1};
        int[] dirC={-1,1,0,0};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                int r=cur[0];
                int c=cur[1];
                for(int k=0;k<4;k++){
                    int nr=r+dirR[k];
                    int nc=c+dirC[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==0){
                        grid[nr][nc]=1;
                        q.add(new int[]{nr,nc});
                    }
                }
               
            }
             dist++;
        }
        return dist-1;
    }
}