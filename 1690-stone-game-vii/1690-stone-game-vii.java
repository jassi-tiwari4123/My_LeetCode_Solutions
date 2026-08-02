class Solution {
    int[][] dp;
    public int stoneGameVII(int[] stones) {
        int n=stones.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=stones[i];
        }
        return fxn(0,n-1,stones,sum);

    }
    public int fxn(int i,int j,int[] stones,int sum){
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int left=sum-stones[i]-fxn(i+1,j,stones,sum-stones[i]);
        int right=sum-stones[j]-fxn(i,j-1,stones,sum-stones[j]);
        return dp[i][j]=Math.max(left,right);
    }
}