class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(nums1,nums2,n-1,m-1,dp);
    }
    public int fxn(int[] n1,int[] n2,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(n1[i]==n2[j]){
            dp[i][j]=1+fxn(n1,n2,i-1,j-1,dp);
        }
        else{
            dp[i][j]=Math.max(fxn(n1,n2,i-1,j,dp),fxn(n1,n2,i,j-1,dp));
        }
        return dp[i][j];
    }
}