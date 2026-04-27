class Solution {
    public boolean hasValidPath(int[][] grid) {
        //do it next week again
        int[][][] hm={{},{{0,-1},{0,1}},
        {{-1,0},{1,0}},{{0,-1},{1,0}},{{0,1},{1,0}},
        {{0,-1},{-1,0}},{{0,1},{-1,0}}};
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0});
        vis[0][0]=true;
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0]; 
            int c=curr[1];
            if(r==n-1 && c==m-1) return true;
            int type=grid[r][c];
            for(int[] d:hm[type]){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr<0 || nc<0 || nr>=n || nc>=m || vis[nr][nc]) continue;
                int nextType=grid[nr][nc];
                for(int[] back : hm[nextType]){
                    if(nr+back[0]==r && nc+back[1]==c){
                        vis[nr][nc]=true;
                        q.add(new int[]{nr,nc});
                        break;
                    }
                }
            }
        }
        return false;
    }
}