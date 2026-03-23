class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        //guard=1
        //wall=2
        //free=3
        //brute((n*m)*g)
        int[][] grid=new int[m][n];
        for(int[] x:guards){
            grid[x[0]][x[1]]=1;
        }
        for(int[] w:walls){
            grid[w[0]][w[1]]=2;
        }
        int[] dirR={-1,1,0,0};
        int[] dirC={0,0,-1,1};
        for(int[] g:guards){
            for(int i=0;i<4;i++){
                int r=g[0]+dirR[i];
                int c=g[1]+dirC[i];
                while(r>=0 && r<m && c>=0 && c<n && grid[r][c]!=1 && grid[r][c]!=2){
                    grid[r][c]=3;
                    r+=dirR[i];
                    c+=dirC[i];
                }
            }
        }
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) res++;
            }
        }
        return res;
    }
}