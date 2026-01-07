class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+2];
        arr[0]=1;
        arr[n+1]=1;
        for(int i=0;i<n;i++){
            arr[i+1]=nums[i];
        }
        int[][] dp=new int[n+2][n+2];
        for(int i=0;i<n+2;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(0,n+1,arr,dp);
    }
    public int fxn(int i,int j,int[] arr,int[][]dp){
        if(j-i<=1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int res=Integer.MIN_VALUE;
        for(int k=i+1;k<j;k++){
            int coins=arr[i]*arr[k]*arr[j]+fxn(i,k,arr,dp)+fxn(k,j,arr,dp);
            res=Math.max(res,coins);
        }
        return dp[i][j]=res;
        
    }
}