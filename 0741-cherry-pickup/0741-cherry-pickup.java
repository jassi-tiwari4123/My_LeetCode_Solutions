class Solution {
    int n;
    int[][][] dp;
    public int cherryPickup(int[][] grid) {
        n=grid.length;
        dp=new int[n][n][n];
        for (int[][]e: dp) {
            for (int[] row:e) {
                Arrays.fill(row,Integer.MIN_VALUE);
            }
        }
        int ans=fxn(0,0,0,grid);
        return Math.max(0,ans);
    }

    private int fxn(int r1,int c1,int r2,int[][] grid) {
        int c2=r1+c1-r2;
        if (r1>=n || c1>=n || r2>=n || c2>=n ||
            grid[r1][c1]==-1 || grid[r2][c2]==-1) {
            return -1000000;
        }
        if (r1==n-1 && c1==n-1) {
            return grid[r1][c1];
        }
        if (dp[r1][c1][r2]!=Integer.MIN_VALUE) {
            return dp[r1][c1][r2];
        }
        int cherries=0;
        if (r1==r2 && c1==c2) {
            cherries+=grid[r1][c1];
        } 
        else {
            cherries+=grid[r1][c1]+grid[r2][c2];
        }
        int bestNext=Math.max(Math.max(fxn(r1+1,c1,r2+1,grid),fxn(r1,c1+1,r2,grid)),Math.max(fxn(r1+1,c1,r2,grid),fxn(r1,c1+1,r2+1,grid)));
        cherries+=bestNext;
        return dp[r1][c1][r2]=cherries;
    }
}