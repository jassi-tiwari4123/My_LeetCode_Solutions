class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length;
        int m=isWater[0].length;
        Queue<int[]> q=new LinkedList<>();
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    res[i][j]=0;
                    q.add(new int[]{i,j});
                }
                else{
                    res[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        int[] dirR={1,-1,0,0};
        int[] dirC={0,0,-1,1};
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            for(int i=0;i<4;i++){
                int nr=r+dirR[i];
                int nc=c+dirC[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    if(res[nr][nc]>res[r][c]+1){
                        res[nr][nc]=res[r][c]+1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return res;
    }
}