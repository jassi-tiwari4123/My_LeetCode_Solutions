class Solution {
    public int minDistance(String word1, String word2) {
        //memo
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(n-1,m-1,word1,word2,dp);
    }
    public int fxn(int i,int j,String s,String t,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=fxn(i-1,j-1,s,t,dp);
        }
        int insert=fxn(i,j-1,s,t,dp);
        int del=fxn(i-1,j,s,t,dp);
        int replace=fxn(i-1,j-1,s,t,dp);
        return dp[i][j]=1+Math.min(insert,Math.min(del,replace));
    }
}
