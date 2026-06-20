class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(fresh==0) return 0;
        int min=0;
        int[] dirR={1,-1,0,0};
        int[] dirC={0,0,1,-1};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                int row=cur[0];
                int col=cur[1];
                for(int j=0;j<4;j++){
                    int nr=row+dirR[j];
                    int nc=col+dirC[j];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            min++;
        }
        return fresh==0?min:-1;
    }
}