class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] dirR={1,-1,0,0};
        int[] dirC={0,0,-1,1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean peak=true;
                for(int k=0;k<4;k++){
                    int nr=i+dirR[k];
                    int nc=j+dirC[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m){
                        if(mat[i][j]<=mat[nr][nc]){
                            peak=false;
                            break;
                        }
                    }
                }
                // if(i>0 && mat[i][j]<=mat[i-1][j]) peak=false; 
                // if(j>0 && mat[i][j]<=mat[i][j-1]) peak=false; 
                // if(i<n-1 && mat[i][j]<=mat[i+1][j]) peak=false; 
                // if(j<m-1 && mat[i][j]<=mat[i][j+1]) peak=false; 
                if(peak) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}